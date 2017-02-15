package py.enterprisesoft.api.dao;

import py.enterprisesoft.api.model.base.AbstractSesion;
import py.enterprisesoft.api.model.medical.Administrador;

public class SesionAdministrador extends AbstractSesion<Administrador> {

	public SesionAdministrador(Class<Administrador> entityClass) {
		super(entityClass);
	}
	
	public SesionAdministrador() {
		super(Administrador.class);
	}
}
