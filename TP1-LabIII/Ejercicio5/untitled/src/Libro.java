public class Libro {
    private String nombre;
    private String editorial;
    private int anio;
    private int stock;
    private String tipo;
    private Autor autor;


    public Libro() {

    }

    public Libro(String nombre, String editorial, int anio, int stock, String tipo, Autor autor) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.anio = anio;
        this.stock = stock;
        this.tipo = tipo;
        this.autor = new Autor();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

}
