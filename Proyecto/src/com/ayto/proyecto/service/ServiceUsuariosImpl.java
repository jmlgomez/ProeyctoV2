package com.ayto.proyecto.service;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayto.proyecto.dao.UsuariosDAO;
import com.ayto.proyecto.modelo.DepartamentosAyto;
import com.ayto.proyecto.modelo.Usuarios;


@Service
public class ServiceUsuariosImpl implements ServiceUsuarios {

	
	@Autowired
	UsuariosDAO usuariosDAO;

	public boolean insertarUsuarios(Usuarios u) {
		try {
			usuariosDAO.insertarUsuarios(u);
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar el usuario!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;

		
	}

	@Override
	public boolean borrarUsuarios(Usuarios u) {
		
		
try {
			usuariosDAO.borrarUsuarios(u);
		        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage( "Se ha borrado con �xito",""));
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar el usuario! >"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarUsuarios(Usuarios u) {
try {
			usuariosDAO.modificarUsuarios(u);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage( "Se ha modificado con �xito",""));
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar el usuario!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public Usuarios detalleUsuarios(int idUsuario) {
try {
			
			return usuariosDAO.detalleUsuarios(idUsuario);
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al mostrar  el detalle del usuario!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
			return null;		
	}

	@Override
	public List<Usuarios> listarUsuarios() {
		
		try {
			
			return usuariosDAO.listarUsuarios();
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar el usuario!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return null;
	}

	@Override
	public List<Usuarios> listarUsuarioslibres() {
		
		try {
			
			return usuariosDAO.listarUsuarioslibres();
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar el usuario!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	@Override
	public boolean insertarDepartamentosAyto(DepartamentosAyto da) {
try {
			usuariosDAO.insertarDepartamentosAyto(da);;
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar el departamentoAyto!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarDepartamentosAyto(DepartamentosAyto da) {
try {
			usuariosDAO.borrarDepartamentosAyto(da);
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar el departamentoAyto!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
	}

	@Override
	public boolean modificarDepartamentosAyto(DepartamentosAyto da) {
try {
		usuariosDAO.modificarDepartamentosAyto(da);
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar el departamentoAyto!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public DepartamentosAyto detalleDepartamentosAyto(int idDepAyto) {
try {
			
			return usuariosDAO.detalleDepartamentosAyto(idDepAyto);
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al mostrar el detalle departamentoAyto!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return null;
	}

	@Override
	public List<DepartamentosAyto> listarDepartamentosAyto() {
try {
			
			return usuariosDAO.listarDepartamentosAyto();
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar el departamentoAyto!<br/>"+e.getMessage(), "Contácta con el administrador."));
			 
		}
		return null;
	}

}
