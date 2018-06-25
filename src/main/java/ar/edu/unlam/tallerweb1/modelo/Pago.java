package ar.edu.unlam.tallerweb1.modelo;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Pago {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String tipoPago;
	private String numeroTarjeta;
	private String nombreTitular;
	private String dniTitular;
	private Date fechaExpiracion;
	private int codigoSeguridad;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public String getDniTitular() {
		return dniTitular;
	}
	public void setDniTitular(String dniTitular) {
		this.dniTitular = dniTitular;
	}
	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}
	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
	public int getCodigoSeguridad() {
		return codigoSeguridad;
	}
	public void setCodigoSeguridad(int codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

	
}
