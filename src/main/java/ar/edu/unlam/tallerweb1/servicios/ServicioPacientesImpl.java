package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.PacienteDao;
import ar.edu.unlam.tallerweb1.modelo.Control;
import ar.edu.unlam.tallerweb1.modelo.Paciente;

@Service("servicioPacientes")
@Transactional
public class ServicioPacientesImpl implements ServicioPacientes {

	@Inject
	private PacienteDao pacienteDao;

	@Override
	public void insertarPaciente(Paciente paciente){
		pacienteDao.insertarPaciente(paciente);
	}

	@Override
	public void insertarControl(Control control) {
		pacienteDao.insertarControl(control);
	}

	@Override
	public void insertarEnfermedades(List<String> listadoEnfermedades) {
		pacienteDao.insertarEnfermedades(listadoEnfermedades);
		
	}

}
