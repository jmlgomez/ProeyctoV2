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
 * TiposTarjetas generated by hbm2java
 */
@Entity
@Table(name = "tiposTarjetas")
public class TiposTarjetas implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idTipoTarjeta;
	private String tipoTarjeta;
	private String observaciones;
	private Boolean activo;
	private Set<Tarjetas> tarjetases = new HashSet<Tarjetas>(0);

	public TiposTarjetas() {
	}

	public TiposTarjetas(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	public TiposTarjetas(String tipoTarjeta, String observaciones, Boolean activo, Set<Tarjetas> tarjetases) {
		this.tipoTarjeta = tipoTarjeta;
		this.observaciones = observaciones;
		this.activo = activo;
		this.tarjetases = tarjetases;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idTipoTarjeta", unique = true, nullable = false)
	public Integer getIdTipoTarjeta() {
		return this.idTipoTarjeta;
	}

	public void setIdTipoTarjeta(Integer idTipoTarjeta) {
		this.idTipoTarjeta = idTipoTarjeta;
	}

	@Column(name = "tipoTarjeta", nullable = false, length = 70)
	public String getTipoTarjeta() {
		return this.tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tiposTarjetas")
	public Set<Tarjetas> getTarjetases() {
		return this.tarjetases;
	}

	public void setTarjetases(Set<Tarjetas> tarjetases) {
		this.tarjetases = tarjetases;
	}
	
	@Override
    public String toString() {
        return String.format("%s[id=%d]", getClass().getSimpleName(), getIdTipoTarjeta());
    }

	@Override
    public boolean equals(Object obj) {
          if (getClass() != obj.getClass()) 
              return false;
          return idTipoTarjeta.equals(((TiposTarjetas)obj).idTipoTarjeta);
	
}
}
