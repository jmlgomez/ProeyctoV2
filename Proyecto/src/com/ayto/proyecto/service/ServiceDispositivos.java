package com.ayto.proyecto.service;

import java.util.List;

import com.ayto.proyecto.modelo.Dispositivos;
import com.ayto.proyecto.modelo.ModelosDispositivos;

public interface ServiceDispositivos {
	public boolean insertarDispositivos(Dispositivos disp);
	public boolean modificarDispositivos (Dispositivos  disp);
	public boolean borrarDispositivos(Dispositivos  disp);
	public List< Dispositivos > listadoDispositivos();
	public Dispositivos  detalleDispositivos (int idDispositivo);
	//No se aplica el metodo borrar ya que existe un campo activo S/N
	
	//Manejo TABLA_MODELOS_DISPOSITIVO
	public boolean insertarModelosDisositivos (ModelosDispositivos mdisp);
	public boolean modificarModelosDisositivos  (ModelosDispositivos  mdisp);
	public boolean borrarModelosDisositivos (ModelosDispositivos mdisp);
	public List< ModelosDispositivos > listadoModelosDispositivos ();
	public ModelosDispositivos detalleModelosDispositivos (int idModeloDispositivo);

}
