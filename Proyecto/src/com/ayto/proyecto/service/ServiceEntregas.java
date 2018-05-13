package com.ayto.proyecto.service;

import java.util.List;

import com.ayto.proyecto.modelo.Entregas;
import com.ayto.proyecto.modelo.Operadores;

public interface ServiceEntregas {
	public boolean insertarEntregas (Entregas e);
	public boolean borrarEntregas (Entregas e);
	public boolean modificarEntregas  (Entregas e);
	public Entregas detalleEntregas  ( int idEntrega);
	public List<Entregas> listarEntregas();
	
	//MANEJO TABLA OPERADORES

	public boolean insertarOperadores ( Operadores o);
	public boolean modificarOperadores  (Operadores o);
	public boolean borrarOperadores  (Operadores o);
	public List< Operadores> listadoOperadores();
	public Operadores detalleOperadores (int idOperador);

}
