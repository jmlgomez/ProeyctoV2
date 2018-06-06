package com.ayto.proyecto.service;

import com.ayto.proyecto.modelo.Users;

public interface ServiceUsers {
	public boolean validar(Users usuario);
	public boolean validarBD(String n,String p);
}
