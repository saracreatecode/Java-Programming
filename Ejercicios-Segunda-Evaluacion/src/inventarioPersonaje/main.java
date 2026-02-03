package inventarioPersonaje;

public class main {
	public static void main(String[] args) {
		Personaje personaje1 = new Personaje ("Sara");
		
		Accesorio espadaNetherite = new Accesorio ("Espada de Netherite", 10);
		Accesorio picoNetherite = new Accesorio ("Pico de Netherite", 9);
		Accesorio hachaNetherite = new Accesorio ("Hacha de Netherite", 8);
		Accesorio palaNetherite = new Accesorio ("Pala de Netherite", 7);
		Accesorio azadaNetherite = new Accesorio ("Azada de Netherite", 4);
		Accesorio mochilaDiamante = new Accesorio ("Mochila de Diamante", 10);
		Accesorio elitras = new Accesorio ("Elitras", 10);
		Accesorio cascoNetherite = new Accesorio ("Casco de Netherite", 9);
		Accesorio pecheraNetherite = new Accesorio ("Pechera de Netherite", 10);
		Accesorio pantalonesNetherite = new Accesorio ("Pantalones de Netherite", 7);
		Accesorio botasNetherite = new Accesorio ("Botas de Netherite", 6);
		
		personaje1.anyadirObjeto(espadaNetherite);
		personaje1.anyadirObjeto(picoNetherite);
		personaje1.anyadirObjeto(hachaNetherite);
		personaje1.anyadirObjeto(palaNetherite);
		personaje1.anyadirObjeto(azadaNetherite);
		personaje1.anyadirObjeto(mochilaDiamante);
		personaje1.anyadirObjeto(elitras);
		personaje1.anyadirObjeto(cascoNetherite);
		personaje1.anyadirObjeto(pecheraNetherite);
		personaje1.agotarAccesorio(espadaNetherite);
		personaje1.mostrarPersonaje();
	}
}