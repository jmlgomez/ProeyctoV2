package com.ayto.proyecto.dao;

import java.util.List;

import com.ayto.proyecto.modelo.AveriasTerminales;

public interface AveriasTerminalesDAO {
	public void insertarAveriasTerminales (AveriasTerminales at);
	public void borrarAveriasTerminales (AveriasTerminales  at);
	public void modificarAveriasTerminales (AveriasTerminales at);
	public AveriasTerminales  detalleAveriasTerminales ( int idaveriasTerminal);
	public List<AveriasTerminales> listarAveriasTerminales ();

}
