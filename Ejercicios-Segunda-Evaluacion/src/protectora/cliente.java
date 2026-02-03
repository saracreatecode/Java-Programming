package protectora;

public class cliente {
	private String nombre;
	private String apellidos;
	private int edad;
	private int tel;
	private String animalInteresado;
	private perro[] perrosAdoptados = new perro[3];
	private gato[] gatosAdoptados = new gato[2];
	private tortuga[] tortugasAdoptadas = new tortuga[1];

	public cliente(String nom, String ape, int edad, int tel, String animInter) {
		this.nombre = nom;
		this.apellidos = ape;
		this.edad = edad;
		this.tel = tel;
		this.animalInteresado = animInter;
	}

	public void mostrarCliente() {
		System.out.println("--- DATOS DEL CLIENTE ---");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellidos: " + this.apellidos);
		System.out.println("Edad: " + this.edad);
		System.out.println("Tel: " + this.tel);
		System.out.println("Animal interesado: " + this.animalInteresado);
		System.out.println("--------------------------------");

	}

	public void adoptaPerro(perro adoptado) {
		
	}

	public void adoptaGato(gato adoptado) {

	}

	public void adoptaTortuga(tortuga adoptado) {

	}
}