package co.edu.uniquindio.poo;

/**
 * Clase abstracta para modelar una cuenta bancaria
 */
public abstract class CuentaBancaria {

    private final int numero_cuenta;
    private double saldo;
    private boolean cuenta_activa = false;
    private final Titular titular;

    /**
     * Metodo constructor de la cuenta bancaria
     * @param titular:       El nombre del titular de la cuenta
     * @param numero_cuenta: El numero de la cuenta bancaria
     * @param saldo:         El saldo de la cuenta bancaria
     * @param cuenta_activa: Estado de la cuenta bancaria
     */
    public CuentaBancaria(Titular titular, int numero_cuenta, double saldo, boolean cuenta_activa) {
        assert numero_cuenta > 0;
        assert saldo > 0;
        assert titular != null;
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
        this.cuenta_activa = cuenta_activa;
        this.titular = titular;
    }

    /**
     * Metodo para depositar dinero en la cuenta bancaria
     * @param monto: El monto de la cuenta bancaria
     */
    public void depositar(double monto) {
        assert monto > 0;
        saldo += monto;
        cuenta_activa = true;
    }

    /**
     * Metodo abstracto para retirar dinero de la cuenta bancaria
     * @param monto
     */
    public abstract void retirar(double monto);

    /**
     * Metodo que obtiene el numero de la cuenta.
     * @return numero de la cuenta.
     */
    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    /**
     * Metodo que obtiene el saldo actual de la cuenta
     * @return El saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo que permite modificar el saldo de la cuenta
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo que obtiene el estado de la cuenta
     * @return cuenta_activa
     */
    public boolean getCuenta_activa() {
        return cuenta_activa;
    }

    /**
     * Metodo que permite modificar el estado de la cuenta
     * @param cuenta_activa
     */
    public void setCuenta_activa(boolean cuenta_activa) {
        this.cuenta_activa = cuenta_activa;
    }

    /**
     * Metodo que permite obtener el titular de la cuenta
     * @return titular
     */
    public Titular getTitular() {
        return titular;
    }

}
