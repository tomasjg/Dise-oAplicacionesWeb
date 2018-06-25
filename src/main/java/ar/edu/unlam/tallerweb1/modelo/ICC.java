package ar.edu.unlam.tallerweb1.modelo;
public class ICC {

	private Double cintura;
	private Double cadera;
	
	public Double getCintura() {
		return cintura;
	}
	public void setCintura(Double cintura) {
		this.cintura = cintura;
	}
	public Double getCadera() {
		return cadera;
	}
	public void setCadera(Double cadera) {
		this.cadera = cadera;
	}
	
	public Double calcularICC() {
		return this.cadera/this.cintura;
	}
	
}
