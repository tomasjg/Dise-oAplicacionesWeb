package ar.edu.unlam.tallerweb1.modelo;
public class IMC {

	private Double peso;
	private Double altura;
	
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double calcularIMC() {
		return this.peso/this.altura;
	}
	
}
