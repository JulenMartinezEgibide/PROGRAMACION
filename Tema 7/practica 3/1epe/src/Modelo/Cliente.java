package Modelo;

import java.util.ArrayList;

public class Cliente {
    private String dni;
    private String nombreApellido;
    private String clave;
    private ArrayList<Cuenta>listaCuenta;

    public Cliente(String dni, String nombreApellido, String clave) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.clave = clave;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ArrayList<Cuenta> getListaCuenta() {
        return listaCuenta;
    }

    public void setListaCuenta(ArrayList<Cuenta> listaCuenta) {
        this.listaCuenta = listaCuenta;
    }
}
