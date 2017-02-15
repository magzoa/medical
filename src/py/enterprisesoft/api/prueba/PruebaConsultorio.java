package py.enterprisesoft.api.prueba;

import java.util.List;

import py.enterprisesoft.api.dao.SesionConsultorio;
import py.enterprisesoft.api.model.medical.Clinica;
import py.enterprisesoft.api.model.medical.Consultorio;

public class PruebaConsultorio {
	
	public static void actualizar() throws Exception{
		SesionConsultorio sesion = new SesionConsultorio();
		Consultorio consultorio = new Consultorio();
		consultorio.setClinica(new Clinica(3));
		consultorio.setEstado("ACTIVO");
		consultorio.setNumero(2);
		consultorio.setObs("Ninguna");
		
		sesion.actualizar(consultorio);
	}
	
	public static void borrar() throws Exception{
		SesionConsultorio sesion = new SesionConsultorio();
		Consultorio consultorio = new Consultorio();
		consultorio.setId(1);
		sesion.eliminar(consultorio);
	}
	
	public static void obtener() throws Exception{
		SesionConsultorio sesion = new SesionConsultorio();
		Consultorio consultorio = new Consultorio();
		consultorio.setId(1);
		System.out.println(	sesion.obtener(consultorio.getId()));
	}
	
	public static void obtenerLista() throws Exception{
		SesionConsultorio sesion = new SesionConsultorio();
		
		List<Consultorio> lista = sesion.buscarTodos();		
		for (Consultorio consultorio : lista) {
			System.out.println(consultorio);
		}
	}
	
	public static void main(String[] args) throws Exception {
	actualizar();
	}
	
}
