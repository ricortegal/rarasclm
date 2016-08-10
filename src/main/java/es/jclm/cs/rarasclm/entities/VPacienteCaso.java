package es.jclm.cs.rarasclm.entities;
// Generated 10-ago-2016 9:15:45 by Hibernate Tools 4.3.4.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VPacienteCaso generated by hbm2java
 */
@Entity
@Table(name = "v_paciente_caso", catalog = "rarasclm")
public class VPacienteCaso implements java.io.Serializable {

	private VPacienteCasoId id;

	public VPacienteCaso() {
	}

	public VPacienteCaso(VPacienteCasoId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idPaciente", column = @Column(name = "id_paciente", nullable = false)),
			@AttributeOverride(name = "numCaso", column = @Column(name = "num_caso")),
			@AttributeOverride(name = "idpacnac", column = @Column(name = "idpacnac", length = 10)),
			@AttributeOverride(name = "cip", column = @Column(name = "cip", length = 16)),
			@AttributeOverride(name = "dni", column = @Column(name = "dni", length = 12)),
			@AttributeOverride(name = "numeroSegSocial", column = @Column(name = "numero_seg_social", length = 25)),
			@AttributeOverride(name = "nombre", column = @Column(name = "nombre", length = 60)),
			@AttributeOverride(name = "apellido01", column = @Column(name = "apellido_01", length = 60)),
			@AttributeOverride(name = "apellido02", column = @Column(name = "apellido_02", length = 60)),
			@AttributeOverride(name = "fechaNacimiento", column = @Column(name = "fecha_nacimiento", length = 10)),
			@AttributeOverride(name = "sexo", column = @Column(name = "sexo", length = 1)),
			@AttributeOverride(name = "provinciaNacimiento", column = @Column(name = "provincia_nacimiento", length = 2)),
			@AttributeOverride(name = "municipioNacimiento", column = @Column(name = "municipio_nacimiento", length = 5)),
			@AttributeOverride(name = "paisNacimiento", column = @Column(name = "pais_nacimiento", length = 3)),
			@AttributeOverride(name = "domTipoVia", column = @Column(name = "dom_tipo_via", length = 6)),
			@AttributeOverride(name = "domNombreVia", column = @Column(name = "dom_nombre_via", length = 60)),
			@AttributeOverride(name = "domNumero", column = @Column(name = "dom_numero", length = 4)),
			@AttributeOverride(name = "domPisopuerta", column = @Column(name = "dom_pisopuerta", length = 4)),
			@AttributeOverride(name = "domOtros", column = @Column(name = "dom_otros", length = 60)),
			@AttributeOverride(name = "domCp", column = @Column(name = "dom_cp", length = 5)),
			@AttributeOverride(name = "provinciaResidencia", column = @Column(name = "provincia_residencia", length = 2)),
			@AttributeOverride(name = "municipioResidencia", column = @Column(name = "municipio_residencia", length = 5)),
			@AttributeOverride(name = "fallecido", column = @Column(name = "fallecido")),
			@AttributeOverride(name = "fallecidoFecha", column = @Column(name = "fallecido_fecha", length = 10)),
			@AttributeOverride(name = "fallecidoFechaComprobacion", column = @Column(name = "fallecido_fecha_comprobacion", length = 19)),
			@AttributeOverride(name = "fallecidoEtiquetaComprobacion", column = @Column(name = "fallecido_etiqueta_comprobacion", length = 45)),
			@AttributeOverride(name = "fallecidoNumbol", column = @Column(name = "fallecido_numbol", length = 10)),
			@AttributeOverride(name = "email", column = @Column(name = "email")),
			@AttributeOverride(name = "telefono", column = @Column(name = "telefono", length = 12)),
			@AttributeOverride(name = "enfrara", column = @Column(name = "enfrara", nullable = false, length = 10)),
			@AttributeOverride(name = "declarada", column = @Column(name = "declarada")),
			@AttributeOverride(name = "usuarioDeclara", column = @Column(name = "usuario_declara", length = 45)),
			@AttributeOverride(name = "literalEnfermedad", column = @Column(name = "literal_enfermedad")),
			@AttributeOverride(name = "jucioClinico", column = @Column(name = "jucio_clinico", length = 1014)),
			@AttributeOverride(name = "observaciones", column = @Column(name = "observaciones", length = 4096)),
			@AttributeOverride(name = "hospital", column = @Column(name = "hospital", length = 6)),
			@AttributeOverride(name = "numeroHistoriaClinica", column = @Column(name = "numero_historia_clinica", length = 12)),
			@AttributeOverride(name = "baseDiagnostico", column = @Column(name = "base_diagnostico")),
			@AttributeOverride(name = "fuenteInformacion", column = @Column(name = "fuente_informacion", length = 20)),
			@AttributeOverride(name = "fuentePacientesA", column = @Column(name = "fuente_pacientes_A")),
			@AttributeOverride(name = "fuenteCmbdC", column = @Column(name = "fuente_cmbd_C")),
			@AttributeOverride(name = "fuenteDefcongD", column = @Column(name = "fuente_defcong_D")),
			@AttributeOverride(name = "fuenteEdoE", column = @Column(name = "fuente_edo_E")),
			@AttributeOverride(name = "fuenteIsocialesG", column = @Column(name = "fuente_isociales_G")),
			@AttributeOverride(name = "fuenteMhuerfH", column = @Column(name = "fuente_mhuerf_H")),
			@AttributeOverride(name = "fuenteMetabolN", column = @Column(name = "fuente_metabol_N")),
			@AttributeOverride(name = "fuenteRinvI", column = @Column(name = "fuente_rinv_I")),
			@AttributeOverride(name = "fuenteRmortM", column = @Column(name = "fuente_rmort_M")),
			@AttributeOverride(name = "fuenteRcancerT", column = @Column(name = "fuente_rcancer_T")),
			@AttributeOverride(name = "fuenteRenalR", column = @Column(name = "fuente_renal_R")),
			@AttributeOverride(name = "fuenteHcPrimariaV", column = @Column(name = "fuente_hc_primaria_V")),
			@AttributeOverride(name = "fuenteHcEspecializadaU", column = @Column(name = "fuente_hc_especializada_U")),
			@AttributeOverride(name = "fuenteHcPrimariaMasivaP", column = @Column(name = "fuente_hc_primaria_masiva_P")),
			@AttributeOverride(name = "fuenteHcEspecializadaMasivaQ", column = @Column(name = "fuente_hc_especializada_masiva_Q")),
			@AttributeOverride(name = "fuenteOtrosO", column = @Column(name = "fuente_otros_O")),
			@AttributeOverride(name = "fechaInicioSintomas", column = @Column(name = "fecha_inicio_sintomas", length = 10)),
			@AttributeOverride(name = "fechaDeteccion", column = @Column(name = "fecha_deteccion", length = 10)),
			@AttributeOverride(name = "fechaDiagnostico", column = @Column(name = "fecha_diagnostico", length = 10)),
			@AttributeOverride(name = "codCie9mc", column = @Column(name = "cod_cie9mc", length = 6)),
			@AttributeOverride(name = "codCie10", column = @Column(name = "cod_cie10", length = 6)),
			@AttributeOverride(name = "codSnomed", column = @Column(name = "cod_snomed", length = 20)),
			@AttributeOverride(name = "codOmin", column = @Column(name = "cod_omin", length = 10)),
			@AttributeOverride(name = "codEdta", column = @Column(name = "cod_edta", length = 10)),
			@AttributeOverride(name = "codOtros", column = @Column(name = "cod_otros", length = 20)),
			@AttributeOverride(name = "codOtroDeno", column = @Column(name = "cod_otro_deno", length = 45)),
			@AttributeOverride(name = "tratamiento", column = @Column(name = "tratamiento", length = 4096)),
			@AttributeOverride(name = "familiaresEnfermedadesRaras", column = @Column(name = "familiares_enfermedades_raras")),
			@AttributeOverride(name = "otrasEnfermedadesCronicas", column = @Column(name = "otras_enfermedades_cronicas")),
			@AttributeOverride(name = "enfermedadesCronicas", column = @Column(name = "enfermedades_cronicas", length = 1024)),
			@AttributeOverride(name = "casoFechahoraCreacion", column = @Column(name = "caso_fechahora_creacion", length = 19)),
			@AttributeOverride(name = "casoFechahoraModificacion", column = @Column(name = "caso_fechahora_modificacion", length = 19)),
			@AttributeOverride(name = "casoUsuarioCreacion", column = @Column(name = "caso_usuario_creacion", length = 45)),
			@AttributeOverride(name = "casoUsuarioModificacion", column = @Column(name = "caso_usuario_modificacion", length = 45)) })
	public VPacienteCasoId getId() {
		return this.id;
	}

	public void setId(VPacienteCasoId id) {
		this.id = id;
	}

}
