package com.ayto.proyecto.dao;

import com.ayto.proyecto.modelo.Users;

public interface UsersDAO {
	
	public Users validar(String nombre, String password);

}
