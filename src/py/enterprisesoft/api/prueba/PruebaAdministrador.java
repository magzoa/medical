package py.enterprisesoft.api.prueba;

import java.util.List;

import py.enterprisesoft.api.dao.SesionAdministrador;
import py.enterprisesoft.api.model.medical.Administrador;

public class PruebaAdministrador {
	
	public static void actualizar() throws Exception{
		SesionAdministrador sesion = new SesionAdministrador();
		Administrador administrador = new Administrador();
		administrador.setNombre("Pedro");
		administrador.setApellido("Riquelme");
		administrador.setCelular("0974567543");
		administrador.setCi("123");
		administrador.setEmail("magzoaa@gmail.com");
		administrador.setTelefono("123");
		sesion.actualizar(administrador);
	}
	
	public static void borrar() throws Exception{
		SesionAdministrador sesion = new SesionAdministrador();
		Administrador administrador = new Administrador();
		administrador.setId(1);
		sesion.eliminar(administrador);
	}
	
	public static void obtener() throws Exception{
		SesionAdministrador sesion = new SesionAdministrador();
		Administrador administrador = new Administrador();
		administrador.setId(1);
		System.out.println(	sesion.obtener(administrador.getId()));
	}
	
	public static void obtenerLista() throws Exception{
		SesionAdministrador sesion = new SesionAdministrador();
		
		List<Administrador> lista = sesion.buscarTodos();		
		for (Administrador administrador : lista) {
			System.out.println(administrador);
		}
	}
	
	public static void main(String[] args) throws Exception {

		obtener();
		
	}
	
}
