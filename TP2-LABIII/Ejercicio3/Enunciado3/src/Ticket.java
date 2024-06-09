import java.util.Random;

public class Ticket {
    private int numSerie;
    private float precio;

    public Ticket() {
        this.numSerie = generarNumeroAleatorio();
        this.precio = 0;
    }

    private int generarNumeroAleatorio() {
        int minimo = 1;
        int maximo = 99999;

        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }

    public String toString(){
        return String.valueOf(getNumSerie());
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
