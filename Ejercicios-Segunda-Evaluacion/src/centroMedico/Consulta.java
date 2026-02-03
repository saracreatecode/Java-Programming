package centroMedico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Consulta {
	private Paciente paciente;
	private Medico medico;
	private LocalDate fecha;
	private String motivoConsulta;
	private String consejoMedico;

	public Consulta(Paciente paciente, Medico medico, LocalDate fecha, String motivoConsulta, String consejoMedico) {
		this.paciente = paciente;
		this.medico = medico;
		this.fecha = fecha;
		this.motivoConsulta = motivoConsulta;
		this.consejoMedico = consejoMedico;
		
		CentroMedico centro = this.medico.getCentro();
		centro.aniadeConsulta(this);
		this.medico.aniadeConsulta(this);
		this.paciente.aniadeConsulta(this);
	}
	
	public void mostrarConsulta() {
		System.out.println("Paciente: " + this.paciente.getNombre() + " " + this.paciente.getApellidos());
		System.out.println("Médico: " + this.medico.getNombre() + " " + this.medico.getApellidos());
		System.out.println("Fecha de consulta: " + this.fecha);
		System.out.println("Motivo: " + this.motivoConsulta);
		System.out.println("Respuesta: " + this.consejoMedico);
		System.out.println("-----------------------------------------");
	}
}