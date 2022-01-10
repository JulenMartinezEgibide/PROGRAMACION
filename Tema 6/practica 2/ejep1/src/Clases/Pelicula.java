package Clases;

import java.time.LocalDate;


public class Pelicula {
    private String Titulo;
    private LocalDate FechaC;
    private int Duracion;
    private String Tipo;


    public Pelicula() {
    }

    public Pelicula(String titulo, LocalDate fechaC, int duracion, String tipo) {
        Titulo = titulo;
        FechaC = fechaC;
        Duracion = duracion;
        Tipo = tipo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public LocalDate getFechaC() {
        return FechaC;
    }

    public void setFechaC(LocalDate fechaC) {
        FechaC = fechaC;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "Titulo='" + Titulo + '\'' +
                ", FechaC=" + FechaC +
                ", Duracion=" + Duracion +
                ", Tipo='" + Tipo + '\'' +
                '}';
    }
}