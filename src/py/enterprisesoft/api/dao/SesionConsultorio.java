package py.enterprisesoft.api.dao;

import py.enterprisesoft.api.model.base.AbstractSesion;
import py.enterprisesoft.api.model.medical.Administrador;
import py.enterprisesoft.api.model.medical.Consultorio;

public class SesionConsultorio extends AbstractSesion<Consultorio> {

	public SesionConsultorio(Class<Consultorio> entityClass) {
		super(entityClass);
	}
	
	public SesionConsultorio() {
		super(Consultorio.class);
	}
}
