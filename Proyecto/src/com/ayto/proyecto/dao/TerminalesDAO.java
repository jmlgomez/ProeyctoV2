package com.ayto.proyecto.dao;

import java.util.List;

import com.ayto.proyecto.modelo.CompaniasTerminales;
import com.ayto.proyecto.modelo.EstadosTerminales;
import com.ayto.proyecto.modelo.HistEstados;
import com.ayto.proyecto.modelo.LotesTerminales;
import com.ayto.proyecto.modelo.Marcas;
import com.ayto.proyecto.modelo.ModelosTerminales;
import com.ayto.proyecto.modelo.Terminales;
import com.ayto.proyecto.modelo.TiposTerminales;

public interface TerminalesDAO {
	public void insertarTerminales (Terminales t);
	public void borrarTerminales (Terminales t);
	public void modificarTerminales (Terminales t);
	public Terminales detalleTerminales ( int idTerminal);
	public List<Terminales> listarTerminales();
	public List<Terminales> listarTerminalesDisponibles();
	
	//Manejo TABLA_MARCAS
	public void insertarMarca (Marcas m);
	public void modificarMarca (Marcas m);
	public void borrarMarca (Marcas m);
	public List< Marcas> listadoMarcas();
	public Marcas detalleMarca (int idMarca);	
	//Manejo Modelos_TERMINALES
	public void insertarModelosTerminales (ModelosTerminales mt);
	public void modificarModelosTerminales(ModelosTerminales mt);
	public void borrarModelosTerminales (ModelosTerminales mt);
	public List< ModelosTerminales> listadoModelosTerminales();
	public ModelosTerminales detalleModelosTerminales (int idModeloTerminal);
	
	//Manejo TABLA ESTADOS_TERMINALES
	public void insertarEstados (EstadosTerminales et);
	public void modificarEstados  (EstadosTerminales et);
	public void borrarEstados (EstadosTerminales et);
	public List<EstadosTerminales> listadoEstadosTerminales ();
	public EstadosTerminales detalleEstados  (int idEstadoTerminal);
	//No se aplica el metodo borrar ya que existe un campo activo S/N
	
	//MANEJO TABLA_HIST_ESTADOS
	public void insertarHistEstados(HistEstados he);
	public void modificarHistEstados(HistEstados he);
	public void borrarHistEstados(HistEstados he);
	public List<HistEstados> listadoHistEstados ();
	public HistEstados detalleHistEstados  (int idHistEstado);
	
	//MANEJO TABLA_LOTES_TERMINALES
	public void insertarLotesTerminales(LotesTerminales  lotterm);
	public void modificarLotesTerminales(LotesTerminales lotterm);
	public void borrarLotesTerminales(LotesTerminales lotterm);
	public List<LotesTerminales> listadoLotesTerminales ();
	public LotesTerminales detalleLotesTerminales (int idLoteTerminal);
	
	//MANEJO TABLA_TIPOS_TERMINALES
	public void insertarTiposTerminales (TiposTerminales tt);
	public void modificarTiposTerminales  (TiposTerminales  tt);
	public void borrarTiposTerminales (TiposTerminales  tt);
	public List<TiposTerminales> listadoTiposTerminales  ();
	public TiposTerminales detalleTiposTerminales (int idTipoTerminal);
	
	
		//MANEJO TABLA_COMAÑIAS_TERMINALES
	public void insertarCompaniasTerminales (CompaniasTerminales  comterm);
	public void modificarCompaniasTerminales  (CompaniasTerminales   comterm);
	public void borrarCompaniasTerminales (CompaniasTerminales  comterm);
	public List<CompaniasTerminales > listadoCompaniasTerminales  ();
	public CompaniasTerminales detalleCompaniasTerminales (int idCompaniaTerminal);

}



