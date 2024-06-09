abstract class PrecioFijoTicket extends TicketAbs {
    private double precio;

    public PrecioFijoTicket(double precio) {
        this.precio = precio;
    }
    public PrecioFijoTicket(float precio) {
        this.precio = precio;
    }

    @Override
    double precioEntrada() {
        return precio;
    }

}
