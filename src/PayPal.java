public class PayPal extends MetodoPago implements IVerificar {

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    public PayPal(double monto, String tipoMoneda, String email) {
        super(monto, tipoMoneda);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean verificarFondos() {
        System.out.println("Verificando fondos...");
        return true;
    }

    @Override
    public void procesarPago() {

        System.out.println("Procesando pago con PayPal...");

    }
}
