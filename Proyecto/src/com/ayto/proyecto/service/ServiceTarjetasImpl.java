package com.ayto.proyecto.service;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayto.proyecto.dao.TarjetasDAO;
import com.ayto.proyecto.modelo.EstadosTarjetas;
import com.ayto.proyecto.modelo.Tarjetas;
import com.ayto.proyecto.modelo.TiposContratos;
import com.ayto.proyecto.modelo.TiposTarifas;
import com.ayto.proyecto.modelo.TiposTarjetas;

@Service
public class ServiceTarjetasImpl implements ServiceTarjetas {
	
	@Autowired	
	TarjetasDAO tarjetasDAO;

	@Override
	public boolean insertarTarjetas(Tarjetas tarj) {
try {
			tarjetasDAO.insertarTarjetas(tarj);
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar tarjetas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarTarjetas(Tarjetas tarj) {
		
			try {
						tarjetasDAO.borrarTarjetas(tarj);
						return true;
					}catch (Exception ecxp) {
						 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar tarjetas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
						 
					}
					return false;
		
	}

	@Override
	public boolean modificarTarjetas(Tarjetas tarj) {
		
			try {
						tarjetasDAO.modificarTarjetas(tarj);
						FacesContext.getCurrentInstance().addMessage(null, new FacesMessage( "Se ha modificado con éxito",""));
						return true;
					}catch (Exception ecxp) {
						 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar tarjetas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
						 
					}
					return false;
		
	}

	@Override
	public Tarjetas detalleTarjetas(int idTarjeta) {
try {
			
			return tarjetasDAO.detalleTarjetas(idTarjeta);
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar tarjetas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public List<Tarjetas> listarTarjetas() {
try {
			
			return tarjetasDAO.listarTarjetas();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar tarjetas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public boolean insertarEstadosTarjetas(EstadosTarjetas esttarj) {
		try {
			tarjetasDAO.insertarEstadosTarjetas(esttarj);
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar estados tarjetas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificaEstadosTarjetas(EstadosTarjetas esttarj) {
		try {
			tarjetasDAO.modificaEstadosTarjetas(esttarj);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage( "Se ha modificado con éxito",""));
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar estados tarjetas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarEstadosTarjetas(EstadosTarjetas esttarj) {
		try {
			tarjetasDAO.borrarEstadosTarjetas(esttarj);
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar estados tarjetas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public List<EstadosTarjetas> listadoEstadosTarjetas() {
try {
			
			return tarjetasDAO.listadoEstadosTarjetas();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar estado tarjetas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public EstadosTarjetas detalleEstadosTarjetas(int idEstadoTarjeta) {
try {
			
			return tarjetasDAO.detalleEstadosTarjetas(idEstadoTarjeta);
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar estado tarjetas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public boolean insertarTipoTarjetas(TiposTarjetas ttarj) {
		try {
			tarjetasDAO.insertarTipoTarjetas(ttarj);
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar tipo tarjetas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarTipoTarjetas(TiposTarjetas ttarj) {
		try {
			tarjetasDAO.modificarTipoTarjetas(ttarj);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage( "Se ha modificado con éxito",""));
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar tipos tarjetas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarTipoTarjetas(TiposTarjetas ttarj) {
		try {
			tarjetasDAO.borrarTipoTarjetas(ttarj);
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar tipos tarjetas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public List<TiposTarjetas> listadoTiposTarjetas() {
try {
			
			return tarjetasDAO.listadoTiposTarjetas();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar tipo tarjetas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public TiposTarjetas detalleTiposTarjetas(int idTipoTarjeta) {
try {
			
			return tarjetasDAO.detalleTiposTarjetas(idTipoTarjeta);
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar tipo tarjetas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public boolean insertarTiposContratos(TiposContratos tcontrato) {
		try {
			tarjetasDAO.insertarTiposContratos(tcontrato);
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar tipos contrato!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarTiposContratos(TiposContratos tcontrato) {
		try {
			tarjetasDAO.modificarTiposContratos(tcontrato);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage( "Se ha modificado con éxito",""));
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar tipos contrato!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarTiposContratos(TiposContratos tcontrato) {
		try {
			tarjetasDAO.borrarTiposContratos(tcontrato);
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar tipos contrato!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public List<TiposContratos> listadoTiposContratos() {
try {
			
			return tarjetasDAO.listadoTiposContratos();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar tipos contratos!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public TiposContratos detalleTiposContratos(int idTipoContrato) {
try {
			
			return tarjetasDAO.detalleTiposContratos(idTipoContrato);
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar tipos Contrato!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public boolean insertarTiposTarifas(TiposTarifas ttarf) {
		try {
			tarjetasDAO.insertarTiposTarifas(ttarf);
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar tipos tarifa!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarTipoTarifas(TiposTarifas ttarf) {
		try {
			tarjetasDAO.modificarTipoTarifas(ttarf);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage( "Se ha modificado con éxito",""));
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar tipos tarifa!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
	}

	@Override
	public boolean borrarTipoTarifa(TiposTarifas ttarf) {
		try {
			tarjetasDAO.borrarTipoTarifa(ttarf);
			return true;
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar tipos tarifa!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return false;
		
	}

	@Override
	public List<TiposTarifas> listadoTipoTarifa() {
try {
			
			return tarjetasDAO.listadoTipoTarifa();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar tipo tarifas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public TiposTarifas detalletipotarifa(int idTipoTarifa) {
try {
			
			return tarjetasDAO.detalletipotarifa(idTipoTarifa);
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar tipo tarifa!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

}
