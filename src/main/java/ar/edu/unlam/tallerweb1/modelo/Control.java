package ar.edu.unlam.tallerweb1.modelo;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Control {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Date fecha;
	private ICC icc;
	private IMC imc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public ICC getIcc() {
		return icc;
	}
	public void setIcc(ICC icc) {
		this.icc = icc;
	}
	public IMC getImc() {
		return imc;
	}
	public void setImc(IMC imc) {
		this.imc = imc;
	}
	
	public Double calcularIMC() {
		return this.imc.calcularIMC();
	}
	
	public Double calcularICC() {
		return this.icc.calcularICC();
	}
		
}
