public class Autor {
    private String nombre;
    private String nacion;
    private Fecha fecha;

    public Autor() {

    }

    public Autor(String nombre, String nacion, Fecha fecha) {
        this.nombre = nombre;
        this.nacion = nacion;
        this.fecha = new Fecha();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacion() {
        return nacion;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
}
