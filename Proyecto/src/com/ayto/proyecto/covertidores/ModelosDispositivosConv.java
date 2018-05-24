package com.ayto.proyecto.covertidores;

import java.util.ArrayList;

import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.ayto.proyecto.modelo.ModelosDispositivos;

@FacesConverter(value="modelosDispositivosConv")
public class ModelosDispositivosConv implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		 ValueExpression vex =
				 arg0.getApplication().getExpressionFactory()
	                        .createValueExpression(arg0.getELContext(),
	                                "#{modelosDispositivos}", ModelosDispositivos.class);

		 @SuppressWarnings("unchecked")
		ModelosDispositivos objeto = ((ArrayList<ModelosDispositivos>)vex.getValue(arg0.getELContext())).get(0);
		 objeto.setIdModeloDispositivo(Integer.valueOf(arg2));
		return objeto;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		
		return ((ModelosDispositivos)arg2).getIdModeloDispositivo().toString();
	}

}
