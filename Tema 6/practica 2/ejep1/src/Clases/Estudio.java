package Clases;


import java.time.LocalDate;
import java.util.ArrayList;

public class Estudio {
private String Nombre;
private String Ciudad;
private String Direccion;
private String DireccionWeb;
private LocalDate FechaFunda;
private String Pais;
private String Telefonos;
private ArrayList<Pelicula> listaPeliculas;

public Estudio(){
}

    public Estudio(String nombre, String ciudad, String direccion, String direccionWeb, LocalDate fechaFunda, String pais, String telefonos) {
        Nombre = nombre;
        Ciudad = ciudad;
        Direccion = direccion;
        DireccionWeb = direccionWeb;
        FechaFunda = fechaFunda;
        Pais = pais;
        Telefonos = telefonos;
    }

    public Estudio(String nombre, String ciudad, String direccion, String direccionWeb, LocalDate fechaFunda, String pais, String telefonos, ArrayList<Pelicula> listaPeliculas) {
        Nombre = nombre;
        Ciudad = ciudad;
        Direccion = direccion;
        DireccionWeb = direccionWeb;
        FechaFunda = fechaFunda;
        Pais = pais;
        Telefonos = telefonos;
        this.listaPeliculas = listaPeliculas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getDireccionWeb() {
        return DireccionWeb;
    }

    public void setDireccionWeb(String direccionWeb) {
        DireccionWeb = direccionWeb;
    }

    public LocalDate getFechaFunda() {
        return FechaFunda;
    }

    public void setFechaFunda(LocalDate fechaFunda) {
        FechaFunda = fechaFunda;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getTelefonos() {
        return Telefonos;
    }

    public void setTelefonos(String telefonos) {
        Telefonos = telefonos;
    }

    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    @Override
    public String toString() {
        return "Estudio{" +
                "Nombre='" + Nombre + '\'' +
                ", Ciudad='" + Ciudad + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", DireccionWeb='" + DireccionWeb + '\'' +
                ", FechaFunda=" + FechaFunda +
                ", Pais='" + Pais + '\'' +
                ", Telefonos='" + Telefonos + '\'' +
                ", listaPeliculas=" + listaPeliculas +
                '}';
    }
}
