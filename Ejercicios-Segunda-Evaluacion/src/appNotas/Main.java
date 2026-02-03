package appNotas;

import appNotas.GestorNotas;
import appNotas.NotaNormal;
import appNotas.NotaUrgente;

public class Main {
    public static void main(String[] args) {

        GestorNotas gestor = new GestorNotas();

        gestor.crearNota(new NotaNormal(
                "Compra",
                "Comprar leche y pan",
                "Amarillo"
        ));

        gestor.crearNota(new NotaUrgente(
                "Examen",
                "Estudiar Java para mañana"
        ));

        gestor.crearNota(new NotaNormal(
                "Gym",
                "Entrenar piernas",
                "Verde"
        ));

        gestor.listarNotas();

        gestor.eliminarNota("Examen");

        gestor.listarNotas();
    }
}
