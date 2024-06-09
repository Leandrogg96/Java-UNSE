/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import listaordenada.*;
import entradaDatos.EntradaSalida;

/**
 *
 * @author Kelly Zarco
 */
public class Cliente {

    private int dni;
    private String ape_n;
    private int monto;
    private Moto m=new Moto();

    public Cliente() {
    }

    public Cliente(int dni, String titulo, int monto, Moto x) {
        this.dni = dni;
        this.ape_n = titulo;
        this.monto = monto;
        this.m = x;

    }

    public int getDni() {
        return dni;
    }

    public String getApe_n() {
        return ape_n;
    }

    public int getMonto() {
        return monto;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setApe_n(String titulo) {
        this.ape_n = titulo;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Moto getM() {
        return m;
    }

    public void setM(Moto m) {
        this.m = m;
    }

    public void ingresarDatosCliente() {
        EntradaSalida.mostrarMensaje("Ingrese documento (0 p/cancelar): ");

        setDni(EntradaSalida.leerInt());
        EntradaSalida.mostrarMensaje("Ingrese apellido y nombre: ");

        setApe_n(EntradaSalida.leerString());
        EntradaSalida.mostrarMensaje("Ingrese monto: ");
        setMonto(EntradaSalida.leerInt());
      m.ingresarDatosMoto();
      
      
    }

    public String toString() {
        return "documento " + dni + " apellido : " + ape_n + " monto  " + monto;
    }

}
