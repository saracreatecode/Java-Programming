package autoescuela;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class Examen {
	private int numPreguntas;
	private HashSet<Pregunta> preguntasExamen = new HashSet<>();

	public Examen(int numPreguntas, ArrayList<Pregunta> preguntas) {
		this.numPreguntas = numPreguntas;
	}

	public void crearExamen(int numPreguntas, ArrayList<Pregunta> preguntas) {
		int max = preguntas.size();
		while (preguntasExamen.size()!= numPreguntas) {
			int azar = (int)(Math.random()*max);
			preguntasExamen.add(preguntas.get(azar));
		}
		System.out.println(preguntasExamen);
	}

	public void mostrarExamen() {
		for (Pregunta p: preguntasExamen) {
			System.out.println(p.getPregunta());
			String[] respuestas = p.getRespuestas();
			for (String r: respuestas) {
				System.out.println(r);
			}
			System.out.println("......................");
		}
	}

	public void mostrarSoluciones() {
		System.out.println("------- SOLUCIONES EXAMEN -------");
		for (Pregunta p: preguntasExamen) {
			System.out.print(p.getSolucion());
		}
	}
	
	public void corregirExamen () {
		int fallos = 0;
		int i=1;
		for (Pregunta p: preguntasExamen) {
			System.out.println("Respuesta a la pregunta " + (i+1) + ": ");
			Scanner teclado = new Scanner(System.in);
			String respuesta = teclado.nextLine();
			if (respuesta.charAt(0) != p.getSolucion().charAt(0)) {
				fallos++;
			}
			i++;
		}
		System.out.println("Número de fallos: " + fallos);
	}
}
