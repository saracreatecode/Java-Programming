package centroMedico;

import java.util.ArrayList;

class Medico extends Persona {
	private String especialidad;
	private int numeroColegiado; // Formato 6 dígitos 999999

	public Medico(String nombre, String apellidos, String especialidad, int numeroColegiado,
			CentroMedico perteneceACentroMedico) {
		super(nombre, apellidos, perteneceACentroMedico);
		this.especialidad = especialidad;
		this.numeroColegiado = numeroColegiado;
		this.perteneceACentroMedico.aniadeMedico(this);
	}

	public void cambiaCentroMedico(CentroMedico perteneceACentroMedico) {
		this.perteneceACentroMedico.eliminaMedico(this);
		this.perteneceACentroMedico = perteneceACentroMedico;
		this.perteneceACentroMedico.aniadeMedico(this);
	}

}