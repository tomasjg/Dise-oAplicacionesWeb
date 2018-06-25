package ar.edu.unlam.diseñoAplicacionesWeb;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ar.edu.unlam.tallerweb1.modelo.*;
import static org.junit.Assert.*;

public class TestPlan {

	@Test
	public void TestQuePruebeCargarUnPlan() {
		Alimento alimento1 = new Alimento();
		alimento1.setNombre("Pollo al Horno");
		alimento1.setCalorias(282);
		Alimento alimento2 = new Alimento();
		alimento2.setNombre("vaso de coca ligt");
		alimento2.setCalorias(1);
		Alimento alimento3 = new Alimento();
		alimento3.setNombre("empanada de ternera");
		alimento3.setCalorias(256);
		Alimento alimento4 = new Alimento();
		alimento4.setNombre("vaso de jugo de naranjas");
		alimento4.setCalorias(112);
		
		Plato plato1 = new Plato();
		List<Alimento> polloConCoca=new ArrayList<Alimento>();
		polloConCoca.add(alimento1);
		polloConCoca.add(alimento2);
		plato1.setAlimentos(polloConCoca);
		
		Plato plato2 = new Plato();
		List<Alimento> empanadaConNaranja=new ArrayList<Alimento>();
		polloConCoca.add(alimento3);
		polloConCoca.add(alimento4);
		plato2.setAlimentos(empanadaConNaranja);
		
		List<Plato>listaDePlatosDelPlan = new ArrayList();
		listaDePlatosDelPlan.add(plato1);
		listaDePlatosDelPlan.add(plato2);
		
		Plan plan1 = new Plan();
		plan1.setPlatos(listaDePlatosDelPlan);
		
		int acumuladorDeCalorias=0;
		
		for(Plato listaDePlatos: plan1.getPlatos() ) {
		
		for (Alimento  listaDeAlimentos: listaDePlatos.getAlimentos() ) {
				acumuladorDeCalorias+=listaDeAlimentos.getCalorias();

			}
		}
		
		System.out.println(acumuladorDeCalorias);
		
		assertEquals(acumuladorDeCalorias,651);
		
	
	}
}
