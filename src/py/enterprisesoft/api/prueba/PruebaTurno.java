package py.enterprisesoft.api.prueba;

import java.util.Date;
import java.util.List;

import py.enterprisesoft.api.dao.SesionTurno;
import py.enterprisesoft.api.model.medical.Consultorio;
import py.enterprisesoft.api.model.medical.Medico;
import py.enterprisesoft.api.model.medical.Turno;

public class PruebaTurno {
	
	public static void actualizar() throws Exception{
		SesionTurno sesion = new SesionTurno();
		Turno turno = new Turno();
		turno.setId(2);
		turno.setConsultorio(new Consultorio(2));
		turno.setDescripcion("tarde");
		turno.setDia("martes");
		turno.setEstado("ACTIVO");
		turno.setHoraFin(new Date());
		turno.setHoraInicio(new Date());
		turno.setMedico(new Medico(1));
		turno.setCantidadNumero(10);
		
		
		
		sesion.actualizar(turno);
	}
	
	public static void borrar() throws Exception{
		SesionTurno sesion = new SesionTurno();
		Turno turno = new Turno();
		turno.setId(1);
		sesion.eliminar(turno);
	}
	
	public static void obtener() throws Exception{
		SesionTurno sesion = new SesionTurno();
		Turno turno = new Turno();
		turno.setId(1);
		System.out.println(	sesion.obtener(turno.getId()));
	}
	
	public static void obtenerLista() throws Exception{
		SesionTurno sesion = new SesionTurno();
		
		List<Turno> lista = sesion.buscarTodos();		
		for (Turno turno : lista) {
			System.out.println(turno);
		}
	}
	
	public static void main(String[] args) throws Exception {
	actualizar();
	}
	
}
