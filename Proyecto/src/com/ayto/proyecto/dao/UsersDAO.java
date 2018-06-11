package com.ayto.proyecto.dao;

import java.util.List;

import com.ayto.proyecto.modelo.Roles;
import com.ayto.proyecto.modelo.Users;

public interface UsersDAO {
	
	public Users validar(String nombre, String password);
	public void insertarUsers( Users usr);
	public void modificarUsers (Users usr);
	public void borrarUsers  (Users usr);
	public List< Users> getUsers();
	public Users detalleUsers (String Username);
	
	
	//MANEJO ROLES
	
	public void insertarRoles( Roles rol);
	public void modificarRoles (Roles rol);
	public void borrarRoles  (Roles rol);
	public List< Roles> getRolename();
	public Roles detalleRoles (String Rolename);
	
	
	

}
