package Clases;

import java.util.ArrayList;

public class Directivo extends Empleado {
    private String Categoria;
    private ArrayList<Empleado> subordinados;

    public Directivo() {
    }

    public Directivo(String nombre, int edad, int sueldoBruto, String categoria) {
        super(nombre, edad, sueldoBruto);
        Categoria = categoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public ArrayList<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
    }

    @Override
    public String mostrar(){
        return this.getNombre() + " " + this.getEdad() + " " + this.getSueldoBruto() + " " + this.getCategoria();
    }
}
