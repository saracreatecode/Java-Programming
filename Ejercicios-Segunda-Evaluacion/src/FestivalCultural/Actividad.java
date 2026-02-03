package FestivalCultural;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract class Actividad {
	protected String nombre;
	protected int aforoMaximo;
	protected LocalDateTime fechaHora;
	
	public Actividad (String nombre, int aforoMaximo, LocalDateTime fechaHora) {
		this.nombre = nombre;
		this.aforoMaximo = aforoMaximo;
		this.fechaHora = fechaHora;
	}
	
    public void mostrarFechaHora() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println(fechaHora.format(formatter));
    }
    
    public int getAforoMaximo() {
    	return this.aforoMaximo;
    }
    
    public String getNombre() {
    	return this.nombre;
    }
}
