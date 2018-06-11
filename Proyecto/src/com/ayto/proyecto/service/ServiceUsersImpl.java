package com.ayto.proyecto.service;


import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.ayto.proyecto.dao.UsersDAO;
import com.ayto.proyecto.modelo.Roles;
import com.ayto.proyecto.modelo.Users;


@Service
public class ServiceUsersImpl implements ServiceUsers {

	@Autowired
	UsersDAO usersDAO;
	
	private AuthenticationManager authenticationManager;
	
	@Override
	public boolean validar(Users u) {
		try {
			Authentication auto = new UsernamePasswordAuthenticationToken(u.getUsername(), u.getPassword());
			if(authenticationManager!=null) {
				Authentication result = authenticationManager.authenticate(auto);
				SecurityContext s= SecurityContextHolder.getContext();
				s.setAuthentication(result);/**/
				Users usuarioRegistrado=u;
				HttpSession session=request.getSession(true);
				session.setAttribute("SPRING_SECURITY_CONTEXT", s);
				session.setAttribute("AYTO_SECURITY_CONTEXT", usuarioRegistrado);/**/
				System.out.println("Validado?");
				return true;
			}else {
				System.out.println("No hay usuario");
				FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "No existe metodo para poder autenticar", "No se ha podido autenticar al usuario"));
				return false;
			}
		}catch(AuthenticationException e) {
			System.out.println("error al validar");
			FacesContext.getCurrentInstance().addMessage(null, 
					new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "No es correcto!"));
			System.out.println("error al validar");
			
			return false;
		} 
		//return false;
	}

	public AuthenticationManager getAuthenticationManager() {
		return authenticationManager;
	}
	@Autowired
	@Qualifier("authenticationManager")
	public void setAuthenticationManager(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}
	
    private @Autowired HttpServletRequest request;
	
    public Users getUser(){
    	HttpSession session=request.getSession(true);
    	Users u=(Users)session.getAttribute("AYTO_SECURITY_CONTEXT");
    	return u;
    }

	@Override
	public boolean validarBD(String nombre, String password) {
		usersDAO.validar(nombre,password);
		return false;
	}

	@Override
	public void insertarUsers(Users usr) {
		usersDAO.insertarUsers(usr);
		
	}

	@Override
	public void modificarUsers(Users usr) {
		usersDAO.modificarUsers(usr);
		
	}

	@Override
	public void borrarUsers(Users usr) {
		usersDAO.borrarUsers(usr);
		
	}

	@Override
	public List<Users> getUsers() {
try {
			
		return usersDAO.getUsers();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar los usuarios del sistema!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public Users detalleUsers(String Username) {
	try {
		return usersDAO.detalleUsers(Username);
		
	}catch (Exception ecxp) {
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar Usuarios del sistema!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
		 
	}
	return null;
	}

	@Override
	public void insertarRoles(Roles rol) {
		usersDAO.insertarRoles(rol);
		
	}

	@Override
	public void modificarRoles(Roles rol) {
		usersDAO.modificarRoles(rol);
		
	}

	@Override
	public void borrarRoles(Roles rol) {
		usersDAO.borrarRoles(rol);
		
	}

	@Override
	public List<Roles> getRolename() {
		
		return usersDAO.getRolename();
	}

	@Override
	public Roles detalleRoles(String Rolename) {
		
		return usersDAO.detalleRoles(Rolename);
	}
    
    

}
