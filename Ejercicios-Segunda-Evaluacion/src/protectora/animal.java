package protectora;

abstract class animal {
	protected int anioNacimeinto;
	protected String nombre;
	protected boolean estaAdoptado = false;
	
	public animal (int anioNacim, String nom) {
		this.anioNacimeinto = anioNacim;
		this.nombre = nom;
	}
	
	/* el nombre es opcional por eso creamos 2 constructores
	 * para que en cualquier caso se llame a alguno de ellos
	 */
	public animal (int anioNacim) {
		this.anioNacimeinto = anioNacim;
	}
	
}
