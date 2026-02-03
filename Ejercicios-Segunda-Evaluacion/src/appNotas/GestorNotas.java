package appNotas;

import java.util.ArrayList;
import java.util.List;

public class GestorNotas {
    private List<Nota> notas = new ArrayList<>();

    public void crearNota(Nota nota) {
        notas.add(nota);
    }

    public void eliminarNota(String titulo) {
        for (Nota nota : notas) {
            if (nota.getTitulo().equalsIgnoreCase(titulo)) {
                if (nota.confirmarEliminacion()) {
                    notas.remove(nota);
                    System.out.println("Nota eliminada.");
                } else {
                    System.out.println("Eliminación cancelada.");
                }
                return;
            }
        }
        System.out.println("Nota no encontrada.");
    }

    public void listarNotas() {
        System.out.println("\nLISTADO DE NOTAS\n");

        for (Nota nota : notas) {
            if (nota instanceof NotaUrgente) {
                System.out.println(nota.mostrar());
            }
        }

        for (Nota nota : notas) {
            if (nota instanceof NotaNormal) {
                System.out.println(nota.mostrar());
            }
        }
    }
}
