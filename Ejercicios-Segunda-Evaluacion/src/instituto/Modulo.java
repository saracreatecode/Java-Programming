package instituto;

public class Modulo {
	private String nombre = "";
	private int anio;
	private int horasSemanales;
	private boolean optativa;

	public Modulo(String nom, int anio, int horasSemanales, boolean optativa) {
		this.nombre = nom;
		this.anio = anio;
		this.horasSemanales = horasSemanales;
		this.optativa = optativa;
	}

	public int getCurso() {
		return this.anio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
