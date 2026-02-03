package protectora;

public class protectora {
	perro[] listaPerros;
	gato[] listaGatos;
	tortuga[] listaTortugas;
	
	public protectora () {
		this.listaPerros = listaPerros;
		this.listaGatos = listaGatos;
		this.listaTortugas = listaTortugas;
	}

	public void mostrarTodosLosAnimales() {
		for (perro mostrar: listaPerros) {
			System.out.println(mostrar);
		}
	}
}
