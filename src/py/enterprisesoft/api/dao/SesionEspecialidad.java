package py.enterprisesoft.api.dao;

import py.enterprisesoft.api.model.base.AbstractSesion;
import py.enterprisesoft.api.model.medical.Especialidad;

public class SesionEspecialidad extends AbstractSesion<Especialidad> {

	public SesionEspecialidad(Class<Especialidad> entityClass) {
		super(entityClass);
	}
	
	public SesionEspecialidad() {
		super(Especialidad.class);
	}
}
