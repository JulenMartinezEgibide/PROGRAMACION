package Clases;

import java.util.ArrayList;

public class Persona {
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private ArrayList<Mascota> listaMascota;

    public Persona() {
    }

    public Persona(String nombre, String direccion, String telefono) {
        Nombre = nombre;
        Direccion = direccion;
        Telefono = telefono;
        this.listaMascota = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public ArrayList<Mascota> getListaMascota() {
        return listaMascota;
    }

    public void setListaMascota(ArrayList<Mascota> listaMascota) {
        this.listaMascota = listaMascota;
    }
}
