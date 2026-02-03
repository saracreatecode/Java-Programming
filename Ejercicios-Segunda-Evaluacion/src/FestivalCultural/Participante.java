package FestivalCultural;

abstract class Participante {
	protected String nombre;
	protected String apodo;
	protected int id;
	
	public Participante (String nombre, String apodo, int id) {
		this.nombre = nombre;
		this.apodo = apodo;
		this.id = id;
	}
	
	public Participante (String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}
}
