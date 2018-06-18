package com.ayto.proyecto.service;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayto.proyecto.dao.EntregasDAO;
import com.ayto.proyecto.modelo.Entregas;
import com.ayto.proyecto.modelo.Operadores;
@Service
public class ServiceEntregasImpl implements ServiceEntregas{
	
	@Autowired
	EntregasDAO entregasDAO;
	

	@Override
	public boolean insertarEntregas(Entregas e) {
		try {
			entregasDAO.insertarEntregas(e);
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar entregas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarEntregas(Entregas e) {
		try {
			entregasDAO.borrarEntregas(e);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage( "Se ha borrado con éxito",""));
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar entregas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarEntregas(Entregas e) {
		try {
			entregasDAO.modificarEntregas(e);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage( "Se ha modificado con éxito",""));
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar entregas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public Entregas detalleEntregas(int idEntrega) {
try {
			
			return entregasDAO.detalleEntregas(idEntrega);
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar entregas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public List<Entregas> listarEntregas() {
try {
			
			return entregasDAO.listarEntregas();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar entregas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public boolean insertarOperadores(Operadores o) {
		try {
			entregasDAO.insertarOperadores(o);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage( "Se ha modificado con éxito",""));
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar Operadores!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarOperadores(Operadores o) {
		try {
			entregasDAO.modificarOperadores(o);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage( "Se ha modificado con éxito",""));
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar Operadores!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarOperadores(Operadores o) {
		try {
			entregasDAO.borrarOperadores(o);
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar operadores!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public List<Operadores> listadoOperadores() {
		try {
			
			return entregasDAO.listadoOperadores();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar Operadores!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
		
	}

	@Override
	public Operadores detalleOperadores(int idOperador) {
try {
			
			return entregasDAO.detalleOperadores(idOperador);
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar Operadores!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

}
