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
 * Marcas generated by hbm2java
 */
@Entity
@Table(name = "marcas")
public class Marcas implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idMarca;
	private String marca;
	private Set<ModelosTerminales> modelosTerminaleses = new HashSet<ModelosTerminales>(0);
	private Set<ModelosDispositivos> modelosDispositivoses = new HashSet<ModelosDispositivos>(0);

	public Marcas() {
	}

	public Marcas(String marca) {
		this.marca = marca;
	}

	public Marcas(String marca, Set<ModelosTerminales> modelosTerminaleses, Set<ModelosDispositivos> modelosDispositivoses) {
		this.marca = marca;
		this.modelosTerminaleses = modelosTerminaleses;
		this.modelosDispositivoses = modelosDispositivoses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idMarca", unique = true, nullable = false)
	public Integer getIdMarca() {
		return this.idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

	@Column(name = "marca", nullable = false, length = 70)
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "marcas")
	public Set<ModelosTerminales> getModelosTerminaleses() {
		return this.modelosTerminaleses;
	}

	public void setModelosTerminaleses(Set<ModelosTerminales> modelosTerminaleses) {
		this.modelosTerminaleses = modelosTerminaleses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "marcas")
	public Set<ModelosDispositivos> getModelosDispositivoses() {
		return this.modelosDispositivoses;
	}

	public void setModelosDispositivoses(Set<ModelosDispositivos> modelosDispositivoses) {
		this.modelosDispositivoses = modelosDispositivoses;
	}

}
