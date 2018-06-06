package com.ayto.proyecto.service;


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
				System.out.println("No tengo");
				FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "No existe método de autenticación", "No se ha podido autenticar al usuario"));
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
		// TODO Auto-generated method stub
		usersDAO.validar(nombre,password);
		return false;
	}
    
    

}
