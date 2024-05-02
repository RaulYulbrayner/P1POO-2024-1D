package co.edu.uniquindio.poo;

/**
 * Clase para modelar una cuenta corriente
 */
public class CuentaCorriente extends CuentaBancaria {

    private double limite_sobregiro;

    /**
     * Metodo constructor de la cuenta corriente
     * @param titular
     * @param numero_cuenta
     * @param saldo
     * @param cuenta_activa
     * @param limite_sobregiro
     */
    public CuentaCorriente(Titular titular, int numero_cuenta, double saldo, boolean cuenta_activa,
            double limite_sobregiro) {
        super(titular, numero_cuenta, saldo, cuenta_activa);
        this.limite_sobregiro = limite_sobregiro;
    }

    /**
     * Metodo que permite retirar de una cuenta corriente
     */
    public void retirar(double monto) {
        assert monto > 0 && monto <= getSaldo() + limite_sobregiro;
        double nuevoSaldo = getSaldo() - monto;
        setSaldo(nuevoSaldo);
        if (getSaldo() == 0) {
            setCuenta_activa(false);
        }
    }

}
