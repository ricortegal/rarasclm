package es.jclm.cs.rarasclm.entities;// default package
// Generated 26-nov-2015 14:41:38 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EnfermedadRaraHasEnfermedadRaraSnomedId generated by hbm2java
 */
@Embeddable
public class EnfermedadRaraHasEnfermedadRaraSnomedId implements java.io.Serializable {

    private String enfermedadRaraId;
    private long snomedId;

    public EnfermedadRaraHasEnfermedadRaraSnomedId() {
    }

    public EnfermedadRaraHasEnfermedadRaraSnomedId(String enfermedadRaraId, long snomedId) {
	this.enfermedadRaraId = enfermedadRaraId;
	this.snomedId = snomedId;
    }

    @Column(name = "enfermedad_rara_id", nullable = false, length = 10)
    public String getEnfermedadRaraId() {
	return this.enfermedadRaraId;
    }

    public void setEnfermedadRaraId(String enfermedadRaraId) {
	this.enfermedadRaraId = enfermedadRaraId;
    }

    @Column(name = "snomed_id", nullable = false)
    public long getSnomedId() {
	return this.snomedId;
    }

    public void setSnomedId(long snomedId) {
	this.snomedId = snomedId;
    }

    public boolean equals(Object other) {
	if ((this == other))
	    return true;
	if ((other == null))
	    return false;
	if (!(other instanceof EnfermedadRaraHasEnfermedadRaraSnomedId))
	    return false;
	EnfermedadRaraHasEnfermedadRaraSnomedId castOther = (EnfermedadRaraHasEnfermedadRaraSnomedId) other;

	return ((this.getEnfermedadRaraId() == castOther.getEnfermedadRaraId())
		|| (this.getEnfermedadRaraId() != null && castOther.getEnfermedadRaraId() != null
			&& this.getEnfermedadRaraId().equals(castOther.getEnfermedadRaraId())))
		&& (this.getSnomedId() == castOther.getSnomedId());
    }

    public int hashCode() {
	int result = 17;

	result = 37 * result + (getEnfermedadRaraId() == null ? 0 : this.getEnfermedadRaraId().hashCode());
	result = 37 * result + (int) this.getSnomedId();
	return result;
    }

}
