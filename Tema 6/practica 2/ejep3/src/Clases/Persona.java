package Clases;

public class Persona {
    private String Nombre;
    private int Edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        Nombre = nombre;
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String mostrar(){
        return this.Nombre + " " + this.Edad;
    }

}
