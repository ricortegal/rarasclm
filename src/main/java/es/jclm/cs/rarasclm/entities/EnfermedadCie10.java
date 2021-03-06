package es.jclm.cs.rarasclm.entities;
// Generated 10-ago-2016 9:15:45 by Hibernate Tools 4.3.4.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * EnfermedadCie10 generated by hbm2java
 */
@Entity
@Table(name = "enfermedad_cie10")
public class EnfermedadCie10 implements java.io.Serializable {

	private String cie10Id;
	private String literal;
	private String url;
	private String notas;
	private Set<EnfermedadRara> enfermedadRaras = new HashSet<EnfermedadRara>(0);

	public EnfermedadCie10() {
	}

	public EnfermedadCie10(String cie10Id) {
		this.cie10Id = cie10Id;
	}

	public EnfermedadCie10(String cie10Id, String literal, String url, String notas,
			Set<EnfermedadRara> enfermedadRaras) {
		this.cie10Id = cie10Id;
		this.literal = literal;
		this.url = url;
		this.notas = notas;
		this.enfermedadRaras = enfermedadRaras;
	}

	@Id

	@Column(name = "cie10_id", unique = true, nullable = false, length = 5)
	public String getCie10Id() {
		return this.cie10Id;
	}

	public void setCie10Id(String cie10Id) {
		this.cie10Id = cie10Id;
	}

	@Column(name = "literal")
	public String getLiteral() {
		return this.literal;
	}

	public void setLiteral(String literal) {
		this.literal = literal;
	}

	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "notas")
	public String getNotas() {
		return this.notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "enfermedadCie10s")
	public Set<EnfermedadRara> getEnfermedadRaras() {
		return this.enfermedadRaras;
	}

	public void setEnfermedadRaras(Set<EnfermedadRara> enfermedadRaras) {
		this.enfermedadRaras = enfermedadRaras;
	}

}
