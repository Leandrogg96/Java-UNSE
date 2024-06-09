public class AppPoli {
    private Polinomio Poli;

    public AppPoli() {
    }

    public void resultado() {
        System.out.println("El polimonio resultante es: ");
        sumarPolinomios();
    }
    public Polinomio sumarPolinomios() {
        Polinomio poli1 = new Polinomio();
        Polinomio poli2 = new Polinomio();
        System.out.println("Ingresa los terminos del primero polinomio: ");
        poli1.cargarPolinomio();
        poli1.ordenar();
        poli1.visualizar();
        System.out.println("Ingresa los terminos del segundo polinomio: ");
        poli2.cargarPolinomio();
        poli2.ordenar();
        poli2.visualizar();
        Polinomio poli3 = sumar(poli1, poli2);
        poli3.ordenar();
        System.out.println("Resultado: ");
        poli3.visualizar();
        return poli3;
    }

    public Polinomio sumar(Polinomio p1, Polinomio p2) {
        Polinomio resultado = new Polinomio();
        Nodo actualP1 = p1.inicioPoli();
        Nodo actualP2 = p2.inicioPoli();

        while (actualP1 != null || actualP2 != null) {
            if (actualP1 == null) {
                // Si polinomio1 ha llegado al final, agregamos los terminos de polinomio2 al resultado
                resultado.insertarPrimero(new Nodo(actualP2.getTermino()));
                actualP2 = actualP2.getPs();
            } else if (actualP2 == null) {
                // Si polinomio2 ha llegado al final, agregamos los terminos de polinomio1 al resultado
                resultado.insertarPrimero(new Nodo(actualP1.getTermino()));
                actualP1 = actualP1.getPs();
            } else {
                // Ambos polinomios tienen terminos disponibles
                Monomio monomioSuma = new Monomio();
                int gradoP1 = actualP1.getTermino().getGrado();
                int gradoP2 = actualP2.getTermino().getGrado();

                if (gradoP1 == gradoP2) {
                    // Los grados son iguales, sumar coeficientes
                    int coeficienteSuma = actualP1.getTermino().getCoeficiente() + actualP2.getTermino().getCoeficiente();
                    monomioSuma.unirMononomio(coeficienteSuma, gradoP1);
                    resultado.insertarPrimero(new Nodo(monomioSuma));
                    actualP1 = actualP1.getPs();
                    actualP2 = actualP2.getPs();
                } else if (gradoP1 < gradoP2) {
                    // Grado de polinomio1 es menor, agregar monomio de polinomio1 al resultado
                    resultado.insertarPrimero(new Nodo(actualP1.getTermino()));
                    actualP1 = actualP1.getPs();
                } else {
                    // Grado de polinomi2 es menor, agregar monomio de polinomio2 al resultado
                    resultado.insertarPrimero(new Nodo(actualP2.getTermino()));
                    actualP2 = actualP2.getPs();
                }
            }
        }
        return resultado;
    }

    public Polinomio agregarPolinomio() {
        this.Poli = new Polinomio();
        return this.Poli;
    }

    public void mostrarPoli() {
        this.Poli.visualizar();
    }

}
