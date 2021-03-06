package es.jclm.cs.rarasclm.entities;
// Generated 13-ene-2016 9:31:52 by Hibernate Tools 4.3.4.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Caso generated by hbm2java
 */
@Entity
@Table(name = "caso")
public class Caso implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3126864594517417788L;
	private String idCaso;
	private EnfermedadRara enfermedadRara;
	private Paciente paciente;
	private Seccion seccion;
	private Short numCaso;
	private Short declarada;
	private String usuarioDeclara;
	@DateTimeFormat (pattern="YYYY-MM-dd")
	private Date fechaDeclara;
	private String literal;
	private String jucioClinico;
	private String observaciones;
	private String hospital;
	private String nhc;
	private Byte baseDiagnostico;
	private String fuenteInformacion;
	private Boolean fuentePacientesA;
	private Boolean fuenteCmbdC;
	private Boolean fuenteDefcongD;
	private Boolean fuenteEdoE;
	private Boolean fuenteIsocialesG;
	private Boolean fuenteMhuerfH;
	private Boolean fuenteMetabolN;
	private Boolean fuenteRinvI;
	private Boolean fuenteRmortM;
	private Boolean fuenteRcancerT;
	private Boolean fuenteRenalR;
	private Boolean fuenteHcPrimariaV;
	private Boolean fuenteHcEspecializadaU;
	private Boolean fuenteHcPrimariaMasivaP;
	private Boolean fuenteHcEspecializadaMasivaQ;
	private Boolean fuenteOtrosO;
	@DateTimeFormat (pattern="YYYY-MM-dd")
	private Date fechaInicioSintomas;
	@DateTimeFormat (pattern="YYYY-MM-dd")
	private Date fechaDeteccion;
	@DateTimeFormat (pattern="YYYY-MM-dd")
	private Date fechaDiagnostico;
	private String codCie9mc;
	private String codCie10;
	private String codSnomed;
	private String codOmin;
	private String codEdta;
	private String codOtros;
	private String codOtroDeno;
	private String tratamiento;
	private Byte familiaresEnfermedadesRaras;
	private Short otrasEnfermedadesCronicas;
	private String enfermedadesCronicas;
	@DateTimeFormat (pattern="YYYY-MM-dd")
	private Date fechahoraCreacion;
	private String usuarioCreacion;
	@DateTimeFormat (pattern="YYYY-MM-dd")
	private Date fechahoraModificacion;
	private String usuarioModificacion;
	private Boolean borradoLogico;
	private Set<CasoRevisionUsuario> casoRevisionUsuarios = new HashSet<CasoRevisionUsuario>(0);

	public Caso() {
	}

	public Caso(String idCaso, EnfermedadRara enfermedadRara) {
		this.idCaso = idCaso;
		this.enfermedadRara = enfermedadRara;
	}

	public Caso(String idCaso, EnfermedadRara enfermedadRara, Paciente paciente, Seccion seccion, Short numCaso,
			Short declarada, String usuarioDeclara, Date fechaDeclara, String literal, String jucioClinico,
			String observaciones, String hospital, String nhc, Byte baseDiagnostico, String fuenteInformacion,
			Boolean fuentePacientesA, Boolean fuenteCmbdC, Boolean fuenteDefcongD, Boolean fuenteEdoE,
			Boolean fuenteIsocialesG, Boolean fuenteMhuerfH, Boolean fuenteMetabolN, Boolean fuenteRinvI,
			Boolean fuenteRmortM, Boolean fuenteRcancerT, Boolean fuenteRenalR, Boolean fuenteHcPrimariaV,
			Boolean fuenteHcEspecializadaU, Boolean fuenteHcPrimariaMasivaP, Boolean fuenteHcEspecializadaMasivaQ,
			Boolean fuenteOtrosO, Date fechaInicioSintomas, Date fechaDeteccion, Date fechaDiagnostico,
			String codCie9mc, String codCie10, String codSnomed, String codOmin, String codEdta, String codOtros,
			String codOtroDeno, String tratamiento, Byte familiaresEnfermedadesRaras, Short otrasEnfermedadesCronicas,
			String enfermedadesCronicas, Date fechahoraCreacion, String usuarioCreacion, Date fechahoraModificacion,
			String usuarioModificacion, Boolean borradoLogico, Set<CasoRevisionUsuario> casoRevisionUsuarios) {
		this.idCaso = idCaso;
		this.enfermedadRara = enfermedadRara;
		this.paciente = paciente;
		this.seccion = seccion;
		this.numCaso = numCaso;
		this.declarada = declarada;
		this.usuarioDeclara = usuarioDeclara;
		this.fechaDeclara = fechaDeclara;
		this.literal = literal;
		this.jucioClinico = jucioClinico;
		this.observaciones = observaciones;
		this.hospital = hospital;
		this.nhc = nhc;
		this.baseDiagnostico = baseDiagnostico;
		this.fuenteInformacion = fuenteInformacion;
		this.fuentePacientesA = fuentePacientesA;
		this.fuenteCmbdC = fuenteCmbdC;
		this.fuenteDefcongD = fuenteDefcongD;
		this.fuenteEdoE = fuenteEdoE;
		this.fuenteIsocialesG = fuenteIsocialesG;
		this.fuenteMhuerfH = fuenteMhuerfH;
		this.fuenteMetabolN = fuenteMetabolN;
		this.fuenteRinvI = fuenteRinvI;
		this.fuenteRmortM = fuenteRmortM;
		this.fuenteRcancerT = fuenteRcancerT;
		this.fuenteRenalR = fuenteRenalR;
		this.fuenteHcPrimariaV = fuenteHcPrimariaV;
		this.fuenteHcEspecializadaU = fuenteHcEspecializadaU;
		this.fuenteHcPrimariaMasivaP = fuenteHcPrimariaMasivaP;
		this.fuenteHcEspecializadaMasivaQ = fuenteHcEspecializadaMasivaQ;
		this.fuenteOtrosO = fuenteOtrosO;
		this.fechaInicioSintomas = fechaInicioSintomas;
		this.fechaDeteccion = fechaDeteccion;
		this.fechaDiagnostico = fechaDiagnostico;
		this.codCie9mc = codCie9mc;
		this.codCie10 = codCie10;
		this.codSnomed = codSnomed;
		this.codOmin = codOmin;
		this.codEdta = codEdta;
		this.codOtros = codOtros;
		this.codOtroDeno = codOtroDeno;
		this.tratamiento = tratamiento;
		this.familiaresEnfermedadesRaras = familiaresEnfermedadesRaras;
		this.otrasEnfermedadesCronicas = otrasEnfermedadesCronicas;
		this.enfermedadesCronicas = enfermedadesCronicas;
		this.fechahoraCreacion = fechahoraCreacion;
		this.usuarioCreacion = usuarioCreacion;
		this.fechahoraModificacion = fechahoraModificacion;
		this.usuarioModificacion = usuarioModificacion;
		this.borradoLogico = borradoLogico;
		this.casoRevisionUsuarios = casoRevisionUsuarios;
	}

	@Id
	@Column(name = "id_caso", unique = true, nullable = false, length = 10)
	public String getIdCaso() {
		return this.idCaso;
	}

	public void setIdCaso(String idCaso) {
		this.idCaso = idCaso;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "enfrara", nullable = false)
	public EnfermedadRara getEnfermedadRara() {
		return this.enfermedadRara;
	}

	public void setEnfermedadRara(EnfermedadRara enfermedadRara) {
		this.enfermedadRara = enfermedadRara;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "paciente")
	@JsonManagedReference
	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "seccion")
	public Seccion getSeccion() {
		return this.seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	@Column(name = "num_caso")
	public Short getNumCaso() {
		return this.numCaso;
	}

	public void setNumCaso(Short numCaso) {
		this.numCaso = numCaso;
	}

	@Column(name = "declarada")
	public Short getDeclarada() {
		return this.declarada;
	}

	public void setDeclarada(Short declarada) {
		this.declarada = declarada;
	}

	@Column(name = "usuario_declara", length = 45)
	public String getUsuarioDeclara() {
		return this.usuarioDeclara;
	}

	public void setUsuarioDeclara(String usuarioDeclara) {
		this.usuarioDeclara = usuarioDeclara;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_declara", length = 10)
	public Date getFechaDeclara() {
		return this.fechaDeclara;
	}

	public void setFechaDeclara(Date fechaDeclara) {
		this.fechaDeclara = fechaDeclara;
	}

	@Column(name = "literal")
	public String getLiteral() {
		return this.literal;
	}

	public void setLiteral(String literal) {
		this.literal = literal;
	}

	@Column(name = "jucio_clinico", length = 1014)
	public String getJucioClinico() {
		return this.jucioClinico;
	}

	public void setJucioClinico(String jucioClinico) {
		this.jucioClinico = jucioClinico;
	}

	@Column(name = "observaciones", length = 4096)
	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Column(name = "hospital", length = 6)
	public String getHospital() {
		return this.hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	@Column(name = "nhc", length = 12)
	public String getNhc() {
		return this.nhc;
	}

	public void setNhc(String nhc) {
		this.nhc = nhc;
	}

	@Column(name = "base_diagnostico")
	public Byte getBaseDiagnostico() {
		return this.baseDiagnostico;
	}

	public void setBaseDiagnostico(Byte baseDiagnostico) {
		this.baseDiagnostico = baseDiagnostico;
	}

	@Column(name = "fuente_informacion", length = 20)
	public String getFuenteInformacion() {
		return this.fuenteInformacion;
	}

	public void setFuenteInformacion(String fuenteInformacion) {
		this.fuenteInformacion = fuenteInformacion;
	}

	@Column(name = "fuente_pacientes_A")
	public Boolean getFuentePacientesA() {
		return this.fuentePacientesA;
	}

	public void setFuentePacientesA(Boolean fuentePacientesA) {
		this.fuentePacientesA = fuentePacientesA;
	}

	@Column(name = "fuente_cmbd_C")
	public Boolean getFuenteCmbdC() {
		return this.fuenteCmbdC;
	}

	public void setFuenteCmbdC(Boolean fuenteCmbdC) {
		this.fuenteCmbdC = fuenteCmbdC;
	}

	@Column(name = "fuente_defcong_D")
	public Boolean getFuenteDefcongD() {
		return this.fuenteDefcongD;
	}

	public void setFuenteDefcongD(Boolean fuenteDefcongD) {
		this.fuenteDefcongD = fuenteDefcongD;
	}

	@Column(name = "fuente_edo_E")
	public Boolean getFuenteEdoE() {
		return this.fuenteEdoE;
	}

	public void setFuenteEdoE(Boolean fuenteEdoE) {
		this.fuenteEdoE = fuenteEdoE;
	}

	@Column(name = "fuente_isociales_G")
	public Boolean getFuenteIsocialesG() {
		return this.fuenteIsocialesG;
	}

	public void setFuenteIsocialesG(Boolean fuenteIsocialesG) {
		this.fuenteIsocialesG = fuenteIsocialesG;
	}

	@Column(name = "fuente_mhuerf_H")
	public Boolean getFuenteMhuerfH() {
		return this.fuenteMhuerfH;
	}

	public void setFuenteMhuerfH(Boolean fuenteMhuerfH) {
		this.fuenteMhuerfH = fuenteMhuerfH;
	}

	@Column(name = "fuente_metabol_N")
	public Boolean getFuenteMetabolN() {
		return this.fuenteMetabolN;
	}

	public void setFuenteMetabolN(Boolean fuenteMetabolN) {
		this.fuenteMetabolN = fuenteMetabolN;
	}

	@Column(name = "fuente_rinv_I")
	public Boolean getFuenteRinvI() {
		return this.fuenteRinvI;
	}

	public void setFuenteRinvI(Boolean fuenteRinvI) {
		this.fuenteRinvI = fuenteRinvI;
	}

	@Column(name = "fuente_rmort_M")
	public Boolean getFuenteRmortM() {
		return this.fuenteRmortM;
	}

	public void setFuenteRmortM(Boolean fuenteRmortM) {
		this.fuenteRmortM = fuenteRmortM;
	}

	@Column(name = "fuente_rcancer_T")
	public Boolean getFuenteRcancerT() {
		return this.fuenteRcancerT;
	}

	public void setFuenteRcancerT(Boolean fuenteRcancerT) {
		this.fuenteRcancerT = fuenteRcancerT;
	}

	@Column(name = "fuente_renal_R")
	public Boolean getFuenteRenalR() {
		return this.fuenteRenalR;
	}

	public void setFuenteRenalR(Boolean fuenteRenalR) {
		this.fuenteRenalR = fuenteRenalR;
	}

	@Column(name = "fuente_hc_primaria_V")
	public Boolean getFuenteHcPrimariaV() {
		return this.fuenteHcPrimariaV;
	}

	public void setFuenteHcPrimariaV(Boolean fuenteHcPrimariaV) {
		this.fuenteHcPrimariaV = fuenteHcPrimariaV;
	}

	@Column(name = "fuente_hc_especializada_U")
	public Boolean getFuenteHcEspecializadaU() {
		return this.fuenteHcEspecializadaU;
	}

	public void setFuenteHcEspecializadaU(Boolean fuenteHcEspecializadaU) {
		this.fuenteHcEspecializadaU = fuenteHcEspecializadaU;
	}

	@Column(name = "fuente_hc_primaria_masiva_P")
	public Boolean getFuenteHcPrimariaMasivaP() {
		return this.fuenteHcPrimariaMasivaP;
	}

	public void setFuenteHcPrimariaMasivaP(Boolean fuenteHcPrimariaMasivaP) {
		this.fuenteHcPrimariaMasivaP = fuenteHcPrimariaMasivaP;
	}

	@Column(name = "fuente_hc_especializada_masiva_Q")
	public Boolean getFuenteHcEspecializadaMasivaQ() {
		return this.fuenteHcEspecializadaMasivaQ;
	}

	public void setFuenteHcEspecializadaMasivaQ(Boolean fuenteHcEspecializadaMasivaQ) {
		this.fuenteHcEspecializadaMasivaQ = fuenteHcEspecializadaMasivaQ;
	}

	@Column(name = "fuente_otros_O")
	public Boolean getFuenteOtrosO() {
		return this.fuenteOtrosO;
	}

	public void setFuenteOtrosO(Boolean fuenteOtrosO) {
		this.fuenteOtrosO = fuenteOtrosO;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_inicio_sintomas", length = 10)
	public Date getFechaInicioSintomas() {
		return this.fechaInicioSintomas;
	}

	public void setFechaInicioSintomas(Date fechaInicioSintomas) {
		this.fechaInicioSintomas = fechaInicioSintomas;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_deteccion", length = 10)
	public Date getFechaDeteccion() {
		return this.fechaDeteccion;
	}

	public void setFechaDeteccion(Date fechaDeteccion) {
		this.fechaDeteccion = fechaDeteccion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_diagnostico", length = 10)
	public Date getFechaDiagnostico() {
		return this.fechaDiagnostico;
	}

	public void setFechaDiagnostico(Date fechaDiagnostico) {
		this.fechaDiagnostico = fechaDiagnostico;
	}

	@Column(name = "cod_cie9mc", length = 6)
	public String getCodCie9mc() {
		return this.codCie9mc;
	}

	public void setCodCie9mc(String codCie9mc) {
		this.codCie9mc = codCie9mc;
	}

	@Column(name = "cod_cie10", length = 6)
	public String getCodCie10() {
		return this.codCie10;
	}

	public void setCodCie10(String codCie10) {
		this.codCie10 = codCie10;
	}

	@Column(name = "cod_snomed", length = 20)
	public String getCodSnomed() {
		return this.codSnomed;
	}

	public void setCodSnomed(String codSnomed) {
		this.codSnomed = codSnomed;
	}

	@Column(name = "cod_omin", length = 10)
	public String getCodOmin() {
		return this.codOmin;
	}

	public void setCodOmin(String codOmin) {
		this.codOmin = codOmin;
	}

	@Column(name = "cod_edta", length = 10)
	public String getCodEdta() {
		return this.codEdta;
	}

	public void setCodEdta(String codEdta) {
		this.codEdta = codEdta;
	}

	@Column(name = "cod_otros", length = 20)
	public String getCodOtros() {
		return this.codOtros;
	}

	public void setCodOtros(String codOtros) {
		this.codOtros = codOtros;
	}

	@Column(name = "cod_otro_deno", length = 45)
	public String getCodOtroDeno() {
		return this.codOtroDeno;
	}

	public void setCodOtroDeno(String codOtroDeno) {
		this.codOtroDeno = codOtroDeno;
	}

	@Column(name = "tratamiento", length = 4096)
	public String getTratamiento() {
		return this.tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	@Column(name = "familiares_enfermedades_raras")
	public Byte getFamiliaresEnfermedadesRaras() {
		return this.familiaresEnfermedadesRaras;
	}

	public void setFamiliaresEnfermedadesRaras(Byte familiaresEnfermedadesRaras) {
		this.familiaresEnfermedadesRaras = familiaresEnfermedadesRaras;
	}

	@Column(name = "otras_enfermedades_cronicas")
	public Short getOtrasEnfermedadesCronicas() {
		return this.otrasEnfermedadesCronicas;
	}

	public void setOtrasEnfermedadesCronicas(Short otrasEnfermedadesCronicas) {
		this.otrasEnfermedadesCronicas = otrasEnfermedadesCronicas;
	}

	@Column(name = "enfermedades_cronicas", length = 1024)
	public String getEnfermedadesCronicas() {
		return this.enfermedadesCronicas;
	}

	public void setEnfermedadesCronicas(String enfermedadesCronicas) {
		this.enfermedadesCronicas = enfermedadesCronicas;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechahora_creacion", length = 19)
	public Date getFechahoraCreacion() {
		return this.fechahoraCreacion;
	}

	public void setFechahoraCreacion(Date fechahoraCreacion) {
		this.fechahoraCreacion = fechahoraCreacion;
	}

	@Column(name = "usuario_creacion", length = 45)
	public String getUsuarioCreacion() {
		return this.usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechahora_modificacion", length = 19)
	public Date getFechahoraModificacion() {
		return this.fechahoraModificacion;
	}

	public void setFechahoraModificacion(Date fechahoraModificacion) {
		this.fechahoraModificacion = fechahoraModificacion;
	}

	@Column(name = "usuario_modificacion", length = 45)
	public String getUsuarioModificacion() {
		return this.usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	@Column(name = "borrado_logico")
	public Boolean getBorradoLogico() {
		return this.borradoLogico;
	}

	public void setBorradoLogico(Boolean borradoLogico) {
		this.borradoLogico = borradoLogico;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "caso")
	@JsonBackReference
	public Set<CasoRevisionUsuario> getCasoRevisionUsuarios() {
		return this.casoRevisionUsuarios;
	}

	public void setCasoRevisionUsuarios(Set<CasoRevisionUsuario> casoRevisionUsuarios) {
		this.casoRevisionUsuarios = casoRevisionUsuarios;
	}

}
