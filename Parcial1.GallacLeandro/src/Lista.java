public class Lista {
    protected Nodo list;

    public Nodo inicio() {
        return list;
    }

    public boolean listaVacia() {
        return (list == null);
    }

    public void insertarPri(Nodo x) {
        if (list == null) {
            list = x;
        } else {
            x.setPs(list);
            list = x;
        }
    }

    public Nodo quitar(Nodo p, Nodo ant) {
        Nodo x = p;

        if (p == list) {
            list = p.getPs();
        } else {
            ant.setPs(p.getPs());

        }
        return x;
    }

    public Nodo eliminar(int elem) {
        Nodo x = null;
        Nodo p = list;
        Nodo ant = null;
        if(list == null)
            return x;
        boolean band = false;
        while (p != null && !band) {
            if (p.getTar().getNumero() == elem) {
                band = true;
            } else {
                ant = p;
                p = p.getPs();

            }
        }
        if (band == true) {
            quitar(p, ant);
            x = p;
        }
        return x;
    }

    public void visualizar() {
        Nodo p = inicio();
        while (p != null) {
            p.mostrarNodo();
            p = p.getPs();
        }
    }

}
