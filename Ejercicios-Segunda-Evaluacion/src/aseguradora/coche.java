package aseguradora;

import java.time.LocalDate;

public class coche extends vehiculo {
	public coche(String matricula, int anioFabricacion, conductor conductorAsociado) {
		super(matricula, anioFabricacion, conductorAsociado);
	}
	
	public void cocheMostrar() {
		System.out.println("--- DATOS DE COCHE ---");
		System.out.println("Matrícula de coche: " + this.matricula);
		System.out.println("Año de fabricación: " + this.anioFabricacion);
		System.out.println("Conductor asociado: " + conductorAsociado.getNif());
	}
	
	public double seguroCoche() {
		double seguro = 0;
		double todoRiesgo = 0;
		double terceros = 250;
		int hoy = LocalDate.now().getYear();
		int antiguedad = hoy - this.anioFabricacion;
		if (antiguedad <= 1) {
			todoRiesgo = 400;
		} else if (antiguedad >1 && antiguedad <=2) {
			todoRiesgo = 500;
		} else if (antiguedad >2 && antiguedad<=3) {
			todoRiesgo = 700;
		} else if (antiguedad >3) {
			todoRiesgo = antiguedad * 250;
		}
		
		seguro = todoRiesgo + terceros;
		System.out.println("Este es el seguro de tu coche: ");
		return seguro;
	}
	
	
}

