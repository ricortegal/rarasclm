package es.jclm.cs.rarasclm.entities;
// Generated 05-jun-2016 17:26:24 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Roles generated by hbm2java
 */
@Entity
@Table(name = "roles", catalog = "RARASCLM")
public class Roles implements java.io.Serializable {

	private int id;
	private String deno;
	private Set<Users> userses = new HashSet<Users>(0);

	public Roles() {
	}

	public Roles(int id, String deno) {
		this.id = id;
		this.deno = deno;
	}

	public Roles(int id, String deno, Set<Users> userses) {
		this.id = id;
		this.deno = deno;
		this.userses = userses;
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

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "roleses")
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

}