public class TarjetaCredito extends MetodoPago implements IVerificar {

    private int numTarjeta;

    public TarjetaCredito(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public TarjetaCredito(double monto, String tipoMoneda, int numTarjeta) {
        super(monto, tipoMoneda);
        this.numTarjeta = numTarjeta;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public boolean verificarFondos() {
        System.out.println("Verificando fondos...");
        return true;
    }

    @Override
    public void procesarPago() {

            System.out.println("Procesando pago con tarjeta de crédito...");

    }
}
