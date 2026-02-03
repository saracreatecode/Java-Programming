package protectora;

public class perro extends animal {
	private boolean estaVacunado = false;
	private String vacuna;
	public perro(int anioNacim, String nom, String vacuna) {
		super(anioNacim, nom);
		this.vacuna = vacuna;
		
	}
	
	public perro(int anioNacim, String vacuna) {
		super(anioNacim);
		this.vacuna = vacuna;
		
	}
	
	public void estaVacunado() {
		if (this.vacuna.equalsIgnoreCase("si")) {
			this.estaVacunado = true;
		} else if (this.vacuna.equalsIgnoreCase("no")) {
			this.estaVacunado = false;
		}
	}
	
	public void mostrarPerro() {
		System.out.println("--- DATOS DEL PERRO ---");
		if (this.nombre == null) {
			System.out.println("Nombre: no asignado");
		} else {
			System.out.println("Nombre: " + this.nombre);
		}
		System.out.println("Año de nacimiento: " + this.anioNacimeinto);
		System.out.println("Está vacunado?: " + this.vacuna);
		System.out.println("--------------------------------");

	}
}
