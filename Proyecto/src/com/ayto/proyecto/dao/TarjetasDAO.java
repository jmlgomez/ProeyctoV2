package com.ayto.proyecto.dao;

import java.util.List;

import com.ayto.proyecto.modelo.EstadosTarjetas;
import com.ayto.proyecto.modelo.Tarjetas;
import com.ayto.proyecto.modelo.TiposContratos;
import com.ayto.proyecto.modelo.TiposTarifas;
import com.ayto.proyecto.modelo.TiposTarjetas;

public interface TarjetasDAO {
	public void insertarTarjetas (Tarjetas tarj);
	public void borrarTarjetas (Tarjetas tarj);
	public void modificarTarjetas (Tarjetas tarj);
	public Tarjetas detalleTarjetas ( int idTarjeta);
	public List<Tarjetas> listarTarjetas();
	
	//Manejo ESTADOS_TARJETA
	public void insertarEstadosTarjetas (EstadosTarjetas esttarj);
	public void modificaEstadosTarjetas (EstadosTarjetas esttarj);
	public void borrarEstadosTarjetas(EstadosTarjetas esttarj);
	public List<EstadosTarjetas> listadoEstadosTarjetas();
	public EstadosTarjetas detalleEstadosTarjetas (int idEstadoTarjeta);
	
	//Manejo TABLA TIPOS_TARJETAS
	public void insertarTipoTarjetas ( TiposTarjetas ttarj);
	public void modificarTipoTarjetas (TiposTarjetas ttarj);
	public void borrarTipoTarjetas (TiposTarjetas ttarj);
	public List< TiposTarjetas> listadoTiposTarjetas();
	public TiposTarjetas detalleTiposTarjetas (int idTipoTarjeta);
		//No se aplica el metodo borrar ya que existe un campo activo S/N
	
	//Manejo TIPOS_CONTRATOS
	public void insertarTiposContratos (TiposContratos  tcontrato);
	public void modificarTiposContratos  (TiposContratos  tcontrato);
	public void borrarTiposContratos  (TiposContratos  tcontrato);
	public List<TiposContratos > listadoTiposContratos ();
	public TiposContratos  detalleTiposContratos  (int idTipoContrato);
		
	//Manejo TABLA TIPOS_TARIFAS
	public void insertarTiposTarifas (TiposTarifas ttarf);
	public void modificarTipoTarifas (TiposTarifas  ttarf);
	public void borrarTipoTarifa (TiposTarifas  ttarf);
	public List< TiposTarifas > listadoTipoTarifa();
	public TiposTarifas  detalletipotarifa (int idTipoTarifa);
}



