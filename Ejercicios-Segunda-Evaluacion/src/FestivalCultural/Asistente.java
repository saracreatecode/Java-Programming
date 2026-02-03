package FestivalCultural;

import java.util.ArrayList;

public class Asistente extends Participante {
	private ArrayList<Concierto> conciertosAsociados = new ArrayList<>();
	private ArrayList<Exposicion> exposicionesAsociados = new ArrayList<>();
	private ArrayList<Taller> talleresAsociados = new ArrayList<>();
	private ArrayList<Actividad> actividadesAsociadas = new ArrayList<>();

	public Asistente(String nombre, String apodo, int id) {
		super(nombre, apodo, id);
	}
	
	public Asistente(String nombre, int id) {
		super(nombre, id);
	}

	public void registrarConcierto(Concierto concierto) {
		if (conciertosAsociados.size()>= concierto.getAforoMaximo()) {
			System.out.println("Error: el aforo de este concierto ya está completo, no te puedes registrar.");
		} else {
			conciertosAsociados.add(concierto);
			actividadesAsociadas.add(concierto);
		}	
	}
	
	public void registrarExposicion(Exposicion exposicion) {
		if (exposicionesAsociados.size()>= exposicion.getAforoMaximo()) {
			System.out.println("Error: el aforo de esta exposicion ya está completo, no te puedes registrar.");
		} else {
		exposicionesAsociados.add(exposicion);
		actividadesAsociadas.add(exposicion);
		}
	}
	
	public void registrarTaller(Taller taller) {
		if (talleresAsociados.size()>= taller.getAforoMaximo()) {
			System.out.println("Error: el aforo de este taller ya está completo, no te puedes registrar.");
		} else {
		talleresAsociados.add(taller);
		actividadesAsociadas.add(taller);
		}
	}
	
	public void mostrarConciertosAsociados() {
		System.out.println("CONCIERTOS ASOCIADOS");
		System.out.println("Nombre de Asistente: " + this.nombre);
		for (Concierto concierto: conciertosAsociados) {
			System.out.println(concierto.getNombre());
		}
		System.out.println("-----------------------------");
	}
	
	public void mostrarExposicionesAsociadas() {
		System.out.println("EXPOSICIONES ASOCIADAS");
		System.out.println("Nombre de Asistente: " + this.nombre);
		for (Exposicion exposicion: exposicionesAsociados) {
			System.out.println(exposicion.getNombre());
		}
		System.out.println("-----------------------------");
	}
	
	public void mostrarTalleresAsociadas() {
		System.out.println("TALLERES ASOCIADOS");
		System.out.println("Nombre de Asistente: " + this.nombre);
		for (Taller taller: talleresAsociados) {
			System.out.println(taller.getNombre());
		}
		System.out.println("-----------------------------");
	}
	
	public void mostrarActividadesAsociadas() {
		System.out.println("ACTIVIDADES ASOCIADAS");
		System.out.println("Nombre de Asistente: " + this.nombre);
		for (Actividad actividad: actividadesAsociadas) {
			System.out.println(actividad.getNombre());
		}
		System.out.println("-----------------------------");
	}
}
