package ar.edu.unlam.diseñoAplicacionesWeb;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

import ar.edu.unlam.tallerweb1.modelo.*;


public class TestControl {
	
	@Test
	public void TestParaProbarAltaControlPaciente() {
		IMC indiceMasaCorporal = new IMC();
		indiceMasaCorporal.setAltura(170d);
		indiceMasaCorporal.setPeso(80d);
		
		ICC indiceCinturaCadera =new ICC();
		indiceCinturaCadera.setCadera(90d);
		indiceCinturaCadera.setCintura(100d);
		
		Control control = new Control();
		control.setIcc(indiceCinturaCadera);
		control.setImc(indiceMasaCorporal);
		
		assertThat(control.getIcc() ).isEqualTo(indiceCinturaCadera);
		assertThat(control.getImc() ).isEqualTo(indiceMasaCorporal);
			
	}
	
}
