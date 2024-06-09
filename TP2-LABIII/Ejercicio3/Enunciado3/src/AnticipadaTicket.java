public class AnticipadaTicket extends TicketAbs{
    private int diaAnticipada;

    public AnticipadaTicket(int dia) {
        this.diaAnticipada = dia;
    }

    public AnticipadaTicket(double precio, int diasAdelanto) {
        this.precio = precio;
        this.diaAnticipada = diasAdelanto;

    }

    @Override
    double precioEntrada() {
        return 0;
    }

    @Override
    public double getPrecio() {
        if (this.diaAnticipada >= 10) {
            return diaAnticipada * 0.4;
        } else {
            return this.precio * 0.8;
        }
    }
}
