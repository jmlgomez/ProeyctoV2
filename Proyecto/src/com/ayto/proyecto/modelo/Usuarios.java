package com.ayto.proyecto.modelo;
// Generated 05-may-2018 19:20:36 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * Usuarios generated by hbm2java
 */
@Entity
@Table(name = "usuarios", uniqueConstraints = { @UniqueConstraint(columnNames = "correo"),
		@UniqueConstraint(columnNames = "dni"), @UniqueConstraint(columnNames = "idEmpleado"),
		@UniqueConstraint(columnNames = "nombreUsuario") })
public class Usuarios implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idUsuario;
	private DepartamentosAyto departamentosAyto;
	private String nombreUsuario;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String puesto;
	private String dni;
	private String correo;
	private Boolean terminalPropio;
	private Boolean activo;
	private Boolean generico;
	private String idEmpleado;
	private Date fechaAlta;
	private Date fechaBaja;
	private String motivoBaja;
	private String observaciones;
	private Set<Entregas> entregases = new HashSet<Entregas>(0);

	public Usuarios() {
	}

	public Usuarios(String nombre, String primerApellido, String dni, String idEmpleado) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.dni = dni;
		this.idEmpleado = idEmpleado;
	}

	public Usuarios(DepartamentosAyto departamentosAyto, String nombreUsuario, String nombre, String primerApellido,
			String segundoApellido, String puesto, String dni, String correo, Boolean terminalPropio, Boolean activo,
			Boolean generico, String idEmpleado, Date fechaAlta, Date fechaBaja, String motivoBaja,
			String observaciones, Set<Entregas> entregases) {
		this.departamentosAyto = departamentosAyto;
		this.nombreUsuario = nombreUsuario;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.puesto = puesto;
		this.dni = dni;
		this.correo = correo;
		this.terminalPropio = terminalPropio;
		this.activo = activo;
		this.generico = generico;
		this.idEmpleado = idEmpleado;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.motivoBaja = motivoBaja;
		this.observaciones = observaciones;
		this.entregases = entregases;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idUsuario", unique = true, nullable = false)
	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	@ManyToOne
	@JoinColumn(name = "idDepAyto")
	public DepartamentosAyto getDepartamentosAyto() {
		return this.departamentosAyto;
	}

	public void setDepartamentosAyto(DepartamentosAyto departamentosAyto) {
		this.departamentosAyto = departamentosAyto;
	}

	@Column(name = "nombreUsuario", unique = true, length = 70)
	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	@Column(name = "nombre", nullable = false, length = 70)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "primerApellido", nullable = false, length = 70)
	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	@Column(name = "segundoApellido", length = 70)
	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	@Column(name = "puesto", length = 70)
	public String getPuesto() {
		return this.puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Column(name = "dni", unique = true, nullable = false, length = 70)
	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Column(name = "correo", unique = true, length = 70)
	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Column(name = "terminalPropio")
	public Boolean getTerminalPropio() {
		return this.terminalPropio;
	}

	public void setTerminalPropio(Boolean terminalPropio) {
		this.terminalPropio = terminalPropio;
	}

	@Column(name = "activo")
	public Boolean getActivo() {
		return this.activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	@Column(name = "generico")
	public Boolean getGenerico() {
		return this.generico;
	}

	public void setGenerico(Boolean generico) {
		this.generico = generico;
	}

	@Column(name = "idEmpleado", unique = true, nullable = false, length = 70)
	public String getIdEmpleado() {
		return this.idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuarios")
	public Set<Entregas> getEntregases() {
		return this.entregases;
	}

	public void setEntregases(Set<Entregas> entregases) {
		this.entregases = entregases;
	}

}
