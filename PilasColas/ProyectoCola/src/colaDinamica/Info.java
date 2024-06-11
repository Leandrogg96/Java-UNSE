/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaDinamica;

/**
 *
 * @author propietario
 */
public class Info {
    private int cant_p;
    private float monto;
    private char t;

    public Info(int cant_p, float monto, char t) {
        this.cant_p = cant_p;
        this.monto = monto;
        this.t = t;
    }

    public int getCant_p() {
        return cant_p;
    }

    public float getMonto() {
        return monto;
    }

    public char getT() {
        return t;
    }

    public void setCant_p(int cant_p) {
        this.cant_p = cant_p;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setT(char t) {
        this.t = t;
    }
    
}
