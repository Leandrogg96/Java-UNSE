public class ListaOrdenada extends Lista {

    public ListaOrdenada() {
        super();
    }

    public void buscarElemento(int x){
        Nodo ant = null;
        Nodo p = inicio();

        if (listaVacia()){
            System.out.println("La lista esta vacia");;
        } else {
            while (p != null){
                if (p.getTar().getNumero() == x) {
                    list.getTar().setearMonto();
                } else {
                    ant = p;
                    p = p.getPs();
                }
            }
        }
    }


    public void insertarMedio(Nodo p, Nodo ant, Nodo x) {
        x.setPs(p);
        ant.setPs(x);
    }

    public void insertarFin(Nodo ant, Nodo p, Nodo x) {
        if (p == null) {
            x.setPs(null);
            ant.setPs(x);
        }
    }

    public void insertar(Nodo entrada) {
        Nodo p = inicio();
        Nodo ant = null;
        int b = 0;
        boolean e = false;
        while (p != null && b == 0) {
            if (p.getTar().getNumero() == entrada.getTar().getNumero()) {
                p = null;
                e = true;
            } else {
                if (p.getTar().getNumero() > entrada.getTar().getNumero()) {
                    b = 1;
                } else {
                    ant = p;
                    p = p.getPs();
                }
            }
        }

        if (e) {
            System.out.println("Y existe una tarjeta con ese numero!");
        }
        else{
            if (b == 1) {
                if (p == list) {
                    insertarPri(entrada);
                } else {
                    insertarMedio(p, ant, entrada);
                }
            } else {
                if (ant == null) {
                    list = entrada;
                } else {
                    insertarFin(ant, p, entrada);
                }
            }
        }
    }

    @Override
    public Nodo quitar(Nodo p, Nodo ant) {
        Nodo x = p;

        if (p == inicio()) {
            list = p.getPs();
        } else {
            ant.setPs(p.getPs());
        }
        return x;
    }

    @Override
    public Nodo eliminar(int elem) {
        Nodo x = null;
        Nodo p = inicio();
        Nodo ant = null;
        if (listaVacia()) {
            System.out.println("Lista Vacía!!!");
            return x;
        }
        boolean band = false;
        while (p != null && !band) {
            if (p.getTar().getNumero() >= elem) {
                if (p.getTar().getNumero() == elem) {
                    x = quitar(p, ant);
                    band = true;
                } else {
                    p = null;
                }
            } else {
                ant = p;
                p = p.getPs();
            }
        }
        if (band == true) {
            System.out.println("Tarjeta eliminada!");
        } else {
            System.out.println("Tarjeta inexistente!!!");
        }
        return x;
    }
}

