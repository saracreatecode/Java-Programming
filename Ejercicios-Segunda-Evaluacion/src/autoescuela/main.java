package autoescuela;

public class main {
	public static void main(String[] args) {
		Pregunta pregunta1 = new Pregunta ("¿Pregunta?", "Respuesta bla", "Respuesta bli", "Respuesta blo");
		Pregunta pregunta2 = new Pregunta ("¿Pregunta2?", "Respuesta una", "Respuesta dos", "Respuesta tres");
		Pregunta pregunta3 = new Pregunta ("¿Pregunta3?", "Respuesta hola", "Respuesta adios", "Respuesta quetal");
		Pregunta pregunta4 = new Pregunta ("¿Pregunta4?", "Respuesta mira", "Respuesta no mires", "Respuesta nose");
		Pregunta pregunta5 = new Pregunta ("¿Pregunta5?", "Respuesta programacion", "Respuesta bases", "Respuesta sistemas");
		Pregunta pregunta6 = new Pregunta ("¿Pregunta6?", "Respuesta casa", "Respuesta cole", "Respuesta insti");
		Pregunta pregunta7 = new Pregunta ("¿Pregunta7?", "Respuesta deporte", "Respuesta canto", "Respuesta arte");
		Pregunta pregunta8 = new Pregunta ("¿Pregunta8?", "Respuesta ingles", "Respuesta español", "Respuesta rumano");
		
		Examen examen1 = new Examen(4, Pregunta.getPreguntas());
		Examen examen2 = new Examen(6, Pregunta.getPreguntas());
		Examen examen3 = new Examen(3, Pregunta.getPreguntas());
		
		examen1.crearExamen(4, Pregunta.getPreguntas());
		examen1.mostrarExamen();
		examen1.mostrarSoluciones();
		
		examen1.corregirExamen();
	}
}