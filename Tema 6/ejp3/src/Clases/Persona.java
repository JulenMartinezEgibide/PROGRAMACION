package Clases;

import java.time.LocalDate;
import java.util.Date;

public class Persona {
private String nombre;
private LocalDate FechaCumple;
private String direccion;
private int codigoPostal;
private String ciudad;


    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaCumple, String direccion, int codigoPostal, String ciudad) {
        this.nombre = nombre;
        FechaCumple = fechaCumple;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCumple() {
        return FechaCumple;
    }

    public void setFechaCumple(LocalDate fechaCumple) {
        FechaCumple = fechaCumple;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", FechaCumple=" + FechaCumple +
                ", direccion='" + direccion + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}


