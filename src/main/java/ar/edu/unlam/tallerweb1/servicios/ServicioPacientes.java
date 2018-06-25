package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Control;
import ar.edu.unlam.tallerweb1.modelo.Paciente;

// Interface que define los metodos del Servicio de Pacientes.
public interface ServicioPacientes {

	void insertarPaciente(Paciente paciente);
	
	void insertarControl(Control control);
	
	void insertarEnfermedades(List<String> listadoEnfermedades);

}
