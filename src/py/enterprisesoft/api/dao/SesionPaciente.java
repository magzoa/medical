package py.enterprisesoft.api.dao;

import py.enterprisesoft.api.model.base.AbstractSesion;
import py.enterprisesoft.api.model.medical.Paciente;

public class SesionPaciente extends AbstractSesion<Paciente> {

	public SesionPaciente(Class<Paciente> entityClass) {
		super(entityClass);
	}
	
	public SesionPaciente() {
		super(Paciente.class);
	}
}
