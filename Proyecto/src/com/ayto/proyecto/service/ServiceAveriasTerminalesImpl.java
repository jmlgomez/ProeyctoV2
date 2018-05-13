package com.ayto.proyecto.service;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;


import com.ayto.proyecto.dao.AveriasTerminalesDAO;
import com.ayto.proyecto.modelo.AveriasTerminales;

public class ServiceAveriasTerminalesImpl implements ServiceAveriasTerminales {
	
	@Autowired
	AveriasTerminalesDAO averiasterminalesDAO;

	@Override
	public boolean  insertarAveriasTerminales(AveriasTerminales at) {
		try {
			averiasterminalesDAO.insertarAveriasTerminales(at);
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar Averias Terminales!<br/>"+e.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean  borrarAveriasTerminales(AveriasTerminales at) {
try {
			averiasterminalesDAO.borrarAveriasTerminales(at);
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar Averias Terminales!<br/>"+e.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarAveriasTerminales(AveriasTerminales at) {
try {
			averiasterminalesDAO.modificarAveriasTerminales(at);
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar Averias Terminales!<br/>"+e.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public AveriasTerminales detalleAveriasTerminales(int idaveriasTerminal) {
try {
			
			return averiasterminalesDAO.detalleAveriasTerminales(idaveriasTerminal);
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar Averias Terminales!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
			return null;

	}

	@Override
	public List<AveriasTerminales> listarAveriasTerminales() {
try {
			
			return averiasterminalesDAO.listarAveriasTerminales();
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar averias Terminales!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
			return null;

	
	}

}
