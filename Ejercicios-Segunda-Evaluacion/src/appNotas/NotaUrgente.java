package appNotas;

import java.util.Scanner;

public class NotaUrgente extends Nota {

    public NotaUrgente(String titulo, String descripcion) {
        super(titulo, descripcion, "ROJO");
    }

    public boolean confirmarEliminacion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Seguro que quieres eliminar la nota URGENTE? (s/n): ");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("s");
    }

    public String mostrar() {
        return String.format(
                """
                ---NOTA URGENTE--- !!!!!
                !!! %s
                Fecha : %s
                %s
                -----------------
                """,
                titulo, fechaCreacion, descripcion
        );
    }
}
