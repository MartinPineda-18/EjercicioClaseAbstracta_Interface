public class Main {
    public static void main(String[] args) {

        //Juan Martin Pineda Rubiano

        MetodoPago pagoTarjeta = new TarjetaCredito(300000, "COP", 9040876);
        pagoTarjeta.procesarPago();

        MetodoPago pagoPayPal = new PayPal(5000, "USD", "juanperez@paypal.com");
        pagoPayPal.procesarPago();

    }
}