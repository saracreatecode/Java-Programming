package FestivalCultural;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Taller extends Actividad {
	private String materialesEspeciales;

	public Taller(String nombre, int aforoMaximo, String materialesEspeciales, LocalDateTime fechaHora) {
		super(nombre, aforoMaximo, fechaHora);
		this.materialesEspeciales = materialesEspeciales;
	}
	
	public void mostrarTaller() {
		System.out.println("INFO TALLER");
		System.out.println("Nombre actividad: " + this.nombre);
		System.out.println("Aforo máximo: " + this.aforoMaximo);
		System.out.println("Fecha de la actividad: " + this.fechaHora);
		System.out.println("Materiales especiales: " + this.materialesEspeciales);
		System.out.println("-----------------------------");
	}

}
