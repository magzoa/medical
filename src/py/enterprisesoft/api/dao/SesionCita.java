package py.enterprisesoft.api.dao;

import py.enterprisesoft.api.model.base.AbstractSesion;
import py.enterprisesoft.api.model.medical.Administrador;
import py.enterprisesoft.api.model.medical.Cita;

public class SesionCita extends AbstractSesion<Cita> {

	public SesionCita(Class<Cita> entityClass) {
		super(entityClass);
	}
	
	public SesionCita() {
		super(Cita.class);
	}
}
