package es.jclm.cs.rarasclm.entities;
// Generated 10-ago-2016 9:15:45 by Hibernate Tools 4.3.4.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Hospital generated by hbm2java
 */
@Entity
@Table(name = "hospital")
public class Hospital implements java.io.Serializable {

	private String idHospital;
	private String literal;
	private int seccion;
	private Set<HistoriaClinica> historiaClinicas = new HashSet<HistoriaClinica>(0);

	public Hospital() {
	}

	public Hospital(String idHospital) {
		this.idHospital = idHospital;
	}

	public Hospital(String idHospital, String literal, int seccion, Set<HistoriaClinica> historiaClinicas) {
		this.idHospital = idHospital;
		this.literal = literal;
		this.seccion = seccion;
		this.historiaClinicas = historiaClinicas;
	}

	@Id

	@Column(name = "id_hospital", unique = true, nullable = false, length = 6)
	public String getIdHospital() {
		return this.idHospital;
	}

	public void setIdHospital(String idHospital) {
		this.idHospital = idHospital;
	}

	@Column(name = "literal", length = 250)
	public String getLiteral() {
		return this.literal;
	}

	public void setLiteral(String literal) {
		this.literal = literal;
	}
	
	@Column(name = "secccion")
	public int getSeccion() {
		return seccion;
	}

	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hospital")
	public Set<HistoriaClinica> getHistoriaClinicas() {
		return this.historiaClinicas;
	}

	public void setHistoriaClinicas(Set<HistoriaClinica> historiaClinicas) {
		this.historiaClinicas = historiaClinicas;
	}
	
	

}
