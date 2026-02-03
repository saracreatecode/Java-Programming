package FestivalCultural;

import java.time.LocalDateTime;

public class Exposicion extends Actividad {
	private String tematica;
	
	public Exposicion (String nombre, int aforoMaximo, String tematica, LocalDateTime fechaHora)  {
		super(nombre, aforoMaximo, fechaHora);
		this.tematica = tematica;
	}
	
	public void mostrarExposicion() {
		System.out.println("INFO EXPOSICIÓN");
		System.out.println("Nombre actividad: " + this.nombre);
		System.out.println("Aforo máximo: " + this.aforoMaximo);
		System.out.println("Fecha de la actividad: " + this.fechaHora);
		System.out.println("Temática: " + this.tematica);
		System.out.println("-----------------------------");
	}

}
