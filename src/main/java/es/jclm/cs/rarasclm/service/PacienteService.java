package es.jclm.cs.rarasclm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.jclm.cs.rarasclm.dao.PacienteDao;
import es.jclm.cs.rarasclm.entities.Paciente;


@Service
public class PacienteService extends BaseCRUDService<Paciente, Integer> {
	
	PacienteDao dao;
	
	//Se inyecta aquí el dao porque hay que pasarselo a 
	//la clase Base BaseCRUDService
	@Autowired
	private PacienteService(PacienteDao dao)
	{
		this.baseDao = dao;
		this.dao = dao;
	}
	
	public List<Paciente> buscaPacientesNombre(String nombre) {
		return dao.busqueda(nombre, "", "");
	}
	
	
}
