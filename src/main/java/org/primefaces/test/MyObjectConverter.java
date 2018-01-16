package org.primefaces.test;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 */
@FacesConverter(forClass = MyObject.class)
public class MyObjectConverter
    implements Converter
{

    @Override
    public Object getAsObject(FacesContext pContext, UIComponent pComponent, String pValue)
    {
        // no op
        return null;
    }

    @Override
    public String getAsString(FacesContext pContext, UIComponent pComponent, Object pValue)
    {
        return ((MyObject) pValue).getField2();
    }

}
