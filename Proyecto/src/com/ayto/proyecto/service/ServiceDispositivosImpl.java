package com.ayto.proyecto.service;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayto.proyecto.dao.DispositivosDAO;
import com.ayto.proyecto.modelo.Dispositivos;
import com.ayto.proyecto.modelo.ModelosDispositivos;

@Service
public class ServiceDispositivosImpl implements ServiceDispositivos{
	
	
	@Autowired
	DispositivosDAO dispositivosDAO;

	@Override
	public boolean insertarDispositivos(Dispositivos disp) {
		try {
			dispositivosDAO.insertarDispositivos(disp);
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar dispositivos!<br/>"+e.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarDispositivos(Dispositivos disp) {
try {
			dispositivosDAO.modificarDispositivos(disp);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage( "Se ha modificado con �xito",""));
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar dispositivos!<br/>"+e.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarDispositivos(Dispositivos disp) {
		try {
			dispositivosDAO.borrarDispositivos(disp);
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar dispositivos!<br/>"+e.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}
		
		

	@Override
	public List<Dispositivos> listadoDispositivos() {
try {
			
			return dispositivosDAO.listadoDispositivos();
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar dispositivos!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
			return null;

	
	}

	@Override
	public Dispositivos detalleDispositivos(int idDispositivo) {
try {
			
			return dispositivosDAO.detalleDispositivos(idDispositivo);
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar Dispositivos!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
			return null;

	
	}

	@Override
	public boolean insertarModelosDisositivos(ModelosDispositivos mdisp) {
		try {
			dispositivosDAO.insertarModelosDisositivos(mdisp);
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar Modelos_Dispositivos!<br/>"+e.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarModelosDisositivos(ModelosDispositivos mdisp) {
try {
			dispositivosDAO.modificarModelosDisositivos(mdisp);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage( "Se ha modificado con �xito",""));
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar Modelos_Dispositivos!<br/>"+e.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarModelosDisositivos(ModelosDispositivos mdisp) {
try {
			dispositivosDAO.borrarModelosDisositivos(mdisp);
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar Modelos_Dispositivos!<br/>"+e.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public List<ModelosDispositivos> listadoModelosDispositivos() {
try {
			
			return dispositivosDAO.listadoModelosDispositivos();
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar Modelos_Dispositivos!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
			return null;

	
	}

	@Override
	public ModelosDispositivos detalleModelosDispositivos(int idModeloDispositivo) {
try {
			
			return dispositivosDAO.detalleModelosDispositivos(idModeloDispositivo);
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar Modelos_Dispositivos!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
			return null;

	}

}
