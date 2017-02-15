package py.enterprisesoft.api.dao;

import py.enterprisesoft.api.model.base.AbstractSesion;
import py.enterprisesoft.api.model.medical.Turno;

public class SesionTurno extends AbstractSesion<Turno> {

	public SesionTurno(Class<Turno> entityClass) {
		super(entityClass);
	}
	
	public SesionTurno() {
		super(Turno.class);
	}
}
