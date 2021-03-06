package es.jclm.cs.rarasclm.entities;
// Generated 13-ago-2016 9:31:52 by Hibernate Tools 4.3.4.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CasoRevisionUsuarioId generated by hbm2java
 */
@Embeddable
public class CasoRevisionUsuarioId implements java.io.Serializable {

	private String usuario;
	private String caso;
	private int numRev;

	public CasoRevisionUsuarioId() {
	}

	public CasoRevisionUsuarioId(String usuario, String caso, int numRev) {
		this.usuario = usuario;
		this.caso = caso;
		this.numRev = numRev;
	}

	@Column(name = "usuario", nullable = false, length = 45)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Column(name = "caso", nullable = false, length = 10)
	public String getCaso() {
		return this.caso;
	}

	public void setCaso(String caso) {
		this.caso = caso;
	}

	@Column(name = "num_rev", nullable = false)
	public int getNumRev() {
		return this.numRev;
	}

	public void setNumRev(int numRev) {
		this.numRev = numRev;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CasoRevisionUsuarioId))
			return false;
		CasoRevisionUsuarioId castOther = (CasoRevisionUsuarioId) other;

		return ((this.getUsuario() == castOther.getUsuario()) || (this.getUsuario() != null
				&& castOther.getUsuario() != null && this.getUsuario().equals(castOther.getUsuario())))
				&& ((this.getCaso() == castOther.getCaso()) || (this.getCaso() != null && castOther.getCaso() != null
						&& this.getCaso().equals(castOther.getCaso())))
				&& (this.getNumRev() == castOther.getNumRev());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUsuario() == null ? 0 : this.getUsuario().hashCode());
		result = 37 * result + (getCaso() == null ? 0 : this.getCaso().hashCode());
		result = 37 * result + this.getNumRev();
		return result;
	}

}
