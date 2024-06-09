public class CopiaLibro {
    private int cod;
    private Cliente posesion;
    private Libro copiaDeLibro;
    private EstadoCopia estado;
    private int numLibSt;

    public CopiaLibro(int codigo, String nom, String edi, int anio, int stk, String typ, String nomA, String nac, int anioA, int dia, String mes) {
        this.cod = codigo;
        this.copiaDeLibro = new Libro(nom, edi, anio, stk, typ, new Autor(nomA, nac, new Fecha(anioA, dia, mes)));
        this.estado = new EstadoCopia();
    }

    public void prestarLibro() {
        if (estado.isEnBiblioteca() && !estado.isEnPrestamo() && !estado.isEnReparacion()) {
            estado.setEnPrestamo(true);
            System.out.println("Prestamo exitoso. Libro '" + getCopiaDeLibro().getNombre() + "' prestado.");
        } else if (estado.isEnBiblioteca() && estado.isEnPrestamo() && !estado.isEnReparacion()) {
            System.out.println("El libro que solicitaste fue prestado.");
        } else if (estado.isEnBiblioteca() && !estado.isEnPrestamo() && estado.isEnReparacion()) {
            System.out.println("El libro que solicitaste esta en reparacion.");
        } else {
            System.out.println("El libro no se encuentra en la biblioteca.");
        }
    }

    public void devolverLibro() {
        estado.setEnPrestamo(false);
        System.out.println("Libro '" + copiaDeLibro.getNombre() + "' devuelto.");
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Libro getCopiaDeLibro() {
        return copiaDeLibro;
    }

    public void setCopiaDeLibro(Libro copiaDeLibro) {
        this.copiaDeLibro = copiaDeLibro;
    }

    public Cliente getPosesion() {
        return posesion;
    }

    public void setPosesion(Cliente posesion) {
        this.posesion = posesion;
    }

    public EstadoCopia getEstado() {
        return estado;
    }

    public void setEstado(EstadoCopia estado) {
        this.estado = estado;
    }
}
