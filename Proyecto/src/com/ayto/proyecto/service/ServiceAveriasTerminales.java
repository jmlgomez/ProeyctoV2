package com.ayto.proyecto.service;

import java.util.List;

import com.ayto.proyecto.modelo.AveriasTerminales;

public interface ServiceAveriasTerminales {
	public boolean insertarAveriasTerminales (AveriasTerminales at);
	public boolean borrarAveriasTerminales (AveriasTerminales  at);
	public boolean modificarAveriasTerminales (AveriasTerminales at);
	public AveriasTerminales  detalleAveriasTerminales ( int idaveriasTerminal);
	public List<AveriasTerminales> listarAveriasTerminales ();

}
