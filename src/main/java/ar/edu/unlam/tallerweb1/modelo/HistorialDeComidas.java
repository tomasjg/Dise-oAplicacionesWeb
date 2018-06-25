package ar.edu.unlam.tallerweb1.modelo;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class HistorialDeComidas {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private List<Comida> comidas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Comida> getComidas() {
		return comidas;
	}
	public void setComidas(List<Comida> comidas) {
		this.comidas = comidas;
	}
	
	public Integer getTotalCalorias() {
		return 0;
	}
	
}
