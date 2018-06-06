package com.ayto.proyecto.modelo;
// Generated 05-may-2018 19:20:36 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Terminales generated by hbm2java
 */
@Entity
@Table(name = "terminales", uniqueConstraints = { @UniqueConstraint(columnNames = "imei"),
		@UniqueConstraint(columnNames = "numSerie") })
public class Terminales implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idTerminal;
	private CompaniasTerminales companiasTerminales;
	private EstadosTerminales estadosTerminales;
	private LotesTerminales lotesTerminales;
	private ModelosTerminales modelosTerminales;
	private TiposTerminales tiposTerminales;
	private String numSerie;
	private String imei;
	private String cambioImei;
	private Boolean disponible;
	private Boolean baja;
	private Date fechaAlta;
	private Date fechaBaja;
	private String motivoBaja;
	private String observaciones;
	private String historialAveria;
	private Set<Entregas> entregases = new HashSet<Entregas>(0);
	private Set<AveriasTerminales> averiasTerminalesesForImeiAntiguo = new HashSet<AveriasTerminales>(0);
	private Set<HistEstados> histEstadoses = new HashSet<HistEstados>(0);
	private Set<AveriasTerminales> averiasTerminalesesForImeiNuevo = new HashSet<AveriasTerminales>(0);

	public Terminales() {
	}

	public Terminales(String numSerie, String imei) {
		this.numSerie = numSerie;
		this.imei = imei;
	}

	public Terminales(CompaniasTerminales companiasTerminales, EstadosTerminales estadosTerminales,
			LotesTerminales lotesTerminales, ModelosTerminales modelosTerminales, TiposTerminales tiposTerminales,
			String numSerie, String imei, String cambioImei, Boolean disponible, Boolean baja, Date fechaAlta,
			Date fechaBaja, String motivoBaja, String observaciones, String historialAveria, Set<Entregas> entregases,
			Set<AveriasTerminales> averiasTerminalesesForImeiAntiguo, Set<HistEstados> histEstadoses, Set<AveriasTerminales> averiasTerminalesesForImeiNuevo) {
		this.companiasTerminales = companiasTerminales;
		this.estadosTerminales = estadosTerminales;
		this.lotesTerminales = lotesTerminales;
		this.modelosTerminales = modelosTerminales;
		this.tiposTerminales = tiposTerminales;
		this.numSerie = numSerie;
		this.imei = imei;
		this.cambioImei = cambioImei;
		this.disponible = disponible;
		this.baja = baja;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.motivoBaja = motivoBaja;
		this.observaciones = observaciones;
		this.historialAveria = historialAveria;
		this.entregases = entregases;
		this.averiasTerminalesesForImeiAntiguo = averiasTerminalesesForImeiAntiguo;
		this.histEstadoses = histEstadoses;
		this.averiasTerminalesesForImeiNuevo = averiasTerminalesesForImeiNuevo;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idTerminal", unique = true, nullable = false)
	public Integer getIdTerminal() {
		return this.idTerminal;
	}

	public void setIdTerminal(Integer idTerminal) {
		this.idTerminal = idTerminal;
	}

	@ManyToOne
	@JoinColumn(name = "idCompaniaTerminal")
	public CompaniasTerminales getCompaniasTerminales() {
		return this.companiasTerminales;
	}

	public void setCompaniasTerminales(CompaniasTerminales companiasTerminales) {
		this.companiasTerminales = companiasTerminales;
	}

	@ManyToOne
	@JoinColumn(name = "idEstadoTerminal")
	public EstadosTerminales getEstadosTerminales() {
		return this.estadosTerminales;
	}

	public void setEstadosTerminales(EstadosTerminales estadosTerminales) {
		this.estadosTerminales = estadosTerminales;
	}

	@ManyToOne
	@JoinColumn(name = "idLoteTerminal")
	public LotesTerminales getLotesTerminales() {
		return this.lotesTerminales;
	}

	public void setLotesTerminales(LotesTerminales lotesTerminales) {
		this.lotesTerminales = lotesTerminales;
	}

	@ManyToOne
	@JoinColumn(name = "idModeloTerminal")
	public ModelosTerminales getModelosTerminales() {
		return this.modelosTerminales;
	}

	public void setModelosTerminales(ModelosTerminales modelosTerminales) {
		this.modelosTerminales = modelosTerminales;
	}

	@ManyToOne
	@JoinColumn(name = "idTipoTerminal")
	public TiposTerminales getTiposTerminales() {
		return this.tiposTerminales;
	}

	public void setTiposTerminales(TiposTerminales tiposTerminales) {
		this.tiposTerminales = tiposTerminales;
	}

	@Column(name = "numSerie",  length = 90)
	public String getNumSerie() {
		return this.numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	@Column(name = "imei", unique = true, nullable = false, length = 90)
	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	@Column(name = "cambioImei", length = 90)
	public String getCambioImei() {
		return this.cambioImei;
	}

	public void setCambioImei(String cambioImei) {
		this.cambioImei = cambioImei;
	}

	@Column(name = "disponible")
	public Boolean getDisponible() {
		return this.disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	@Column(name = "baja")
	public Boolean getBaja() {
		return this.baja;
	}

	public void setBaja(Boolean baja) {
		this.baja = baja;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_alta", length = 10)
	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
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

	@Column(name = "observaciones", length = 250)
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Column(name = "historialAveria", length = 250)
	public String getHistorialAveria() {
		return this.historialAveria;
	}

	public void setHistorialAveria(String historialAveria) {
		this.historialAveria = historialAveria;
	}

	@OneToMany( mappedBy = "terminales")
	public Set<Entregas> getEntregases() {
		return this.entregases;
	}

	public void setEntregases(Set<Entregas> entregases) {
		this.entregases = entregases;
	}

	@OneToMany(mappedBy = "terminalesByImeiAntiguo")
	public Set<AveriasTerminales> getAveriasTerminalesesForImeiAntiguo() {
		return this.averiasTerminalesesForImeiAntiguo;
	}

	public void setAveriasTerminalesesForImeiAntiguo(Set<AveriasTerminales> averiasTerminalesesForImeiAntiguo) {
		this.averiasTerminalesesForImeiAntiguo = averiasTerminalesesForImeiAntiguo;
	}

	@OneToMany( mappedBy = "terminales")
	public Set<HistEstados> getHistEstadoses() {
		return this.histEstadoses;
	}

	public void setHistEstadoses(Set<HistEstados> histEstadoses) {
		this.histEstadoses = histEstadoses;
	}

	@OneToMany( mappedBy = "terminalesByImeiNuevo")
	public Set<AveriasTerminales> getAveriasTerminalesesForImeiNuevo() {
		return this.averiasTerminalesesForImeiNuevo;
	}

	public void setAveriasTerminalesesForImeiNuevo(Set<AveriasTerminales> averiasTerminalesesForImeiNuevo) {
		this.averiasTerminalesesForImeiNuevo = averiasTerminalesesForImeiNuevo;
	}
	
	@Override
    public String toString() {
        return String.format("%s[id=%d]", getClass().getSimpleName(), getIdTerminal());
    }

}
