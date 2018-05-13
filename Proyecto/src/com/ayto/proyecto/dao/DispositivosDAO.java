package com.ayto.proyecto.dao;

import java.util.List;

import com.ayto.proyecto.modelo.Dispositivos;
import com.ayto.proyecto.modelo.ModelosDispositivos;

public interface DispositivosDAO {
	
	public void insertarDispositivos(Dispositivos disp);
	public void modificarDispositivos (Dispositivos  disp);
	public void borrarDispositivos(Dispositivos  disp);
	public List< Dispositivos > listadoDispositivos();
	public Dispositivos  detalleDispositivos (int idDispositivo);
	//No se aplica el metodo borrar ya que existe un campo activo S/N
	
	//Manejo TABLA_MODELOS_DISPOSITIVO
	public void insertarModelosDisositivos (ModelosDispositivos mdisp);
	public void modificarModelosDisositivos  (ModelosDispositivos  mdisp);
	public void borrarModelosDisositivos (ModelosDispositivos mdisp);
	public List< ModelosDispositivos > listadoModelosDispositivos ();
	public ModelosDispositivos detalleModelosDispositivos (int idModeloDispositivo);
}		

