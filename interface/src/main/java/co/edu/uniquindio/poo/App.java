package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        ClienteEmpleado clienteEmpleado;

        clienteEmpleado= new ClienteEmpleado("", "", "", 0);
        clienteEmpleado.setNombre("Ana");
        clienteEmpleado.setApellidos("Agudelo");
        clienteEmpleado.setTelefono("45678");
        clienteEmpleado.setSalario(2349082);
        JOptionPane.showMessageDialog(null, clienteEmpleado);
    }
}
