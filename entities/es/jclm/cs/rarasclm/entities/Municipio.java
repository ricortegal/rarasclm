package es.jclm.cs.rarasclm.entities;
// Generated 07-nov-2016 13:43:26 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Municipio generated by hbm2java
 */
@Entity
@Table(name = "municipio", catalog = "rarasclmtest")
public class Municipio implements java.io.Serializable {

	private String municipio;
	private Provincia provincia;
	private String deno;
	private String ccaa;
	private Integer seccion;

	public Municipio() {
	}

	public Municipio(String municipio) {
		this.municipio = municipio;
	}

	public Municipio(String municipio, Provincia provincia, String deno, String ccaa, Integer seccion) {
		this.municipio = municipio;
		this.provincia = provincia;
		this.deno = deno;
		this.ccaa = ccaa;
		this.seccion = seccion;
	}

	@Id

	@Column(name = "municipio", unique = true, nullable = false, length = 5)
	public String getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "provincia")
	public Provincia getProvincia() {
		return this.provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Column(name = "deno", length = 70)
	public String getDeno() {
		return this.deno;
	}

	public void setDeno(String deno) {
		this.deno = deno;
	}

	@Column(name = "ccaa", length = 2)
	public String getCcaa() {
		return this.ccaa;
	}

	public void setCcaa(String ccaa) {
		this.ccaa = ccaa;
	}

	@Column(name = "seccion")
	public Integer getSeccion() {
		return this.seccion;
	}

	public void setSeccion(Integer seccion) {
		this.seccion = seccion;
	}

}
