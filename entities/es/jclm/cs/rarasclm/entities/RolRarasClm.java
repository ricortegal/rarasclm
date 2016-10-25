package es.jclm.cs.rarasclm.entities;
// Generated 21-oct-2016 11:12:51 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * RolRarasClm generated by hbm2java
 */
@Entity
@Table(name = "rol_raras_clm", catalog = "rarasclmtest")
public class RolRarasClm implements java.io.Serializable {

	private int id;
	private String deno;
	private Set<UserRarasClm> userRarasClms = new HashSet<UserRarasClm>(0);

	public RolRarasClm() {
	}

	public RolRarasClm(int id, String deno) {
		this.id = id;
		this.deno = deno;
	}

	public RolRarasClm(int id, String deno, Set<UserRarasClm> userRarasClms) {
		this.id = id;
		this.deno = deno;
		this.userRarasClms = userRarasClms;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "deno", nullable = false, length = 45)
	public String getDeno() {
		return this.deno;
	}

	public void setDeno(String deno) {
		this.deno = deno;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "rolRarasClms")
	public Set<UserRarasClm> getUserRarasClms() {
		return this.userRarasClms;
	}

	public void setUserRarasClms(Set<UserRarasClm> userRarasClms) {
		this.userRarasClms = userRarasClms;
	}

}