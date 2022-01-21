package Clases;

public class Empleado extends Persona {
    private int sueldoBruto;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public static void CalcularSalarioNeto(){}

    @Override
    public String mostrar(){
        // return nombre + " " + edad + " " + sueldoBruto;
        return this.getNombre() + " " + this.getEdad() + " " + this.getSueldoBruto();
    }
}
