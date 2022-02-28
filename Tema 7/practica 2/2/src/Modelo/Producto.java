package Modelo;

public class Producto {
    private String NombreP;
    private int unidadesP;
    private float precioUniP;

    public Producto() {
    }

    public Producto(String nombreP, int unidadesP, float precioUniP) {
        NombreP = nombreP;
        this.unidadesP = unidadesP;
        this.precioUniP = precioUniP;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String nombreP) {
        NombreP = nombreP;
    }

    public float getPrecioUniP() {
        return precioUniP;
    }

    public void setPrecioUniP(int unidadesNuevas, float precioUniP) {
        this.precioUniP = (unidadesP * this.precioUniP + unidadesNuevas * precioUniP) / (unidadesP + unidadesNuevas);
    }

    public int getUnidadesP() {
        return unidadesP;
    }

    public void setUnidadesPC(int unidadesP) {
        this.unidadesP = this.unidadesP + unidadesP;
    }

    public void setUnidadesPV(int unidadesP) {
        this.unidadesP = this.unidadesP - unidadesP;
    }

}