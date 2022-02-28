package Modelo;

import java.util.ArrayList;

public class Cuenta {
    private String numero;
    private ArrayList<Movimiento> listaMoviemiento;

    public Cuenta(String numero) {
        this.numero = numero;
        this.listaMoviemiento = new ArrayList();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Movimiento> getListaMoviemiento() {
        return listaMoviemiento;
    }

    public void setListaMoviemiento(ArrayList<Movimiento> listaMoviemiento) {
        this.listaMoviemiento = listaMoviemiento;
    }
}
