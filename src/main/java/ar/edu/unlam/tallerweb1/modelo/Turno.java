package ar.edu.unlam.tallerweb1.modelo;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Turno {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Date fechaYHorario;
	private String estado;
	private Paciente paciente;
	private Medico medico;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaYHorario() {
		return fechaYHorario;
	}
	public void setFechaYHorario(Date fechaYHorario) {
		this.fechaYHorario = fechaYHorario;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	

}
