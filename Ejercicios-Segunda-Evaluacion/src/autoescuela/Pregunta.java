package autoescuela;

import java.util.ArrayList;
import java.util.HashSet;

public class Pregunta {
	private String pregunta;
	private String correcta;
	private String falsa1;
	private String falsa2;
	private String solucion;
	private static ArrayList<Pregunta> preguntas = new ArrayList<>();

	// La correcta siempre es la respuesta1 introducida en la creación del objeto

	public Pregunta(String pregunta, String correcta, String falsa1, String falsa2) {
		this.pregunta = pregunta;
		this.correcta = correcta;
		this.falsa1 = falsa1;
		this.falsa2 = falsa2;
		preguntas.add(this);
	}

	public static ArrayList<Pregunta> getPreguntas() {
		return Pregunta.preguntas;
	}

	public String getPregunta() {
		return this.pregunta;
	}

	public String[] getRespuestas() {
		String[] respuestas = new String[3];
		
		HashSet<Integer> posiciones = new HashSet<>();
		ArrayList<Integer> posiciones2 = new ArrayList<>();
		while (posiciones.size()!=3) {
			int azar = (int)(Math.random()*3);
			if (posiciones.add(azar) == true) {
				posiciones2.add(azar);
			}
		}
		int i = 0;
		String[] letras = {"A - ", "B - ", "C - "};
		for (int n:posiciones2) {
			switch(n) {
			case 0:
				respuestas[i] = letras[i] + this.correcta;
				this.solucion = letras[i];
				break;
			case 1:
				respuestas[i] = letras[i] + this.falsa1;
				break;
			case 2:
				respuestas[i] = letras[i] + this.falsa2;
				break;
			}
			i++;
		}
		return respuestas;
	}
	
	public String getSolucion() {
		return this.solucion;
	}
	
}
