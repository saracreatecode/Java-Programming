package FestivalCultural;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Concierto extends Actividad {
	private ArrayList<Artista> artistasInvitados = new ArrayList<>();

	public Concierto(String nombre, int aforoMaximo, LocalDateTime fechaHora) {
		super(nombre, aforoMaximo, fechaHora);
	}

	public void mostrarArtistasConcierto() {
		for (Artista artista: artistasInvitados) {
			System.out.println(artista.getNombre());
		}
	}

	public void mostrarConcierto() {
		System.out.println("INFO CONCIERTO");
		System.out.println("Nombre actividad: " + this.nombre);
		System.out.println("Aforo máximo: " + this.aforoMaximo);
		System.out.println("Fecha de la actividad: " + this.fechaHora);
		System.out.println("Artistas invitados: ");
		mostrarArtistasConcierto();
		System.out.println("-----------------------------");
	}

	public void invitarArtista(Artista artista) {
		artistasInvitados.add(artista);
	}


}
