package pokemons;

public class pokemonMain {
	public static void main(String[] args) {

		Pokemon p1 = new Pokemon(1, "Bulbasur", "Planta");
		Pokemon p2 = new Pokemon(6, "Charizard", "Fuego", "Volador");
		Pokemon p3 = new Pokemon(2, "Ivysaur", "Planta");
		Pokemon p4 = new Pokemon(8, "Piplup", "Agua");
		Pokemon p5 = new Pokemon(9, "Sergio", "Tierra");
		Pokemon p6 = new Pokemon(10, "Sara", "Agua");
		
		Equipo equipo1 = new Equipo("" , p1, p2, p3);
		Equipo equipo2 = new Equipo("Carlota" , p4, p5, p6);

		// p1.setEvolucion(p3);
		// p2 = p2.evoluciona();
		// p2.mostrar();
		// p4 = p4.evoluciona();
		// p4.mostrar();

		// p4.combateContra(p2);
		
		equipo1.mostrar();
		equipo1.combateEquipos(equipo2);
		
		
	}

}
