package Clases;

import java.util.Date;

public class Mascota {
    private String TipoA;
    private String Raza;
    private String NombreA;
    private Date Fnac;
    private float Peso;
    private float Longitud;
    private String TipoPelo;

    private Cliente Dueño;
    private Veterinario v;


    public Mascota(String tipoA, String raza, String nombreA, Date fnac, float peso, float longitud, String tipoPelo) {
        TipoA = tipoA;
        Raza = raza;
        NombreA = nombreA;
        Fnac = fnac;
        Peso = peso;
        Longitud = longitud;
        TipoPelo = tipoPelo;
    }

    public String getTipoA() {
        return TipoA;
    }

    public void setTipoA(String tipoA) {
        TipoA = tipoA;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public String getNombreA() {
        return NombreA;
    }

    public void setNombreA(String nombreA) {
        NombreA = nombreA;
    }

    public Date getFnac() {
        return Fnac;
    }

    public void setFnac(Date fnac) {
        Fnac = fnac;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float peso) {
        Peso = peso;
    }

    public float getLongitud() {
        return Longitud;
    }

    public void setLongitud(float longitud) {
        Longitud = longitud;
    }

    public String getTipoPelo() {
        return TipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        TipoPelo = tipoPelo;
    }

    public Cliente getDueño() {
        return Dueño;
    }

    public void setDueño(Cliente dueño) {
        Dueño = dueño;
    }

    public Veterinario getV() {
        return v;
    }

    public void setV(Veterinario v) {
        this.v = v;
    }

}
