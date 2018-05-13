package com.ayto.proyecto.service;

import java.util.List;

import com.ayto.proyecto.modelo.AveriasTarjetas;

public interface ServiceAveriasTarjetas {
	public boolean insertarAveriasTarjetas(AveriasTarjetas avt);
	public boolean borrarAveriasTarjetas(AveriasTarjetas avt);
	public boolean modificarAveriasTarjetas(AveriasTarjetas  avt);
	public AveriasTarjetas detalleAveriasTarjetas( int idaveriaTarjeta);
	public List<AveriasTarjetas> listarAveriasTarjetas ();


}
