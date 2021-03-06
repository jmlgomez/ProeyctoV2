package com.ayto.proyecto.modelo;
// Generated 05-may-2018 19:20:36 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * EstadosTarjetas generated by hbm2java
 */
@Entity
@Table(name = "estadosTarjetas")
public class EstadosTarjetas implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idEstadoTarjeta;
	private String estadoTarjeta;
	private String observaciones;
	private Boolean activo;
	private Set<Tarjetas> tarjetases = new HashSet<Tarjetas>(0);

	public EstadosTarjetas() {
	}

	public EstadosTarjetas(String estadoTarjeta) {
		this.estadoTarjeta = estadoTarjeta;
	}

	public EstadosTarjetas(String estadoTarjeta, String observaciones, Boolean activo, Set<Tarjetas> tarjetases) {
		this.estadoTarjeta = estadoTarjeta;
		this.observaciones = observaciones;
		this.activo = activo;
		this.tarjetases = tarjetases;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idEstadoTarjeta", unique = true, nullable = false)
	public Integer getIdEstadoTarjeta() {
		return this.idEstadoTarjeta;
	}

	public void setIdEstadoTarjeta(Integer idEstadoTarjeta) {
		this.idEstadoTarjeta = idEstadoTarjeta;
	}

	@Column(name = "estadoTarjeta", nullable = false, length = 70)
	public String getEstadoTarjeta() {
		return this.estadoTarjeta;
	}

	public void setEstadoTarjeta(String estadoTarjeta) {
		this.estadoTarjeta = estadoTarjeta;
	}

	@Column(name = "observaciones", length = 250)
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Column(name = "activo")
	public Boolean getActivo() {
		return this.activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estadosTarjetas")
	public Set<Tarjetas> getTarjetases() {
		return this.tarjetases;
	}

	public void setTarjetases(Set<Tarjetas> tarjetases) {
		this.tarjetases = tarjetases;
	}
	@Override
    public String toString() {
        return String.format("%s[id=%d]", getClass().getSimpleName(), getIdEstadoTarjeta());
    }

	//Necesario para que guarde los cambios cuando se modifican valores en los despleglable.
		@Override
	    public boolean equals(Object obj) {
	          if (getClass() != obj.getClass()) 
	              return false;
	          return idEstadoTarjeta.equals(((EstadosTarjetas)obj).idEstadoTarjeta);
	    }
	
}
