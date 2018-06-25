package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Control;
import ar.edu.unlam.tallerweb1.modelo.HistoriaClinica;
import ar.edu.unlam.tallerweb1.modelo.Paciente;

@Repository("pacienteDao")
public class PacienteDaoImpl implements PacienteDao{
	
	@Inject
    private SessionFactory sessionFactory;
	
	
	
	@Override
	public void insertarPaciente(Paciente paciente){
		Session session = sessionFactory.getCurrentSession();
		session.save(paciente);	
	}



	@Override
	public void insertarControl(Control control) {
		Session session = sessionFactory.getCurrentSession();
		session.save(control);	
	}



	@Override
	public void insertarEnfermedades(List<String> listadoEnfermedades) {
		HistoriaClinica hc = new HistoriaClinica();
		hc.setEnfermedades(listadoEnfermedades);
		Session session = sessionFactory.getCurrentSession();
		session.save(hc);	
	}
	
}
