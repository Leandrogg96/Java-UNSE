public class TaquillaTicket extends PrecioFijoTicket{
    private boolean entradaTaquilla;
    private int cantidadT;

    public TaquillaTicket(double precio) {
        super(precio);
    }

    public TaquillaTicket(float precio) {
        super(precio);
    }


    @Override
    double precioEntrada() {
        return 0;
    }
}
