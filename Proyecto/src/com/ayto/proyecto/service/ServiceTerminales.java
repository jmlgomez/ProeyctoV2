package com.ayto.proyecto.service;

import java.util.List;

import com.ayto.proyecto.modelo.CompaniasTerminales;
import com.ayto.proyecto.modelo.EstadosTerminales;
import com.ayto.proyecto.modelo.HistEstados;
import com.ayto.proyecto.modelo.LotesTerminales;
import com.ayto.proyecto.modelo.Marcas;
import com.ayto.proyecto.modelo.ModelosTerminales;
import com.ayto.proyecto.modelo.Terminales;
import com.ayto.proyecto.modelo.TiposTerminales;

public interface ServiceTerminales {
	public boolean insertarTerminales (Terminales t);
	public boolean borrarTerminales (Terminales t);
	public boolean modificarTerminales (Terminales t);
	public Terminales detalleTerminales ( int idTerminal);
	public List<Terminales> listarTerminales();
	public List<Terminales> listarTerminalesDisponibles();
	
	//Manejo TABLA_MARCAS
	public boolean insertarMarca (Marcas m);
	public boolean modificarMarca (Marcas m);
	public boolean borrarMarca (Marcas m);
	public List< Marcas> listadoMarcas();
	public Marcas detalleMarca (int idMarca);	
	//Manejo Modelos_TERMINALES
	public boolean insertarModelosTerminales (ModelosTerminales mt);
	public boolean modificarModelosTerminales(ModelosTerminales mt);
	public boolean borrarModelosTerminales (ModelosTerminales mt);
	public List< ModelosTerminales> listadoModelosTerminales();
	public ModelosTerminales detalleModelosTerminales (int idModeloTerminal);
	
	//Manejo TABLA ESTADOS_TERMINALES
	public boolean insertarEstados (EstadosTerminales et);
	public boolean modificarEstados  (EstadosTerminales et);
	public boolean borrarEstados (EstadosTerminales et);
	public List<EstadosTerminales> listadoEstadosTerminales ();
	public EstadosTerminales detalleEstados  (int idEstadoTerminal);
	//No se aplica el metodo borrar ya que existe un campo activo S/N
	
	//MANEJO TABLA_HIST_ESTADOS
	public boolean insertarHistEstados(HistEstados he);
	public boolean modificarHistEstados(HistEstados he);
	public boolean borrarHistEstados(HistEstados he);
	public List<HistEstados> listadoHistEstados ();
	public HistEstados detalleHistEstados  (int idHistEstado);
	
	//MANEJO TABLA_LOTES_TERMINALES
	public boolean insertarLotesTerminales(LotesTerminales  lotterm);
	public boolean modificarLotesTerminales(LotesTerminales lotterm);
	public boolean borrarLotesTerminales(LotesTerminales lotterm);
	public List<LotesTerminales> listadoLotesTerminales ();
	public LotesTerminales detalleLotesTerminales (int idLoteTerminal);
	
	//MANEJO TABLA_TIPOS_TERMINALES
	public boolean insertarTiposTerminales (TiposTerminales tt);
	public boolean modificarTiposTerminales  (TiposTerminales  tt);
	public boolean borrarTiposTerminales (TiposTerminales  tt);
	public List<TiposTerminales> listadoTiposTerminales  ();
	public TiposTerminales detalleTiposTerminales (int idTipoTerminal);
	
	
		//MANEJO TABLA_COMAÑIAS_TERMINALES
	public boolean insertarCompaniasTerminales (CompaniasTerminales  comterm);
	public boolean modificarCompaniasTerminales  (CompaniasTerminales   comterm);
	public boolean borrarCompaniasTerminales (CompaniasTerminales  comterm);
	public List<CompaniasTerminales > listadoCompaniasTerminales  ();
	public CompaniasTerminales detalleCompaniasTerminales (int idCompaniaTerminal);

}
