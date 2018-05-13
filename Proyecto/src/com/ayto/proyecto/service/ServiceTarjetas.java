package com.ayto.proyecto.service;

import java.util.List;

import com.ayto.proyecto.modelo.EstadosTarjetas;
import com.ayto.proyecto.modelo.Tarjetas;
import com.ayto.proyecto.modelo.TiposContratos;
import com.ayto.proyecto.modelo.TiposTarifas;
import com.ayto.proyecto.modelo.TiposTarjetas;

public interface ServiceTarjetas {
	public boolean insertarTarjetas (Tarjetas tarj);
	public boolean borrarTarjetas (Tarjetas tarj);
	public boolean modificarTarjetas (Tarjetas tarj);
	public Tarjetas detalleTarjetas ( int idTarjeta);
	public List<Tarjetas> listarTarjetas();
	
	//Manejo ESTADOS_TARJETA
	public boolean insertarEstadosTarjetas (EstadosTarjetas esttarj);
	public boolean modificaEstadosTarjetas (EstadosTarjetas esttarj);
	public boolean borrarEstadosTarjetas(EstadosTarjetas esttarj);
	public List<EstadosTarjetas> listadoEstadosTarjetas();
	public EstadosTarjetas detalleEstadosTarjetas (int idEstadoTarjeta);
	
	//Manejo TABLA TIPOS_TARJETAS
	public boolean insertarTipoTarjetas ( TiposTarjetas ttarj);
	public boolean modificarTipoTarjetas (TiposTarjetas ttarj);
	public boolean borrarTipoTarjetas (TiposTarjetas ttarj);
	public List< TiposTarjetas> listadoTiposTarjetas();
	public TiposTarjetas detalleTiposTarjetas (int idTipoTarjeta);
		//No se aplica el metodo borrar ya que existe un campo activo S/N
	
	//Manejo TIPOS_CONTRATOS
	public boolean insertarTiposContratos (TiposContratos  tcontrato);
	public boolean modificarTiposContratos  (TiposContratos  tcontrato);
	public boolean borrarTiposContratos  (TiposContratos  tcontrato);
	public List<TiposContratos > listadoTiposContratos ();
	public TiposContratos  detalleTiposContratos  (int idTipoContrato);
		
	//Manejo TABLA TIPOS_TARIFAS
	public boolean insertarTiposTarifas (TiposTarifas ttarf);
	public boolean modificarTipoTarifas (TiposTarifas  ttarf);
	public boolean borrarTipoTarifa (TiposTarifas  ttarf);
	public List< TiposTarifas > listadoTipoTarifa();
	public TiposTarifas  detalletipotarifa (int idTipoTarifa);

}
