package centroMedico;

import java.util.ArrayList;

public class CentroMedico {
	private String nombre;
	private String codigo; //Formato CM-9999
	private ArrayList<Medico> listaMedicos = new ArrayList<>();
	private ArrayList<Paciente> listaPacientes = new ArrayList<>();
	private ArrayList<Consulta> listaConsultas = new ArrayList<>();
	
	public CentroMedico(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	public void aniadeMedico(Medico medico) {
		this.listaMedicos.add(medico);
		
	}
	
	public void eliminaMedico(Medico medico) {
		this.listaMedicos.remove(medico);
	}
	
	public void eliminaPaciente(Paciente paciente) {
		this.listaPacientes.remove(paciente);
	}

	public void aniadePaciente(Paciente paciente) {
		this.listaPacientes.add(paciente);
		
	}
	
	public void aniadeConsulta(Consulta consulta) {
		this.listaConsultas.add(consulta);
	}

	public void listarPacientes() {
		for (Paciente paciente: listaPacientes) {
			System.out.println(paciente.getNombre() + " " + paciente.getApellidos());
		}
	}

	public void listarMedicos() {
		for (Medico medico: listaMedicos) {
			System.out.println(medico.getNombre() + " " + medico.getApellidos());
		}
	}

	public void listarConsultas() {
		for (Consulta consulta: listaConsultas) {
			consulta.mostrarConsulta();
		}
	}
}