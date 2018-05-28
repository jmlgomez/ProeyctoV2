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
 * LotesTerminales generated by hbm2java
 */
@Entity
@Table(name = "lotesTerminales")
public class LotesTerminales implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idLoteTerminal;
	private String lote;
	private Set<Terminales> terminaleses = new HashSet<Terminales>(0);

	public LotesTerminales() {
	}

	public LotesTerminales(String lote) {
		this.lote = lote;
	}

	public LotesTerminales(String lote, Set<Terminales> terminaleses) {
		this.lote = lote;
		this.terminaleses = terminaleses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idLoteTerminal", unique = true, nullable = false)
	public Integer getIdLoteTerminal() {
		return this.idLoteTerminal;
	}

	public void setIdLoteTerminal(Integer idLoteTerminal) {
		this.idLoteTerminal = idLoteTerminal;
	}

	@Column(name = "lote", nullable = false, length = 70)
	public String getLote() {
		return this.lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lotesTerminales")
	public Set<Terminales> getTerminaleses() {
		return this.terminaleses;
	}

	public void setTerminaleses(Set<Terminales> terminaleses) {
		this.terminaleses = terminaleses;
	}
	
	@Override
    public String toString() {
        return String.format("%s[id=%d]", getClass().getSimpleName(), getIdLoteTerminal());
    }

}
