package py.enterprisesoft.api.prueba;

import java.util.List;

import py.enterprisesoft.api.dao.SesionClinica;
import py.enterprisesoft.api.model.medical.Clinica;

public class PruebaClinica {
	
	public static void actualizar() throws Exception{
		SesionClinica sesion = new SesionClinica();
		Clinica clinica = new Clinica();
		clinica.setCelular("0973432345");
		clinica.setCorreo("clinica2@gmail.com");
		clinica.setCuota(400000);
		clinica.setDescripcion("Santa Maria");
		clinica.setDireccion("Calle Julio Correa y Tte Fariña");
		clinica.setEstado("ACTIVO");
		clinica.setTelefono("061432432");
		sesion.actualizar(clinica);
	}
	
	public static void borrar() throws Exception{
		SesionClinica sesion = new SesionClinica();
		Clinica clinica = new Clinica();
		clinica.setId(1);
		sesion.eliminar(clinica);
	}
	
	public static void obtener() throws Exception{
		SesionClinica sesion = new SesionClinica();
		Clinica clinica = new Clinica();
		clinica.setId(1);
		System.out.println(	sesion.obtener(clinica.getId()));
	}
	
	public static void obtenerLista() throws Exception{
		SesionClinica sesion = new SesionClinica();
		
		List<Clinica> lista = sesion.buscarTodos();		
		for (Clinica clinica : lista) {
			System.out.println(clinica);
		}
	}
	
	public static void main(String[] args) throws Exception {
	actualizar();
	}
	
}
