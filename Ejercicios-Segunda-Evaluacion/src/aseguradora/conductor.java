package aseguradora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class conductor {
	private String nif;
	private int anioNacimiento;
	private int puntosCarnet;
	private int anioCarnet;
	private int edad = 0; // se calcula
	

	public conductor(String nif, int anioNacimiento, int puntosCarnet, int anioCarnet) {
		this.nif = nif;
		this.anioNacimiento = anioNacimiento;
		this.puntosCarnet = puntosCarnet;
		this.anioCarnet = anioCarnet;
		
	}
	
	public String getNif() {
		return this.nif;
	}
	
	public int getEdad() {
		int hoy = LocalDate.now().getYear();
		return hoy - this.anioNacimiento;
	}
	
	public int getAntiguedadCarnet() {
		int hoy = LocalDate.now().getYear();
		return hoy - this.anioCarnet;
	}
	
	public void conductorMostrar() {
		System.out.println("--- DATOS DE CONDUCTOR ---");
		System.out.println("NIF: " + this.nif);
		System.out.println("Año de nacimiento: " + this.anioNacimiento);
		System.out.println("Año de obtención de carnet: " + this.anioCarnet);
		System.out.println("Puntos de carnet: " + this.puntosCarnet);
		System.out.println("Edad: " + this.getEdad());
		System.out.println("Años de antiguedad carnet: " + this.getAntiguedadCarnet());
	}
}


