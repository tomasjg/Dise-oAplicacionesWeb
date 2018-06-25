package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.*;

public interface PacienteDao {
	
	
	void insertarPaciente(Paciente paciente);
	
	void insertarControl(Control control);
	
	void insertarEnfermedades(List<String> listadoEnfermedades);
}
