package Clases;

import java.util.ArrayList;


public class Pelicula {
    private String Titulo;
    private int FechaC;
    private int Duracion;
    private String Tipo;
    private ArrayList<Estudio> listaEstudios;

    public Pelicula() {
    }

    public Pelicula(String titulo, int fechaC, int duracion, String tipo, ArrayList<Estudio> listaEstudios) {
        Titulo = titulo;
        FechaC = fechaC;
        Duracion = duracion;
        Tipo = tipo;
        this.listaEstudios = listaEstudios;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getFechaC() {
        return FechaC;
    }

    public void setFechaC(int fechaC) {
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

    public ArrayList<Estudio> getListaEstudios() {
        return listaEstudios;
    }

    public void setListaEstudios(ArrayList<Estudio> listaEstudios) {
        this.listaEstudios = listaEstudios;
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