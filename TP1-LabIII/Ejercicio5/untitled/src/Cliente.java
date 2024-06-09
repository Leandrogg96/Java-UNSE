public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private Fecha fechaPrest;
    private int librosPosesion = 0;

    public Cliente() {

    }

    public Cliente(String nombre, String apellido, int dni, int anio, int dia, String mes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaPrest = new Fecha(anio, dia, mes);
        this.librosPosesion = 0;
    }

    public void prestamoLibro() {
        int aux = getLibrosPosesion();
        setLibrosPosesion(aux+1);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Fecha getFechaPrest() {
        return fechaPrest;
    }

    public void setFechaPrest(Fecha fechaPrest) {
        this.fechaPrest = fechaPrest;
    }

    public int getLibrosPosesion() {
        return librosPosesion;
    }

    public void setLibrosPosesion(int librosPosesion) {
        this.librosPosesion = librosPosesion;
    }
}
