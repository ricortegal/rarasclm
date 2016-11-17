package es.jclm.cs.rarasclm.entities;
// Generated 07-nov-2016 13:43:26 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EnfermedadRara generated by hbm2java
 */
@Entity
@Table(name = "enfermedad_rara", catalog = "rarasclmtest")
public class EnfermedadRara implements java.io.Serializable {

	private String enfermedadRaraId;
	private String literal;
	private String otroCod;
	private String denoOtro;
	private String descripcion;
	private String url;
	private Date ultimaActualizacion;
	private String notas;
	private String cie9mc;
	private String cie10;
	private Set<Caso> casos = new HashSet<Caso>(0);
	private Set<EnfermedadCie9mc> enfermedadCie9mcs = new HashSet<EnfermedadCie9mc>(0);
	private Set<EnfermedadCie10> enfermedadCie10s = new HashSet<EnfermedadCie10>(0);

	public EnfermedadRara() {
	}

	public EnfermedadRara(String enfermedadRaraId) {
		this.enfermedadRaraId = enfermedadRaraId;
	}

	public EnfermedadRara(String enfermedadRaraId, String literal, String otroCod, String denoOtro, String descripcion,
			String url, Date ultimaActualizacion, String notas, String cie9mc, String cie10, Set<Caso> casos,
			Set<EnfermedadCie9mc> enfermedadCie9mcs, Set<EnfermedadCie10> enfermedadCie10s) {
		this.enfermedadRaraId = enfermedadRaraId;
		this.literal = literal;
		this.otroCod = otroCod;
		this.denoOtro = denoOtro;
		this.descripcion = descripcion;
		this.url = url;
		this.ultimaActualizacion = ultimaActualizacion;
		this.notas = notas;
		this.cie9mc = cie9mc;
		this.cie10 = cie10;
		this.casos = casos;
		this.enfermedadCie9mcs = enfermedadCie9mcs;
		this.enfermedadCie10s = enfermedadCie10s;
	}

	@Id

	@Column(name = "enfermedad_rara_id", unique = true, nullable = false, length = 10)
	public String getEnfermedadRaraId() {
		return this.enfermedadRaraId;
	}

	public void setEnfermedadRaraId(String enfermedadRaraId) {
		this.enfermedadRaraId = enfermedadRaraId;
	}

	@Column(name = "literal")
	public String getLiteral() {
		return this.literal;
	}

	public void setLiteral(String literal) {
		this.literal = literal;
	}

	@Column(name = "otro_cod", length = 50)
	public String getOtroCod() {
		return this.otroCod;
	}

	public void setOtroCod(String otroCod) {
		this.otroCod = otroCod;
	}

	@Column(name = "deno_otro", length = 50)
	public String getDenoOtro() {
		return this.denoOtro;
	}

	public void setDenoOtro(String denoOtro) {
		this.denoOtro = denoOtro;
	}

	@Column(name = "descripcion", length = 4000)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ultima_actualizacion", length = 19)
	public Date getUltimaActualizacion() {
		return this.ultimaActualizacion;
	}

	public void setUltimaActualizacion(Date ultimaActualizacion) {
		this.ultimaActualizacion = ultimaActualizacion;
	}

	@Column(name = "notas")
	public String getNotas() {
		return this.notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	@Column(name = "cie9mc", length = 6)
	public String getCie9mc() {
		return this.cie9mc;
	}

	public void setCie9mc(String cie9mc) {
		this.cie9mc = cie9mc;
	}

	@Column(name = "cie10", length = 5)
	public String getCie10() {
		return this.cie10;
	}

	public void setCie10(String cie10) {
		this.cie10 = cie10;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "enfermedadRara")
	public Set<Caso> getCasos() {
		return this.casos;
	}

	public void setCasos(Set<Caso> casos) {
		this.casos = casos;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "enfermedad_rara_enfermedad_cie9mc", catalog = "rarasclmtest", joinColumns = {
			@JoinColumn(name = "enfermedad_rara_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "cie9_id", nullable = false, updatable = false) })
	public Set<EnfermedadCie9mc> getEnfermedadCie9mcs() {
		return this.enfermedadCie9mcs;
	}

	public void setEnfermedadCie9mcs(Set<EnfermedadCie9mc> enfermedadCie9mcs) {
		this.enfermedadCie9mcs = enfermedadCie9mcs;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "enfermedad_rara_enfermedad_cie10", catalog = "rarasclmtest", joinColumns = {
			@JoinColumn(name = "enfermedad_rara_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "cie10_id", nullable = false, updatable = false) })
	public Set<EnfermedadCie10> getEnfermedadCie10s() {
		return this.enfermedadCie10s;
	}

	public void setEnfermedadCie10s(Set<EnfermedadCie10> enfermedadCie10s) {
		this.enfermedadCie10s = enfermedadCie10s;
	}

}
