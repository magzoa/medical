package py.enterprisesoft.api.dao;

import py.enterprisesoft.api.model.base.AbstractSesion;
import py.enterprisesoft.api.model.medical.Administrador;
import py.enterprisesoft.api.model.medical.Curso;

public class SesionCurso extends AbstractSesion<Curso> {

	public SesionCurso(Class<Curso> entityClass) {
		super(entityClass);
	}
	
	public SesionCurso() {
		super(Curso.class);
	}
}
