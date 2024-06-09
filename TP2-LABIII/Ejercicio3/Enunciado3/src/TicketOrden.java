import java.util.ArrayList;

public class TicketOrden {
    private ArrayList<Ticket> colection;

    public TicketOrden() {
        this.colection = new ArrayList<Ticket>();
    }

    public void agregar(Ticket x) {
        this.colection.add(x);
    }

    public double precioTotal() {
        double suma = 0;
        for (int i = 0; i < this.colection.size(); i++) {
            suma += colection.get(i).getPrecio();
        }
        return suma;
    }

}
