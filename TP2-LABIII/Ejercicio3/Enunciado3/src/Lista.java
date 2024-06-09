public class Lista {
    private Nodo list;

    public Lista() {
        list = null;
    }

    public Nodo inicioLista() {
        return list;
    }

    public void generarTicket() {
        Nodo nodoX;
        do {
            nodoX = new Nodo();
        } while (!buscarElem(nodoX));
        insertarPrimero(nodoX);
    }

    public void insertarPrimero(Nodo elem){
        if (inicioLista() == null){
            list = elem;
        } else {
            elem.setPs(inicioLista());
            list = elem;
        }
    }


    public boolean buscarElem(Nodo q){
        Nodo x = null;
        Nodo p = list;
        Nodo ant = null;
        if(list == null)
            return false;
        while (p != null) {
            if (p.numSerieTicket() == q.numSerieTicket()) {
                return true;
            } else {
                ant = p;
                p = p.getPs();
            }
        }
        return false;
    }
}
