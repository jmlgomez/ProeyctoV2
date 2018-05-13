package com.ayto.proyecto.dao;

import java.util.List;

import com.ayto.proyecto.modelo.Entregas;
import com.ayto.proyecto.modelo.Operadores;

public interface EntregasDAO {
	public void insertarEntregas (Entregas e);
	public void borrarEntregas (Entregas e);
	public void modificarEntregas  (Entregas e);
	public Entregas detalleEntregas  ( int idEntrega);
	public List<Entregas> listarEntregas();
	
	//MANEJO TABLA OPERADORES

	public void insertarOperadores ( Operadores o);
	public void modificarOperadores  (Operadores o);
	public void borrarOperadores  (Operadores o);
	public List< Operadores> listadoOperadores();
	public Operadores detalleOperadores (int idOperador);


}



