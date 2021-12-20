package com.company;

public class Circunferencia {

    // Atributo
    private double radio;

    // Constructores
    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    // Métodos set y get
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Métodos varios
    public double getLongitud(){
        return 2 * Math.PI * radio;
    }

    public double getArea(){
        return Math.PI * Math.pow(getRadio(),2);
    }

    public double getVolumen(){
        return 4 * Math.PI * Math.pow(radio, 3) / 3;
    }
}

