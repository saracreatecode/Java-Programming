package FestivalCultural;

public class Artista extends Participante {

	public Artista(String nombre, String apodo, int id) {
		super(nombre, apodo, id);
	}
	public Artista(String nombre, int id) {
		super(nombre, id);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void mostrararArtista() {
		System.out.println("INFO ARTISTA");
		System.out.println("Nombre: " + this.nombre);
		if (this.apodo == null) {
			System.out.println("Apodo: no asignado");
		} else {
			System.out.println("Apodo: " + this.apodo);
		}
		System.out.println("Número identificativo: " + this.id);
		System.out.println("-----------------------------");
	}

}
