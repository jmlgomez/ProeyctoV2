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
 * TiposTarifas generated by hbm2java
 */
@Entity
@Table(name = "tiposTarifas")
public class TiposTarifas implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idTipoTarifa;
	private String tipoTarifa;
	private String observaciones;
	private Boolean activo;
	private Set<Tarjetas> tarjetases = new HashSet<Tarjetas>(0);

	public TiposTarifas() {
	}

	public TiposTarifas(String tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
	}

	public TiposTarifas(String tipoTarifa, String observaciones, Boolean activo, Set<Tarjetas> tarjetases) {
		this.tipoTarifa = tipoTarifa;
		this.observaciones = observaciones;
		this.activo = activo;
		this.tarjetases = tarjetases;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idTipoTarifa", unique = true, nullable = false)
	public Integer getIdTipoTarifa() {
		return this.idTipoTarifa;
	}

	public void setIdTipoTarifa(Integer idTipoTarifa) {
		this.idTipoTarifa = idTipoTarifa;
	}

	@Column(name = "tipoTarifa", nullable = false, length = 70)
	public String getTipoTarifa() {
		return this.tipoTarifa;
	}

	public void setTipoTarifa(String tipoTarifa) {
		this.tipoTarifa = tipoTarifa;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tiposTarifas")
	public Set<Tarjetas> getTarjetases() {
		return this.tarjetases;
	}

	public void setTarjetases(Set<Tarjetas> tarjetases) {
		this.tarjetases = tarjetases;
	}
	@Override
    public String toString() {
        return String.format("%s[id=%d]", getClass().getSimpleName(), getIdTipoTarifa());
    }
	
	@Override
    public boolean equals(Object obj) {
          if (getClass() != obj.getClass()) 
              return false;
          return idTipoTarifa.equals(((TiposTarifas)obj).idTipoTarifa);
    }

}
