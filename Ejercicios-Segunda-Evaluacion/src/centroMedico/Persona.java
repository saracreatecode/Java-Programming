package centroMedico;

import java.util.ArrayList;

abstract class Persona {
	protected String nombre;
	protected String apellidos;
	protected CentroMedico perteneceACentroMedico;
	protected ArrayList<Consulta> consultasRealizadas = new ArrayList<>();
	
	public Persona(String nombre, String apellidos, CentroMedico perteneceACentroMedico) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.perteneceACentroMedico = perteneceACentroMedico;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public CentroMedico getCentro() {
		return this.perteneceACentroMedico;
	}
	
	public void aniadeConsulta(Consulta consulta) {
		consultasRealizadas.add(consulta);
	}
	
	public void listarConsultas() {
		for (Consulta consulta: consultasRealizadas) {
			consulta.mostrarConsulta();
		}
	}
	
	// Poniendola abstracta obliga a añadir el método tanto a Medico como Paciente
	abstract public void cambiaCentroMedico (CentroMedico perteneceACentroMedico);
}