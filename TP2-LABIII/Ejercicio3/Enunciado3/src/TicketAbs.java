abstract class TicketAbs {
    private int numSerie;
    protected double precio;

    public TicketAbs() {
    }

    abstract double precioEntrada();

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
