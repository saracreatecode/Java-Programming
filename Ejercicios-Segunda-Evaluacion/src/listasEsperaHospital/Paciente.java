package listasEsperaHospital;

import java.util.HashMap;
import java.util.Map;

public class Paciente extends Persona {
	private HashMap<String, Medico> listaCitas = new HashMap<>();

	public Paciente(String nombre) {
		super(nombre);
	}

	public void pideCita(Especialidad especialidad) {

		if (this.listaCitas.containsKey(especialidad.getNombre())) {
			// hacemos esto para poder conseguir el nombre del médico
			Medico medico = listaCitas.get(especialidad.getNombre());
			System.out.println("Usted ya tiene una cita programada para la especialidad " + especialidad.getNombre());
			System.out.println("Su médico de la cita es " + medico.getNombre());

		} else if (especialidad.numMedicos()== 0) {
			System.out.println("No hay médicos de la especialidad " + especialidad.getNombre());

		} else {
			Medico medico = especialidad.getMedico();
			medico.incrementaContadorCitas();
			listaCitas.put(especialidad.getNombre(), medico);
			System.out.println("Cita asignada en la especialidad " + especialidad.getNombre() + " con el médico " + medico.getNombre());
		}
	}

}
