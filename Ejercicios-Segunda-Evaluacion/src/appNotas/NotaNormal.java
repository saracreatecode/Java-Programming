package appNotas;

public class NotaNormal extends Nota {

    public NotaNormal(String titulo, String descripcion, String color) {
        super(titulo, descripcion, color);
    }

    public boolean confirmarEliminacion() {
        return true;
    }

    public String mostrar() {
        return String.format(
                """
                -----------------
                NOTA NORMAL
                Título : %s
                Color  : %s
                Fecha  : %s
                Descripción:
                %s
                -----------------
                """,
                titulo, color, fechaCreacion, descripcion
        );
    }
}
