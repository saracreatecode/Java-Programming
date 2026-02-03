package FestivalCultural;

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) {
		LocalDateTime fechaFiestasArganda = LocalDateTime.of(2026, 3, 20, 21, 0);
		LocalDateTime fechaFiestasRivas = LocalDateTime.of(2026, 2, 10, 22, 0);
		Concierto fiestasArganda = new Concierto("Fiestas Arganda", 2, fechaFiestasArganda);
		Concierto fiestasRivas = new Concierto("Fiestas Arganda", 2, fechaFiestasRivas);
		
		LocalDateTime fechaExpoFotografia = LocalDateTime.of(2026, 1, 30, 17, 30);
		LocalDateTime fechaExpoVideojuegos = LocalDateTime.of(2026, 2, 2, 18, 0);
		Exposicion expoFotografia = new Exposicion("Exposicion Fotografía", 10, "Fotografía Arquitectónica", fechaExpoFotografia);
		Exposicion expoVideojuegos = new Exposicion("Exposicion Videojuegos", 20, "Videjuegos de los 2000", fechaExpoVideojuegos);
	
		LocalDateTime fechaTallerPintura = LocalDateTime.of(2026, 4, 15, 17, 0);
		LocalDateTime fechaTallerCostura = LocalDateTime.of(2026, 5, 2, 14, 0);
		Taller tallerPintura = new Taller("Taller de pintura", 5, "Pinceles, cuadros y pinturas", fechaTallerPintura);
		Taller tallerCostura = new Taller("Taller de costura", 8, "Maquina de coser, agujas e hilo", fechaTallerCostura);
		
		Artista art1 = new Artista("Billie Eilish", 1);
		Artista art2 = new Artista("Olivia Rodrigo", "Oli", 2);
		Asistente asi1 = new Asistente("Sara García Martín", "Sarita", 1);
		Asistente asi2 = new Asistente("Kevin Villaroel", 2);
		Asistente asi3 = new Asistente("Sergio Serrano Arroyo", 3);
		Asistente asi4 = new Asistente("Alexandru Iacob", 4);
		Asistente asi5 = new Asistente("Jordan Daniel Zuñiga", 5);
		
		
		asi1.registrarConcierto(fiestasArganda);
		asi1.registrarExposicion(expoFotografia);
		asi1.registrarTaller(tallerPintura);
		
		fiestasArganda.invitarArtista(art1);
		
		fiestasArganda.mostrarConcierto();
		
		asi1.mostrarConciertosAsociados();
		asi1.mostrarActividadesAsociadas();
		
	}
}