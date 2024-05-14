package co.edu.uniquindio.poo;

public class Empleado extends Persona implements IEmpleado {
    
    private double salario;

    public Empleado (String nombre, String apellidos, double salario){
        super(nombre, apellidos);
        this.salario=salario;
    }

    @Override
    public double getSalario(){
        return salario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nSalario: " + salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}