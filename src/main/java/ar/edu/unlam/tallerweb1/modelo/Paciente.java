package ar.edu.unlam.tallerweb1.modelo;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;

public class Paciente {

	@Id
	private Long dni;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private Date fechaNacimiento;
	private String sexo;
	private HistorialDeComidas historialComidas;
	private List<Control> controles;
	
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public HistorialDeComidas getHistorialComidas() {
		return historialComidas;
	}
	public void setHistorialComidas(HistorialDeComidas historialComidas) {
		this.historialComidas = historialComidas;
	}
	public List<Control> getControles() {
		return controles;
	}
	public void setControles(List<Control> controles) {
		this.controles = controles;
	}
	
	
}
