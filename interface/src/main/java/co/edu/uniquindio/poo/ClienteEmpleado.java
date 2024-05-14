package co.edu.uniquindio.poo;

public class ClienteEmpleado extends Cliente implements IEmpleado{
    
    private double salario;

    public ClienteEmpleado(String nombre, String apellidos, String telefono, double salario) {
        super(nombre, apellidos, telefono);
        this.salario= salario;
    }    

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSalario: $"+getSalario();
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}