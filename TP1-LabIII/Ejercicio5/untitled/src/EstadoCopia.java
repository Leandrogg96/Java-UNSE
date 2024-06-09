public class EstadoCopia {
    private boolean enBiblioteca;
    private boolean enReparacion;
    private boolean enPrestamo;

    public EstadoCopia() {
        this.enBiblioteca = true;
        this.enPrestamo = false;
        this.enReparacion = false;
    }

    public boolean isEnBiblioteca() {
        return enBiblioteca;
    }

    public void setEnBiblioteca(boolean enBiblioteca) {
        this.enBiblioteca = enBiblioteca;
    }

    public boolean isEnReparacion() {
        return enReparacion;
    }

    public void setEnReparacion(boolean enReparacion) {
        this.enReparacion = enReparacion;
    }

    public boolean isEnPrestamo() {
        return enPrestamo;
    }

    public void setEnPrestamo(boolean enPrestamo) {
        this.enPrestamo = enPrestamo;
    }
}
