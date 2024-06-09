import java.util.Scanner;

public class Lista {
    private Nodo list;

    public Lista() {
        this.list = null;
    }

    public Nodo inicioLista() {
        return list;
    }

    public void insertarPrimero(Nodo elem){
        if (inicioLista() == null){
            list = elem;
        } else {
            elem.setPs(inicioLista());
            list = elem;
        }
    }

    public Nodo buscarElemento(int x){
        Nodo retorno = null;
        Nodo ant = null;
        Nodo p = inicioLista();

        if (listaVacia()){
            return retorno;
        } else {
            while (p != null){
                if (p.getRt().getMovil() == x){
                    retorno = p;
                    return retorno;
                } else {
                    ant = p;
                    p = p.getPs();
                }
            }
        }
        return retorno;
    }

    public Nodo eliminar(int elem) {
        Nodo aux = null;
        Nodo p = list;
        Nodo ant = null;
        if(list == null)
            return aux;
        boolean band = false;
        while (p != null && !band) {
            if (p.getRt().getMovil() == elem) {
                band = true;
            } else {
                ant = p;
                p = p.getPs();

            }
        }
        if (band == true) {
            quitar(p, ant);
            aux = p;
        } else {
            System.out.println("El movil no existe en la lista");
        }
        return aux;
    }

    public Nodo quitar(Nodo p, Nodo ant) {
        Nodo aux = p;

        if (p == list) {
            list = p.getPs();
        } else {
            ant.setPs(p.getPs());

        }
        return aux;
    }

    public boolean listaVacia() {
        return (list == null);
    }

    public void visualizar() {
        Nodo p = inicioLista();
        while (p != null) {
            p.mostrarNodo();
            p = p.getPs();
        }
    }

    public void modificar() {
        Scanner ingreso = new Scanner(System.in);
        int numMovil;
        numMovil = ingreso.nextInt();

        if (buscarElemento(numMovil) != null) {
           buscarElemento(numMovil).setearElemento();
        } else {
            System.out.println("El elemento no existe en la lista.");
        }
    }

    public Nodo getList() {
        return list;
    }

    public void setList(Nodo list) {
        list = list;
    }

}
