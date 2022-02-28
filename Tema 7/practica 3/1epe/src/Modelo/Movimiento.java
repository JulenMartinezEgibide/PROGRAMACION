package Modelo;

import java.time.LocalDate;
import java.util.Date;

public class Movimiento {
    private LocalDate fechaM;
    private String descripcion;
    private float importe;

    public Movimiento(LocalDate fechaM, String descripcion, float importe) {
        this.fechaM = fechaM;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    public LocalDate getFechaM() {
        return fechaM;
    }

    public void setFechaM(LocalDate fechaM) {
        this.fechaM = fechaM;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }
}
