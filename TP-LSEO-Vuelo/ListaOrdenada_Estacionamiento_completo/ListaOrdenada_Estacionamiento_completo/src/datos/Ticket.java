/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Fecha.fecha;

/**
 *
 * @author Kelly
 */
public class Ticket {
    private int nro;
    private String ape;
    private int saldo;
    private Moto m;
    
    public Ticket() {
    }

    public Ticket(int nro, String ape, int saldo, Moto m) {
        this.nro = nro;
        this.ape = ape;
        this.saldo = saldo;
        this.m = m;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Moto getM() {
        return m;
    }

    public void setM(Moto m) {
        this.m = m;
    }
   
}
