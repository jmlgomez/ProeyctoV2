package com.ayto.proyecto.dao;

import java.util.List;

import com.ayto.proyecto.modelo.AveriasTarjetas;

public interface AveriasTarjetasDAO {
	
	public void insertarAveriasTarjetas(AveriasTarjetas avt);
	public void borrarAveriasTarjetas(AveriasTarjetas avt);
	public void modificarAveriasTarjetas(AveriasTarjetas  avt);
	public AveriasTarjetas detalleAveriasTarjetas( int idaveriaTarjeta);
	public List<AveriasTarjetas> listarAveriasTarjetas ();


}
