package ar.edu.unlam.diseñoAplicacionesWeb;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.controladores.Controlador;
import ar.edu.unlam.tallerweb1.modelo.Paciente;

public class TestFuncionalidades extends SpringTest{

	@Test @Transactional
	public void testRegistrarPaciente() {
		// preparacion
		Paciente paciente1 = new Paciente();
		paciente1.setNombre("Juan");
		paciente1.setApellido("Perez");
		paciente1.setDni((long) 12345678);
		paciente1.setSexo("M");
		paciente1.setEmail("juanperez@gmail.com");
		paciente1.setTelefono("4580498");
		
		Double pesoInicial = (double) 100;
		Double altura = (double) 180;
		Double caderaIncial = (double) 90;
		Double cinturaIncial = (double) 100;
		List<String> listadoEnfermedades = new ArrayList<>();
		listadoEnfermedades.add("Hipertension");
		
		Controlador controlador = new Controlador();
		
		// ejecucion
		controlador.registrarPaciente(paciente1, pesoInicial, altura, caderaIncial, cinturaIncial, listadoEnfermedades);
		
		Paciente paciente2 = (Paciente) getSession().createCriteria(Paciente.class)
				.add(Restrictions.eq("dni", "12345678"))
				.uniqueResult();
		
		// validacion
		assertThat(paciente1.getDni()).isEqualTo(paciente2.getDni());
	}

	
}
