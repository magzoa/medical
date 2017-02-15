package py.enterprisesoft.api.dao;

import py.enterprisesoft.api.model.base.AbstractSesion;
import py.enterprisesoft.api.model.medical.Medico;

public class SesionMedico extends AbstractSesion<Medico> {

	public SesionMedico(Class<Medico> entityClass) {
		super(entityClass);
	}
	
	public SesionMedico() {
		super(Medico.class);
	}
}
