import java.util.Scanner;

public class Monomio {
    private int coeficiente;
    private int grado;
    private char var; // En caso de trabajar siempre con la misma variable, se puede interpretar como constante


    public Monomio(int coeficiente, int grado) {
        this.coeficiente = coeficiente;
        this.grado = grado;
        this.var = 'x';
    }

    public Monomio() {

    }

    public void mostrarMono() {
        System.out.print("" + getCoeficiente() + getVar() + "^" + getGrado());
    }

    public void unirMononomio(int coeficiente, int grado) {
        setCoeficiente(coeficiente);
        setGrado(grado);
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public char getVar() {
        return var;
    }

    public void setVar(char var) {
        this.var = var;
    }
}


