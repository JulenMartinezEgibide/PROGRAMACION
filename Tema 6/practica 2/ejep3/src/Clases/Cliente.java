package Clases;

public class Cliente extends Persona {
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, int edad, String telefono) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    public Cliente(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String mostrar(){
        //return this.getNombre() + " " + this.getEdad() + " " + this.getTelefonoContacto();
        return super.mostrar() + " " + this.telefono;
    }
}
