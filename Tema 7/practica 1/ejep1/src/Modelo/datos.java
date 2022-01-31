package Modelo;


public class datos {
    private String gettFApellido;
    private String gettFDni;
    private String gettFNombre;

    public datos(String gettFApellido, String gettFDni, String gettFNombre) {
        this.gettFApellido = gettFApellido;
        this.gettFDni = gettFDni;
        this.gettFNombre = gettFNombre;
    }

    public String getGettFApellido() {
        return gettFApellido;
    }

    public void setGettFApellido(String gettFApellido) {
        this.gettFApellido = gettFApellido;
    }

    public String getGettFDni() {
        return gettFDni;
    }

    public void setGettFDni(String gettFDni) {
        this.gettFDni = gettFDni;
    }

    public String getGettFNombre() {
        return gettFNombre;
    }

    public void setGettFNombre(String gettFNombre) {
        this.gettFNombre = gettFNombre;
    }
}
