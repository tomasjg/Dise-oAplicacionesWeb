package ar.edu.unlam.tallerweb1.modelo;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class HistoriaClinica {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Paciente paciente;
	private String fichaMedica;
	private List<String> enfermedades;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getFichaMedica() {
		return fichaMedica;
	}
	public void setFichaMedica(String fichaMedica) {
		this.fichaMedica = fichaMedica;
	}
	public List<String> getEnfermedades() {
		return enfermedades;
	}
	public void setEnfermedades(List<String> enfermedades) {
		this.enfermedades = enfermedades;
	}
	
	
	
	
	
}
