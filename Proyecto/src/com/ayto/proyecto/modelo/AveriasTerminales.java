package com.ayto.proyecto.modelo;
// Generated 05-may-2018 19:20:36 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AveriasTerminales generated by hbm2java
 */
@Entity
@Table(name = "averiasTerminales")
public class AveriasTerminales implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idaveriasTerminal;
	private Operadores operadores;
	private Terminales terminalesByImeiAntiguo;
	private Terminales terminalesByImeiNuevo;
	private Date fechaAveria;
	private Date fechaEntrega;
	private Date fechaBaja;
	private String motivoBaja;
	private Boolean enviadoReparar;
	private String historialAveria;
	private String observaciones;

	public AveriasTerminales() {
	}

	public AveriasTerminales(Terminales terminalesByImeiAntiguo, Terminales terminalesByImeiNuevo) {
		this.terminalesByImeiAntiguo = terminalesByImeiAntiguo;
		this.terminalesByImeiNuevo = terminalesByImeiNuevo;
	}

	public AveriasTerminales(Operadores operadores, Terminales terminalesByImeiAntiguo,
			Terminales terminalesByImeiNuevo, Date fechaAveria, Date fechaEntrega, Date fechaBaja, String motivoBaja,
			Boolean enviadoReparar, String historialAveria, String observaciones) {
		this.operadores = operadores;
		this.terminalesByImeiAntiguo = terminalesByImeiAntiguo;
		this.terminalesByImeiNuevo = terminalesByImeiNuevo;
		this.fechaAveria = fechaAveria;
		this.fechaEntrega = fechaEntrega;
		this.fechaBaja = fechaBaja;
		this.motivoBaja = motivoBaja;
		this.enviadoReparar = enviadoReparar;
		this.historialAveria = historialAveria;
		this.observaciones = observaciones;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idaveriasTerminal", unique = true, nullable = false)
	public Integer getIdaveriasTerminal() {
		return this.idaveriasTerminal;
	}

	public void setIdaveriasTerminal(Integer idaveriasTerminal) {
		this.idaveriasTerminal = idaveriasTerminal;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idOperador")
	public Operadores getOperadores() {
		return this.operadores;
	}

	public void setOperadores(Operadores operadores) {
		this.operadores = operadores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "imeiAntiguo", nullable = false)
	public Terminales getTerminalesByImeiAntiguo() {
		return this.terminalesByImeiAntiguo;
	}

	public void setTerminalesByImeiAntiguo(Terminales terminalesByImeiAntiguo) {
		this.terminalesByImeiAntiguo = terminalesByImeiAntiguo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "imeiNuevo", nullable = false)
	public Terminales getTerminalesByImeiNuevo() {
		return this.terminalesByImeiNuevo;
	}

	public void setTerminalesByImeiNuevo(Terminales terminalesByImeiNuevo) {
		this.terminalesByImeiNuevo = terminalesByImeiNuevo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_averia", length = 10)
	public Date getFechaAveria() {
		return this.fechaAveria;
	}

	public void setFechaAveria(Date fechaAveria) {
		this.fechaAveria = fechaAveria;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_entrega", length = 10)
	public Date getFechaEntrega() {
		return this.fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_baja", length = 10)
	public Date getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	@Column(name = "motivo_baja", length = 250)
	public String getMotivoBaja() {
		return this.motivoBaja;
	}

	public void setMotivoBaja(String motivoBaja) {
		this.motivoBaja = motivoBaja;
	}

	@Column(name = "enviadoReparar")
	public Boolean getEnviadoReparar() {
		return this.enviadoReparar;
	}

	public void setEnviadoReparar(Boolean enviadoReparar) {
		this.enviadoReparar = enviadoReparar;
	}

	@Column(name = "historialAveria", length = 250)
	public String getHistorialAveria() {
		return this.historialAveria;
	}

	public void setHistorialAveria(String historialAveria) {
		this.historialAveria = historialAveria;
	}

	@Column(name = "observaciones", length = 250)
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
