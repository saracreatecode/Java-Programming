package pokemons;

public class Pokemon {
	private String nombre;
	private int codigo;
	private String[] tipo = new String[2];
	private int pv;
	private Pokemon evolucion = null;

	// esto es el constructor que tiene que tener el mismo nombre que la clase
	public Pokemon(int cod, String nom, String tip) {
		this.codigo = cod;
		this.nombre = nom;
		this.tipo[0] = tip;
		this.pv = (int) (Math.random() * 51) + 50;
	}

	// esto es otro constructor que tiene que tener el mismo nombre que la clase
	public Pokemon(int cod, String nom, String tip1, String tip2) {
		this.codigo = cod;
		this.nombre = nom;
		this.tipo[0] = tip1;
		this.tipo[1] = tip2;
		this.pv = (int) (Math.random() * 51) + 50;
		;
	}

	public void mostrar() {
		System.out.println("Tu pokemon es: " + this.codigo + " - " + this.nombre);
		if (this.tipo[1] == null) {
			System.out.println("Tipo: " + this.tipo[0]);
		} else {
			System.out.println("Tipos: " + this.tipo[0] + ", " + this.tipo[1]);
		}
		if (this.evolucion != null) {
			System.out.println("Evoluciona en " + this.evolucion.nombre);
		}
		System.out.println("PV: " + this.pv);
		System.out.println("-------");
	}

	public void setEvolucion(Pokemon p) {
		this.evolucion = p;
	}

	public Pokemon evoluciona() {
		Pokemon pokemon = this;
		if (this.evolucion == null) {
			System.out.println("ESte pokemon no evoluciona");
		} else {
			pokemon = this.evolucion;
		}
		return pokemon;
	}

	public boolean combateContra(Pokemon atacado) {
		boolean combateTerminado = false;
		boolean vencedor = false;
		if (this.pv == 0 || atacado.pv <= 0) {
			System.out.println("Un pokemon sin PV no puede combatir");
		} else {
			do {
				int danio = (int) (Math.random() * 51) + 25;
				atacado.pv -= danio;
				if (atacado.pv > 0) {
					danio = (int) (Math.random() * 51) + 25;
					this.pv -= danio;
					
					if (this.pv > 0) {
						combateTerminado = false;
					} else {
						vencedor = false;
						System.out.println(this.nombre + " ha sido derrotado");
						combateTerminado = true;
						
					}
				} else {
					vencedor = true;
					System.out.println(atacado.nombre + " ha sido derrotado");
					combateTerminado = true;
				}
			} while (combateTerminado = false);
			
		}
		// True si gana el atacante, false si gana el atacado
		return vencedor;
	}

}