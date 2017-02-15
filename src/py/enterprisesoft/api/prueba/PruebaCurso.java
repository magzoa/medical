package py.enterprisesoft.api.prueba;

import java.util.List;

import py.enterprisesoft.api.dao.SesionCurso;
import py.enterprisesoft.api.model.medical.Curso;

public class PruebaCurso {
	
	public static void actualizar() throws Exception{
		SesionCurso sesion = new SesionCurso();
		Curso curso = new Curso();
		
		sesion.actualizar(curso);
	}
	
	public static void borrar() throws Exception{
		SesionCurso sesion = new SesionCurso();
		Curso curso = new Curso();
		curso.setId(1);
		sesion.eliminar(curso);
	}
	
	public static void obtener() throws Exception{
		SesionCurso sesion = new SesionCurso();
		Curso curso = new Curso();
		curso.setId(1);
		System.out.println(	sesion.obtener(curso.getId()));
	}
	
	public static void obtenerLista() throws Exception{
		SesionCurso sesion = new SesionCurso();
		
		List<Curso> lista = sesion.buscarTodos();		
		for (Curso curso : lista) {
			System.out.println(curso);
		}
	}
	
	public static void main(String[] args) throws Exception {
	actualizar();
	}
	
}
