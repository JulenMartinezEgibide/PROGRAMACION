package Clases;

import java.util.ArrayList;

public class Veterinario extends Persona{
    private String Dni;
    private String NSocial;


    public Veterinario(String nombre, String direccion, String telefono, String dni, String NSocial) {
        super(nombre, direccion, telefono);
        Dni = dni;
        this.NSocial = NSocial;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getNSocial() {
        return NSocial;
    }

    public void setNSocial(String NSocial) {
        this.NSocial = NSocial;
    }

}
