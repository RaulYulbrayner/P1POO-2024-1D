package co.edu.uniquindio.poo;

/**
 * Clase para modelar una cuenta de ahorros
 */
public class CuentaAhorros extends CuentaBancaria {

    private double tasa_interes;

    /**
     * Metodo constructor de la cuenta de ahorros
     * @param titular
     * @param numero_cuenta
     * @param saldo
     * @param cuenta_activa
     * @param tasa_interes
     */
    public CuentaAhorros(Titular titular, int numero_cuenta, double saldo, boolean cuenta_activa, double tasa_interes) {
        super(titular, numero_cuenta, saldo, cuenta_activa);
        assert tasa_interes >= 0;
        this.tasa_interes = tasa_interes;
    }

    /**
     * Metodo que permite retirar de una cuenta de ahorros
     */
    @Override
    public void retirar(double monto) {
        assert monto > 0 && monto <= getSaldo();
        double nuevoSaldo = getSaldo() - monto;
        setSaldo(nuevoSaldo);
        if (getSaldo() == 0) {
            setCuenta_activa(false);
        }
    }

}
