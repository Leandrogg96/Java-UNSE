import java.util.Random;

public class Nodo {
    private Ticket ticket;
    private Nodo ps;

    public Nodo() {
        this.ticket = new Ticket();
        this.ps = null;
    }

    public int numSerieTicket() {
        return ticket.getNumSerie();
    }

    public Nodo getPs() {
        return ps;
    }

    public void setPs(Nodo ps) {
        this.ps = ps;
    }
}
