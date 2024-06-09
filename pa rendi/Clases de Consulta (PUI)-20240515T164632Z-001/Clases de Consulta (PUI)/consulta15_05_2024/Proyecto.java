package consulta15_05_2024;

/**
 *
 * @author char.ly
 */
public class Proyecto implements Comparable {

    private int codigo;
    private String denominacion;
    private char estado; // E, T, S
    private char categoria; // A, B, C
    private int duracion; // en meses
    private float montoInversion;

    public Proyecto() {
    }

    public Proyecto(int codigo, String denominacion, char estado, char categoria, int duracion, float montoInversion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.estado = estado;
        this.categoria = categoria;
        this.duracion = duracion;
        this.montoInversion = montoInversion;
    }

    @Override
    public int compareTo(Object o) {
        Proyecto p = (Proyecto) o;
        return Integer.compare(this.codigo, p.codigo);
    }

    @Override
    public String toString() {
        return "Proyecto{" + "codigo=" + codigo + ", denominacion=" + denominacion + ", estado=" + estado + ", categoria=" + categoria + ", duracion=" + duracion + ", montoInversion=" + montoInversion + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public float getMontoInversion() {
        return montoInversion;
    }

    public void setMontoInversion(float montoInversion) {
        this.montoInversion = montoInversion;
    }

}
