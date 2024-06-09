
package clase03052024;

import consulta24042024.GestorEntradaConsola;

/**
 *
 * @author char.ly
 */
public class Vuelo {
    
    private int codigoVuelo;
    private String lugarDestino;
    private String fechaVuelo;
    private String hora;
    private int cantidadLugares;
    
    /**
     * Carga los datos de una instancia de clase
     */
    public void cargarDatos(){
        cargarCodigoVuelo();
        cargarLugarDestino();
        // Completar...
    }
    
    public void cargarCodigoVuelo(){
        System.out.println("Codigo vuelo: ");
        codigoVuelo = GestorEntradaConsola.leerEntero();
    }
    
    public void cargarLugarDestino(){
        System.out.println("Lugar destino: ");
        lugarDestino = GestorEntradaConsola.leerString();
    }
    
    public void mostrarDatos(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Vuelo{" + "codigoVuelo=" + codigoVuelo + ", lugarDestino=" + lugarDestino + ", fechaVuelo=" + fechaVuelo + ", hora=" + hora + ", cantidadLugares=" + cantidadLugares + '}';
    }

    public int getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(int codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getCantidadLugares() {
        return cantidadLugares;
    }

    public void setCantidadLugares(int cantidadLugares) {
        this.cantidadLugares = cantidadLugares;
    }
    
    
    
}
