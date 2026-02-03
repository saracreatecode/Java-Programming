package instituto;

public class Alumno extends Persona {
	private int edad;
	private boolean mayordeEdad = false;

	public Alumno(String nom, String ape, int edad) {
		super(nom, ape);
		this.edad = edad;
		if (edad >= 18) {
			mayordeEdad = true;
		}
	}
}