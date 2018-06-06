package com.ayto.proyecto.seguridad;







import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.ayto.proyecto.dao.UsersDAO;
import com.ayto.proyecto.modelo.Roles;
import com.ayto.proyecto.modelo.Users;



public class AytoAuthenticationProvider implements AuthenticationProvider {
	@Autowired
	UsersDAO usersDAO;
	public Authentication authenticate(Authentication authentication) {
    	try{
	        String name = authentication.getName();
	        String password = authentication.getCredentials().toString();
	        //ServiceUsersImpl serviceUsersImpl = new ServiceUsersImpl();
	        //UsersDAO u=(UsersDAO)new UsersDAOImpl();
	        Users usuario=usersDAO.validar(name, password);
			if(usuario!=null) {
				List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
				for (Roles rol : usuario.getRoleses() ) {
					grantedAuths.add(new SimpleGrantedAuthority("ROLE_"+rol.getRolename().toUpperCase()));
				}
				return new UsernamePasswordAuthenticationToken(name, password, grantedAuths);
			}
	        //if (aa.validarUsuario( name, password)) {
	        //    List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
	        //    return new UsernamePasswordAuthenticationToken(name, password, grantedAuths);
	        //} else {
	            throw new BadCredentialsException("Contraseña Incorrecta");
	        //}
	       
    	}catch(Exception ex){
    		throw new BadCredentialsException("Nombre de usuario o Contraseña Incorrecta");
    	}
		
    }
    
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
    

	

	
	
	

}
