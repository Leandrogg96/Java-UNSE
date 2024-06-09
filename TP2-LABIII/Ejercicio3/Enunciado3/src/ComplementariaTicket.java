public class ComplementariaTicket extends PrecioFijoTicket{ //clase hija de la claseComplementariaTicket??? Si, porque el precio se mantiene FIJO!!
    private boolean entradaGratuita;
    private int cantidadG;

    public ComplementariaTicket(double precio) {
        super(precio);
    }

    public ComplementariaTicket(float precio) {
        super(precio);
    }

    @Override
     double precioEntrada() {
        return 0;
    }
}
