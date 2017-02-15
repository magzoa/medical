package py.enterprisesoft.api.prueba;

import java.util.Date;
import java.util.List;

import py.enterprisesoft.api.dao.SesionCita;
import py.enterprisesoft.api.model.medical.Cita;
import py.enterprisesoft.api.model.medical.Paciente;
import py.enterprisesoft.api.model.medical.Turno;

public class PruebaCita {
	
	public static void actualizar() throws Exception{
		SesionCita sesion = new SesionCita();
		Cita cita = new Cita();
		cita.setEstado("PENDIENTE");
		cita.setFechaHora(new Date());
		cita.setOrdenAtencion(1);
		cita.setPaciente(new Paciente(1));
		cita.setTurno(new Turno(1));
		
	
		sesion.actualizar(cita);
	}
	
	public static void borrar() throws Exception{
		SesionCita sesion = new SesionCita();
		Cita cita = new Cita();
		cita.setId(1);
		sesion.eliminar(cita);
	}
	
	public static void obtener() throws Exception{
		SesionCita sesion = new SesionCita();
		Cita cita = new Cita();
		cita.setId(1);
		System.out.println(	sesion.obtener(cita.getId()));
	}
	
	public static void obtenerLista() throws Exception{
		SesionCita sesion = new SesionCita();
		
		List<Cita> lista = sesion.buscarTodos();		
		for (Cita cita : lista) {
			System.out.println(cita);
		}
	}
	
	public static void main(String[] args) throws Exception {
	actualizar();
	}
	
}
