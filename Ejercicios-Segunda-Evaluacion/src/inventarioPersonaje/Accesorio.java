package inventarioPersonaje;

public class Accesorio {
	private String nombre;
	private int valorEnOro;
	
	public Accesorio(String nombre, int valorEnOro) {
		this.nombre = nombre;
		this.valorEnOro = valorEnOro;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getValorEnOro() {
		return this.valorEnOro;
	}

}
