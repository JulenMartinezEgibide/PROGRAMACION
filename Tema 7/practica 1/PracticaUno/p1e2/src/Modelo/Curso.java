package Modelo;

import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String descripcion;

    private ArrayList<Alumno> listaAlumnos;


    public Curso(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        listaAlumnos = new ArrayList();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public void setAlumno(Alumno a)
    {
        listaAlumnos.add(a);
    }

    public void borrarAlumno(Alumno a)
    {
        listaAlumnos.remove(a);
    }
}
