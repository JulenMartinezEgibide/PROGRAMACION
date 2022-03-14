package Modelo.UML;

public class Persona {
    private String nombreP;
    private  int edad;
    private String profesionP;
    private String telefonoP;

    public Persona(String nombreP, int edad, String profesionP, String telefonoP) {
        this.nombreP = nombreP;
        this.edad = edad;
        this.profesionP = profesionP;
        this.telefonoP = telefonoP;
    }

    public Persona() {
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesionP() {
        return profesionP;
    }

    public void setProfesionP(String profesionP) {
        this.profesionP = profesionP;
    }

    public String getTelefonoP() {
        return telefonoP;
    }

    public void setTelefonoP(String telefonoP) {
        this.telefonoP = telefonoP;
    }
}

