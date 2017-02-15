package py.enterprisesoft.api.prueba;

import java.util.List;

import py.enterprisesoft.api.dao.SesionMedico;
import py.enterprisesoft.api.model.medical.Medico;

public class PruebaMedico {
	
	public static void actualizar() throws Exception{
		SesionMedico sesion = new SesionMedico();
		Medico medico = new Medico();
	
		medico.setNombre("Fabio");
		medico.setApellido("Riquelme");
		medico.setCelular("097412312312");
		medico.setCi("123");
		medico.setEmail("medico@gmail.com");
		medico.setTelefono("123");
		
		
		
		sesion.actualizar(medico);
	}
	
	public static void borrar() throws Exception{
		SesionMedico sesion = new SesionMedico();
		Medico medico = new Medico();
		medico.setId(1);
		sesion.eliminar(medico);
	}
	
	public static void obtener() throws Exception{
		SesionMedico sesion = new SesionMedico();
		Medico medico = new Medico();
		medico.setId(1);
		System.out.println(	sesion.obtener(medico.getId()));
	}
	
	public static void obtenerLista() throws Exception{
		SesionMedico sesion = new SesionMedico();
		
		List<Medico> lista = sesion.buscarTodos();		
		for (Medico medico : lista) {
			System.out.println(medico);
		}
	}
	
	public static void main(String[] args) throws Exception {
	actualizar();
	}
	
}
