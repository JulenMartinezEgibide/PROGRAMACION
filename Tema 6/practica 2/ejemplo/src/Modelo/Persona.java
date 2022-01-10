package Modelo;

import java.util.ArrayList;

public class Persona {
    private int id;
    private String dni;
    private String nombre;

    private ArrayList<Cuenta> listaCuentas;

    public Persona(int id, String dni, String nombre, ArrayList<Cuenta> listaCuentas) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.listaCuentas = listaCuentas;
    }

    public Persona(int id, String dni, String nombre) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public void setCuenta(Cuenta c)
    {
        this.listaCuentas.add(c);
    }
}
