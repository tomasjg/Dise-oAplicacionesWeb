package ar.edu.unlam.tallerweb1.controladores;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import ar.edu.unlam.tallerweb1.modelo.Alimento;
import ar.edu.unlam.tallerweb1.modelo.Control;
import ar.edu.unlam.tallerweb1.modelo.Cuota;
import ar.edu.unlam.tallerweb1.modelo.ICC;
import ar.edu.unlam.tallerweb1.modelo.IMC;
import ar.edu.unlam.tallerweb1.modelo.Paciente;
import ar.edu.unlam.tallerweb1.modelo.Pago;
import ar.edu.unlam.tallerweb1.modelo.Turno;
import ar.edu.unlam.tallerweb1.servicios.ServicioPacientes;

public class Controlador {

	@Inject
	private ServicioPacientes servicioPacientes;
	
	public void registrarPaciente(Paciente paciente, Double pesoIncial, Double altura, Double caderaIncial, Double cinturaIncial, List<String> listadoEnfermedades) {
		registrarDatosPersonales(paciente);
		agregarControlInicial(pesoIncial, altura, caderaIncial, cinturaIncial);
		agregarEnfermedades(listadoEnfermedades);
	}
	
	public void registrarDatosPersonales(Paciente paciente) {
		servicioPacientes.insertarPaciente(paciente);
	}
	
	public void agregarControlInicial(Double pesoIncial, Double altura, Double caderaIncial, Double cinturaIncial){
		IMC imc = new IMC();
		imc.setPeso(pesoIncial);
		imc.setAltura(altura);
		ICC icc = new ICC();
		icc.setCadera(caderaIncial);
		icc.setCintura(cinturaIncial);
		
		Control control = new Control();
		control.setFecha(new Date());
		control.setImc(imc);
		control.setIcc(icc);
		
		servicioPacientes.insertarControl(control);
		Double indiceIMC = control.calcularIMC();
		Double indiceICC = control.calcularICC();
		
	}
	public void agregarEnfermedades(List<String> listadoEnfermedades){
		servicioPacientes.insertarEnfermedades(listadoEnfermedades);
	}
	
	public void inciarSesion() {
		
	}
	public List<Paciente> consultarPacientes(){
		return null;
	}
	
	public void modificarPaciente(Paciente paciente){
		
	}
	public void eliminarPaciente(Paciente paciente){
		
	}
	public Cuota buscarCuota(){
		return null;
	}
	public void pagarCuota(Cuota cuota){
		
	}
	public void verificarCC(Pago pago){
		
	}
	public void generarFactura(){
		
	}
	public void enviarFacturaPorEmail(){
		
	}
	public Integer calcularCalorias(){
		return null;
	}
	public void registarAsociacion(){
		
	}
	public List<Turno> consultarTurnos(){
		return null;
	}
	public void registrarTurno(){
		
	}
	public void eliminarTurno(){
		
	}
	public void registrarReservaDeTurno(){
		
	}
	public void registrarCancelacionDeTurno(){
		
	}
	public void registrarModificacionDeTurno(){
		
	}
	public Alimento buscarAlimento(){
		return null;
	}
	
}

