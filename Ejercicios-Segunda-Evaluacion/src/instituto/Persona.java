package instituto;

abstract class Persona {
	protected String nombre = "";
	protected String apellido = "";
	
	public Persona(String nom, String ape) {
		this.nombre = nom;
		this.apellido = ape;
	}
	
	public String getNombre() {
		return this.apellido + ", " + this.nombre;
	}
	
}
