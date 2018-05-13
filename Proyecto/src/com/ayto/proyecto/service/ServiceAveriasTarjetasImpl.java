package com.ayto.proyecto.service;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayto.proyecto.dao.AveriasTarjetasDAO;
import com.ayto.proyecto.modelo.AveriasTarjetas;

@Service
public class ServiceAveriasTarjetasImpl implements ServiceAveriasTarjetas{
	
	
	@Autowired
	AveriasTarjetasDAO averiasTarjetasDAO;


	@Override
	public boolean insertarAveriasTarjetas(AveriasTarjetas avt) {
		try {
			averiasTarjetasDAO.insertarAveriasTarjetas(avt);
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar Averias Tarjetas!<br/>"+e.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;

		
	}

	@Override
	public boolean borrarAveriasTarjetas(AveriasTarjetas avt) {
		try {
			averiasTarjetasDAO.borrarAveriasTarjetas(avt);
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar Averias Tarjetas!<br/>"+e.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;

		
	}

	@Override
	public boolean modificarAveriasTarjetas(AveriasTarjetas avt) {
		try {
			averiasTarjetasDAO.modificarAveriasTarjetas(avt);
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar Averias Tarjetas!<br/>"+e.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;

		
	}

	
	public AveriasTarjetas detalleAveriasTarjetas(int idaveriaTarjeta) {
try {
			
			return averiasTarjetasDAO.detalleAveriasTarjetas(idaveriaTarjeta);
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al mostrar  el detalle Averia tarjeta!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
			return null;
	}

	@Override
	public List<AveriasTarjetas> listarAveriasTarjetas() {
try {
			
			return averiasTarjetasDAO.listarAveriasTarjetas();
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar tarjetas!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
			return null;

	}
}
