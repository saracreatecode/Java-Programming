package mangas;

import java.util.ArrayList;

import instituto.Modulo;

public class Manga {
	private String mangaka;
	private String coleccion;
	private String coleccionJaponesa;
	private String coleccionEspaniol;
	private int ultimoNumPublicado;
	private ArrayList<Integer> numerosComprados = new ArrayList<>();

	
	public Manga(String mangaka, String coleccion, String coleccionJaponesa, int ultimoNumeroPublicado) {
		this.mangaka = mangaka;
		if (!coleccion.equalsIgnoreCase("shonen") &&
				!coleccion.equalsIgnoreCase("shojo") &&
				!coleccion.equalsIgnoreCase("seinen") &&
				!coleccion.equalsIgnoreCase("josei") &&
				!coleccion.equalsIgnoreCase("kodomo") &&
				!coleccion.equalsIgnoreCase("yuri") &&
				!coleccion.equalsIgnoreCase("spokon") &&
				!coleccion.equalsIgnoreCase("isekai") &&
				!coleccion.equalsIgnoreCase("hentai")
				) {
			System.out.println("ERROR: Colección no válida");
		} else {
			this.coleccion = coleccionJaponesa.toLowerCase();
		}
		this.ultimoNumPublicado = ultimoNumPublicado;
		
	}

	public String getMangaka() {
		return mangaka;
	}

	public String getColeccionJaponesa() {
		return coleccionJaponesa;
	}

	public String getColeccionEspaniol() {
		return coleccionEspaniol;
	}

	public void setColeccionEspaniol(String coleccionEspaniol) {
		this.coleccionEspaniol = coleccionEspaniol;
	}

	public int getUltimoNumPublicado() {
		return ultimoNumPublicado;
	}

	public void setUltimoNumPublicado(int ultimoNumPublicado) {
		this.ultimoNumPublicado = ultimoNumPublicado;
	}

	public void comprarNumeros(int... numeros) {
		System.out.println("-- INFORMACIÓN DE COMPRA --");
	    for (int n : numeros) {
	        if (n > ultimoNumPublicado || n <= 0) {
	            System.out.println("El número " + n + " no existe en la colección");
	        } else if (numerosComprados.contains(n)) {
	            System.out.println("Ya tienes el número " + n);
	        } else {
	            numerosComprados.add(n);
	            System.out.println("Comprado número " + n);
	        }
	    }
	    System.out.println("----------------------------------");
	}

	public void numerosQueFaltan() {
		System.out.println("-- INFORMACIÓN DE LIBROS QUE FALTAN EN TU COLECCIÓN --");
	    for (int i = 1; i <= ultimoNumPublicado; i++) {
	        if (!numerosComprados.contains(i)) {
	            System.out.println("Falta el número " + i);
	        }
	    }
	    System.out.println("----------------------------------");
	}

	public void eliminarNumero(int numero) {
		System.out.println("-- INFORMACIÓN DE NÚMERO ELIMINADO/PERDIDO --");
	    if (numerosComprados.contains(numero)) {
	        numerosComprados.remove(Integer.valueOf(numero));
	        System.out.println("Eliminado/perdido número " + numero);
	    } else {
	        System.out.println("No tienes el número " + numero);
	    }
	    System.out.println("----------------------------------");
	}
	
	
}
