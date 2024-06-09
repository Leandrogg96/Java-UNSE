import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class RadioTaxi {
    private int movil;
    private String nom;
    private String ape;
    private char tipoSer;
    private String patente;

    public RadioTaxi() {
        leerDatosRT();
    }

    public void mostrarRT(){
        System.out.println("- Numero de movil: " + getMovil());
        System.out.println("- Apellido y nombre: " + getApe() + " " + getNom());
        System.out.println("- Patente: " + getPatente());
        System.out.println("- Tipo de servicio: " + getTipoSer() + "\n");
    }

    public void leerDatosRT(){

        System.out.println("Ingresa el numero de tarjeta: ");
        this.movil = validarEntero();

        System.out.println("Ingresa el nombre del titular: ");
        this.nom = validarString();

        System.out.println("Ingresa el apellido del titular: ");
        this.ape = validarString();

        System.out.println("Ingresa elm: ");
        this.tipoSer = validarChar();

        System.out.println("Ingresa la patente del vehiculo: ");
        this.patente = validarString();
    }

    public String validarString() {
        Scanner lectura = new Scanner(System.in);
        while (!lectura.hasNextLine()) {
            String input = lectura.next();
            System.out.println(input + " no es una cadena de caracteres. Por ingresa valores validos: ");
        }
        return lectura.nextLine();
    }

    public void setear() {
        System.out.println("Ingresa un valor para el numero de movil: ");
        setMovil(validarEntero());
        System.out.println("Ingresa el apellido: ");
        setApe(validarString());
        System.out.println("Ingresa el nombre: ");
        setNom(validarString());
        System.out.println("Ingresa un valor para la patente: ");
        setPatente(validarString());
        System.out.println("Indica el tipo de servicio (caracter): ");
        setTipoSer(validarChar());

    }

    public int validarEntero() {
        Scanner lectura = new Scanner(System.in);
        while (!lectura.hasNextInt()) {
            String input = lectura.next();
            System.out.println(input + " no es un numero entero. Por favor, ingrese un numero entero.");
            System.out.print("Ingrese un numero entero: ");
        }
        return lectura.nextInt();
    }

    public char validarChar() {
        Scanner lectura = new Scanner(System.in);
        char c;

        while (true) {
            System.out.print("Ingrese un unico caracter: ");
            String input = lectura.nextLine();

            if (input.length() == 1) {
                c = input.charAt(0);
                if (Character.isLetter(c)) {
                    return c;
                }
            }
            System.out.println("Entrada invalida. Por favor, ingrese un unico caracter.");
        }
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public char getTipoSer() {
        return tipoSer;
    }

    public void setTipoSer(char tipoSer) {
        this.tipoSer = tipoSer;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
