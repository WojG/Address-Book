/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook.app.main;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 * @author Woj G
 */
public abstract class AbstractController implements PropertyChangeListener
{
    private final ArrayList<AbstractView> registeredViews;
    private final ArrayList<AbstractModel> registeredModels;
    
    public AbstractController()
    {
        registeredViews = new ArrayList();
        registeredModels = new ArrayList();
    }
        
    public void addModel(AbstractModel model)
    {
        registeredModels.add(model);
        model.addPropertyChangeListener(this);
    }

    public void removeModel(AbstractModel model)
    {
        registeredModels.remove(model);
        model.removePropertyChangeListener(this);
    }

    public void addView(AbstractView view)
    {
        registeredViews.add(view);
    }

    public void removeView(AbstractView view)
    {
        registeredViews.remove(view);
    }   
               
    @Override
    public void propertyChange(PropertyChangeEvent evt)
    {
        for (AbstractView view : registeredViews)
        {
            view.modelPropertyChange(evt);
        }
    }

    protected void setModelProperty(String propertyName, Object newVal)
    {
        for (AbstractModel model : registeredModels)
        {
            try
            {
                Method method = model.getClass().getMethod("set" + propertyName, new Class[]
                {
                    newVal.getClass()
                });
                method.invoke(model, newVal);
            } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex)
            {
                System.err.println("Error: " + ex.getMessage());
            }
        }
    }
}
