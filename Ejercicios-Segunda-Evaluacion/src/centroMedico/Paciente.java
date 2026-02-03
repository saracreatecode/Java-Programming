package centroMedico;

import java.util.ArrayList;

class Paciente extends Persona {
	private String dni;
	private int telefono;
	
	public Paciente(String nombre, String apellidos, String dni, int telefono, CentroMedico perteneceACentroMedico) {
		super(nombre, apellidos, perteneceACentroMedico);
		this.dni = dni;
		this.telefono = telefono;
		this.perteneceACentroMedico.aniadePaciente(this);
	}

	public void cambiaCentroMedico(CentroMedico perteneceACentroMedico) {
		this.perteneceACentroMedico.eliminaPaciente(this);
		this.perteneceACentroMedico = perteneceACentroMedico;
		this.perteneceACentroMedico.aniadePaciente(this);
	}

}