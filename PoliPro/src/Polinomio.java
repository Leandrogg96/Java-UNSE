import java.util.Scanner;
public class Polinomio {
    private Nodo Poli;

    public Polinomio() {
        this.Poli = null;
    }

    public Nodo inicioPoli() {
        return Poli;
    }

    public void visualizar() {
        Nodo p = inicioPoli();
        System.out.print("Polinomio: ");
        while (p != null) {
            p.mostrarNodo();
            p = p.getPs();
            if (p != null) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }

    public void insertarPrimero(Nodo elem){
        if (inicioPoli() == null){
            Poli = elem;
        } else {
            elem.setPs(inicioPoli());
            Poli = elem;
        }
    }

    public void cargarPolinomio() {
        Scanner scanner = new Scanner(System.in);
        char bandera = 's';
        do {
            System.out.print("Ingrese el coeficiente del monomio: ");
            int coeficiente = validarEntero();

            System.out.print("Ingrese el exponente del monomio: ");
            int exponente = validarNatural();

            Monomio monomio = new Monomio(coeficiente, exponente);
            Nodo nodo = new Nodo();
            nodo.setTermino(monomio);
            insertarPrimero(nodo);

            System.out.println("Desea cargar otro termino al polinomio? \n En caso de que si, presione 's'");
            bandera = validarChar();
        } while (bandera == 's' || bandera == 'S') ;
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

    public int validarNatural() {
        Scanner lectura = new Scanner(System.in);
        while (true) {
            if (!lectura.hasNextInt()) {
                String input = lectura.next();
                System.out.println(input + " no es un numero natural. Por favor, ingrese un numero natural.");
                System.out.print("Ingrese un numero natural: ");
            } else {
                int numero = lectura.nextInt();
                if (numero <= 0) {
                    System.out.println(numero + " no es un numero natural. Por favor, ingrese un numero natural positivo.");
                    System.out.print("Ingrese un numero natural: ");
                } else {
                    return numero;
                }
            }
        }
    }

    public void ordenar() {
        if (inicioPoli() == null || inicioPoli().getPs() == null) {
            // Si la lista está vacía o tiene un solo elemento, ya está ordenada.
            return;
        }

        boolean intercambio;
        do {
            intercambio = false;
            Nodo anterior = null;
            Nodo actual = inicioPoli();
            Nodo siguiente = actual.getPs();
            while (siguiente != null) {
                if (actual.getTermino().getGrado() > siguiente.getTermino().getGrado()) {
                    // Si los términos no están en orden, los intercambiamos.
                    if (anterior == null) {
                        // Si actual es el primer nodo, lo movemos al principio.
                        this.Poli = siguiente;
                    } else {
                        anterior.setPs(siguiente);
                    }
                    actual.setPs(siguiente.getPs());
                    siguiente.setPs(actual);
                    anterior = siguiente;
                    intercambio = true;
                } else {
                    anterior = actual;
                    actual = siguiente;
                }
                siguiente = actual.getPs();
            }
        } while (intercambio);
    }

    public Nodo getPoli() {
        return Poli;
    }

    public void setPoli(Nodo poli) {
        Poli = poli;
    }

}
