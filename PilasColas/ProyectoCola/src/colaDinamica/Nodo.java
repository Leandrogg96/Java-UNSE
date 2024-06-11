
/**
 *
 * @author Kelly
 */
public class Nodo {
  private int dato;
    private Nodo ps;

    public Nodo() {
        this.dato = 0;
        this.ps = null;
    }
    
    
    public Nodo(int e){
        dato=e;
        ps=null;
                       }

    public int getDato() {
        return dato;
    }

    public Nodo getPs() {
        return ps;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setPs(Nodo ps) {
        this.ps = ps;
    }

    
    
  
}
