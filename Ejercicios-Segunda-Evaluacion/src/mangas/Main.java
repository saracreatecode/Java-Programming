package mangas;

public class Main {
	public static void main(String[] args) {
		Manga m1 = new Manga ("Mangaka1", "Shonen", "ワンピース", 15);
		m1.setColeccionEspaniol("hola");
		m1.setUltimoNumPublicado(16);
		
		m1.comprarNumeros(15,16,17);
		m1.numerosQueFaltan();
		m1.eliminarNumero(15);
	}
	}