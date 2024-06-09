public class Fecha {
    private int anio;
    private int dia;
    private String mes;

    public Fecha() {
    }

    public Fecha(int anio, int dia, String mes) {
        this.anio = anio;
        this.dia = dia;
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
