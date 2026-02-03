package protectora;

public class tortuga extends animal {
	private String terrestreOacuatica;

	public tortuga(int anioNacim, String nom, String terrOacu) {
		super(anioNacim, nom);
		this.terrestreOacuatica = terrOacu;
	}

	public tortuga(int anioNacim, String terrOacu) {
		super(anioNacim);
		this.terrestreOacuatica = terrOacu;

	}

	public void mostrarTortuga() {
		System.out.println("--- DATOS DE LA TORTUGA ---");
		if (this.nombre == null) {
			System.out.println("Nombre: no asignado");
		} else {
			System.out.println("Nombre: " + this.nombre);
		}
		System.out.println("Año de nacimiento: " + this.anioNacimeinto);
		System.out.println("Terrestre o acuática: " + this.terrestreOacuatica);
		System.out.println("--------------------------------");
		
	}

}
