package py.enterprisesoft.api.prueba;

import java.util.Date;
import java.util.List;

import py.enterprisesoft.api.dao.SesionPaciente;
import py.enterprisesoft.api.model.medical.Paciente;

public class PruebaPaciente {
	
	public static void actualizar() throws Exception{
		SesionPaciente sesion = new SesionPaciente();
		Paciente paciente = new Paciente();
		
		paciente.setNombre("Juan");
		paciente.setApellido("Toribio");
		paciente.setCelular("0974562334");
		paciente.setCi("1232342");
		paciente.setEmail("juan@gmail.com");
		paciente.setTelefono("12323424");
		
		paciente.setFechaNacimiento(new Date());
		paciente.setPass("xsdfs3234334");
		
		sesion.actualizar(paciente);
	}
	
	public static void borrar() throws Exception{
		SesionPaciente sesion = new SesionPaciente();
		Paciente paciente = new Paciente();
		paciente.setId(1);
		sesion.eliminar(paciente);
	}
	
	public static void obtener() throws Exception{
		SesionPaciente sesion = new SesionPaciente();
		Paciente paciente = new Paciente();
		paciente.setId(1);
		System.out.println(	sesion.obtener(paciente.getId()));
	}
	
	public static void obtenerLista() throws Exception{
		SesionPaciente sesion = new SesionPaciente();
		
		List<Paciente> lista = sesion.buscarTodos();		
		for (Paciente paciente : lista) {
			System.out.println(paciente);
		}
	}
	
	public static void main(String[] args) throws Exception {
	actualizar();
	}
	
}
