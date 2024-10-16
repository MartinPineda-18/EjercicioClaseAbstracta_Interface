abstract class MetodoPago {

    protected double monto;
    protected String tipoMoneda;

    public MetodoPago() {
    }

    public MetodoPago(double monto, String tipoMoneda) {
        this.monto = monto;
        this.tipoMoneda = tipoMoneda;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public abstract void procesarPago();
}
