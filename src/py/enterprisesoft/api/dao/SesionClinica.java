package py.enterprisesoft.api.dao;

import py.enterprisesoft.api.model.base.AbstractSesion;
import py.enterprisesoft.api.model.medical.Administrador;
import py.enterprisesoft.api.model.medical.Clinica;

public class SesionClinica extends AbstractSesion<Clinica> {

	public SesionClinica(Class<Clinica> entityClass) {
		super(entityClass);
	}
	
	public SesionClinica() {
		super(Clinica.class);
	}
}
