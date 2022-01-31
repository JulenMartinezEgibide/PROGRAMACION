package Modelo;

public class Persona {

    private String dniP;
    private String nombreP;
    private String apellidosP;

    public Persona(String dniP, String nombreP, String apellidosP) {
        this.dniP = dniP;
        this.nombreP = nombreP;
        this.apellidosP = apellidosP;
    }

    public String getDniP() {
        return dniP;
    }

    public void setDniP(String dniP) {
        this.dniP = dniP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getApellidosP() {
        return apellidosP;
    }

    public void setApellidosP(String apellidosP) {
        this.apellidosP = apellidosP;
    }

    @Override
    public String toString() {
        return "Datos de la persona: " +"\n" +dniP +"\n"
                +nombreP+"\n"
                +apellidosP+"\n";
    }
}
