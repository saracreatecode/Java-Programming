package appNotas;

import java.time.LocalDate;

public abstract class Nota {
    protected String titulo;
    protected String descripcion;
    protected String color;
    protected LocalDate fechaCreacion;

    public Nota(String titulo, String descripcion, String color) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.color = color;
        this.fechaCreacion = LocalDate.now();
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract boolean confirmarEliminacion();

    public abstract String mostrar();
}
