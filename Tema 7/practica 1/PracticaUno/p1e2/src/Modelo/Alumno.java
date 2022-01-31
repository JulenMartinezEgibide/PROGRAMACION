package Modelo;

public class Alumno {
    private String dni;
    private String nombre;
    private String apellidos;

    private Curso c;

    public Alumno(String dni, String nombre, String apellidos, Curso c) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.c = c;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Curso getC() {
        return c;
    }

    public void setC(Curso c) {
        this.c = c;
    }
}
