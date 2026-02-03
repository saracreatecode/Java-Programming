package centroMedico;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		CentroMedico cm1 = new CentroMedico ("Hospital Arganda", "CM-1111");
		CentroMedico cm2 = new CentroMedico ("Hospital La Elipa", "CM-2222");
		Medico medico1 = new Medico ("Sara", "Garcia", "Caridiología", 111111, cm1);
		Medico medico2 = new Medico ("Gabriel Alexandru", "Iacob", "Cirugía", 222222, cm2);
		Paciente paciente1 = new Paciente ("Sergio", "Serano Arroyo", "1111111F", 111111111, cm1);
		Paciente paciente2 = new Paciente ("Jordan Daniel", "Zuñiga", "2222222M", 222222222, cm2);
		new Consulta (paciente1, medico1, LocalDate.now(), "dolor", "medicina");
		new Consulta (paciente2, medico2, LocalDate.now(), "me duele la tripa", "toma sopita");
		new Consulta (paciente1, medico2, LocalDate.now(), "me duele la espalda", "manten una postura recta");
		new Consulta (paciente2, medico1, LocalDate.now(), "no veo bien", "eso te pasa por andar descalzo");
		
		cm1.listarPacientes();
		System.out.println("--");
		cm2.listarPacientes();
		System.out.println("--");
		paciente1.cambiaCentroMedico(cm2);
		cm2.listarPacientes();
		
		System.out.println("----------");
		
		cm1.listarConsultas();
		medico1.listarConsultas();
		paciente1.listarConsultas();
	}
}