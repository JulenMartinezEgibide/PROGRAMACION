package Modelo;

public class Cuenta {
    private int id;
    private float saldo;
    private String divisa;

    private Persona p;

    public Cuenta(int id, float saldo, String divisa, Persona p) {
        this.id = id;
        this.saldo = saldo;
        this.divisa = divisa;
        this.p = p;
    }

    public Cuenta(int id, float saldo, String divisa) {
        this.id = id;
        this.saldo = saldo;
        this.divisa = divisa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    public Persona getP() {
        return p;
    }

    public void setP(Persona p) {
        this.p = p;
    }
}
