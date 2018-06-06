package com.ayto.proyecto.service;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayto.proyecto.dao.TerminalesDAO;
import com.ayto.proyecto.modelo.CompaniasTerminales;
import com.ayto.proyecto.modelo.EstadosTerminales;
import com.ayto.proyecto.modelo.HistEstados;
import com.ayto.proyecto.modelo.LotesTerminales;
import com.ayto.proyecto.modelo.Marcas;
import com.ayto.proyecto.modelo.ModelosTerminales;
import com.ayto.proyecto.modelo.Terminales;
import com.ayto.proyecto.modelo.TiposTerminales;
@Service
public class ServiceTerminalesImpl implements ServiceTerminales{
	
	
	@Autowired
	TerminalesDAO terminalesDAO;
	

	@Override
	public boolean insertarTerminales(Terminales t) {
		
		try {
			terminalesDAO.insertarTerminales(t);
			
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar Terminal!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}
		
	

	@Override
	public boolean borrarTerminales(Terminales t) {
		try {
			terminalesDAO.borrarTerminales(t);
			
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar Terminal!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarTerminales(Terminales t) {
		try {
			terminalesDAO.modificarTerminales(t);
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar Terminal!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public Terminales detalleTerminales(int idTerminal) {
try {
			
			return terminalesDAO.detalleTerminales(idTerminal);
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar terminales!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public List<Terminales> listarTerminales() {
try {
			
			return terminalesDAO.listarTerminales();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar terminales!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public boolean insertarMarca(Marcas m) {
		try {
			terminalesDAO.insertarMarca(m);
			
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar Marca!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarMarca(Marcas m) {
		try {
			terminalesDAO.modificarMarca(m);
			
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar Marca!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarMarca(Marcas m) {
		try {
			terminalesDAO.borrarMarca(m);
			
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar marca!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public List<Marcas> listadoMarcas() {
try {
			
			return terminalesDAO.listadoMarcas();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listo terminales!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public Marcas detalleMarca(int idMarca) {
try {
			
			return terminalesDAO.detalleMarca(idMarca);
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar marcas!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public boolean insertarModelosTerminales(ModelosTerminales mt) {
		try {
			terminalesDAO.insertarModelosTerminales(mt);
			
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar modelo Terminal!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarModelosTerminales(ModelosTerminales mt) {
		try {
			terminalesDAO.modificarModelosTerminales(mt);
			
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar modelo Terminal!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarModelosTerminales(ModelosTerminales mt) {
		try {
			terminalesDAO.borrarModelosTerminales(mt);
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar modelo Terminal!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public List<ModelosTerminales> listadoModelosTerminales() {
try {
			
			return terminalesDAO.listadoModelosTerminales();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar modelos terminales!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public ModelosTerminales detalleModelosTerminales(int idModeloTerminal) {
try {
			
			return terminalesDAO.detalleModelosTerminales(idModeloTerminal);
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar modelo terminales!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public boolean insertarEstados(EstadosTerminales et) {
		try {
			terminalesDAO.insertarEstados(et);
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar estados Terminal!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarEstados(EstadosTerminales et) {
		try {
			terminalesDAO.modificarEstados(et);
			
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar estados Terminal!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarEstados(EstadosTerminales et) {
		try {
			terminalesDAO.borrarEstados(et);
			
			return true;
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar estados Terminal!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public List<EstadosTerminales> listadoEstadosTerminales() {
try {
			
			return terminalesDAO.listadoEstadosTerminales();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar estados terminales!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public EstadosTerminales detalleEstados(int idEstadoTerminal) {
try {
			
			return terminalesDAO.detalleEstados(idEstadoTerminal);
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar estados terminales!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public boolean insertarHistEstados(HistEstados he) {
		try {
			terminalesDAO.insertarHistEstados(he);
			
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar historico estados!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarHistEstados(HistEstados he) {
		try {
			terminalesDAO.modificarHistEstados(he);
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar historico estados!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarHistEstados(HistEstados he) {
		try {
			terminalesDAO.borrarHistEstados(he);
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar historico estadosl!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public List<HistEstados> listadoHistEstados() {
try {
			
			return terminalesDAO.listadoHistEstados();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar historico estados!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public HistEstados detalleHistEstados(int idHistEstado) {
try {
			
			return terminalesDAO.detalleHistEstados(idHistEstado);
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar hsitorico estado !<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public boolean insertarLotesTerminales(LotesTerminales lotterm) {
		try {
			terminalesDAO.insertarLotesTerminales(lotterm);
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar lotes terminal!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarLotesTerminales(LotesTerminales lotterm) {
		try {
			terminalesDAO.modificarLotesTerminales(lotterm);
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar lotes Terminal!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarLotesTerminales(LotesTerminales lotterm) {
		try {
			terminalesDAO.borrarLotesTerminales(lotterm);
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar lotes Terminal!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public List<LotesTerminales> listadoLotesTerminales() {
try {
			
			return terminalesDAO.listadoLotesTerminales();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar lotes terminales!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public LotesTerminales detalleLotesTerminales(int idLoteTerminal) {
try {
			
			return terminalesDAO.detalleLotesTerminales(idLoteTerminal);
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar lotes terminales!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public boolean insertarTiposTerminales(TiposTerminales tt) {
		try {
			terminalesDAO.insertarTiposTerminales(tt);
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar tipos Terminal!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarTiposTerminales(TiposTerminales tt) {
		try {
			terminalesDAO.modificarTiposTerminales(tt);
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar tipos Terminales!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarTiposTerminales(TiposTerminales tt) {
		try {
			terminalesDAO.borrarTiposTerminales(tt);
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar tipo Terminal!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public List<TiposTerminales> listadoTiposTerminales() {
try {
			
			return terminalesDAO.listadoTiposTerminales();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listado tipo terminales!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public TiposTerminales detalleTiposTerminales(int idTipoTerminal) {
try {
			
			return terminalesDAO.detalleTiposTerminales(idTipoTerminal);
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar tipo terminales!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;
	}

	@Override
	public boolean insertarCompaniasTerminales(CompaniasTerminales comterm) {
		try {
			terminalesDAO.modificarCompaniasTerminales(comterm);;
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al insertar  compañias terminales !<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean modificarCompaniasTerminales(CompaniasTerminales comterm) {
		try {
			terminalesDAO.modificarCompaniasTerminales(comterm);
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al modificar compañias terminales!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public boolean borrarCompaniasTerminales(CompaniasTerminales comterm) {
		try {
			terminalesDAO.borrarCompaniasTerminales(comterm);
			return true;
			
		}catch (Exception e) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al borrar  compañias terminales!<br/>"+e.getMessage(), "Contácta con administrador."));
			 
		}
		return false;
		
	}

	@Override
	public List<CompaniasTerminales> listadoCompaniasTerminales() {
try {
			
			return terminalesDAO.listadoCompaniasTerminales();
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al listar compañias terminales!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			
		}
		return null;
	}

	@Override
	public CompaniasTerminales detalleCompaniasTerminales(int idCompaniaTerminal) {
try {
			
			return terminalesDAO.detalleCompaniasTerminales(idCompaniaTerminal);
		}catch (Exception ecxp) {
			 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al detallar compañias terminales!<br/>"+ecxp.getMessage(), "Contacta con el administrador."));
			 
		}
		return null;

}
}