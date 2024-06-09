package listas_pilas_colas;

/**
 *
 * @author char.ly
 */
public class PruebaLPC {

    public static void main(String[] args) {

        Persona p1 = new Persona(4224, 24, "Carlos", 'M', 1.72f, true);
        Persona p2 = new Persona(4519, 19, "Guille", 'M', 1.76f, false);
        Persona p3 = new Persona(5112, 12, "Clara", 'F', 1.43f, false);
        Persona p4 = new Persona(5113, 12, "Lucia", 'F', 1.40f, false);
        //  ** PRUEBA LSE**
//        ListaSimple lse = new ListaSimple();
//        lse.insertarFrente(55);
//        lse.insertarFrente(43);
//        lse.insertarFrente(77);
//        lse.insertarFrente(48);
//        lse.insertarFrente(22);
//        lse.mostrar();
//
//        if (lse.buscar(55) != null) {
//            System.out.println("Elemento encontrado!");
//        } else {
//            System.out.println("Elemento inexistente!");
//        }
//
//        if (lse.buscar(88) != null) {
//            System.out.println("Elemento encontrado!");
//        } else {
//            System.out.println("Elemento inexistente!");
//        }
//        lse.buscar(78);
//        lse.eliminar(43);
//        System.out.println("Lista con el 43 eliminado: ");
//        lse.mostrar();
//        ListaSimple listaPersonas = new ListaSimple();
//        listaPersonas.insertarFrente(new Persona(4224, 24, "Carlos", 'M', 1.72f, true));
//        listaPersonas.insertarFrente(new Persona(4519, 19, "Guille", 'M', 1.76f, false));
//        listaPersonas.insertarFrente(new Persona(5112, 12, "Clara", 'F', 1.43f, false));
//        listaPersonas.insertarFrente(new Persona(5113, 12, "Lucia", 'F', 1.40f, false));
//        listaPersonas.mostrar();
//
//        Persona buscado = new Persona(4224, 24, null, ' ', 0, false);
//        NodoSimple b = listaPersonas.buscar(buscado);
//        if (b == null) {
//            System.out.println("Elemento inexistente!");
//        } else {
//            System.out.println("Encontrado: " + b.getDato().toString());
//        }
//
//        listaPersonas.eliminar(new Persona(5113, 12, null, ' ', 0, true));
//        System.out.println("Lista nueva con una eliminacion:");
//        listaPersonas.mostrar();

        // **  PRUEBA LSEO **
//        ListaSimpleOrdenada lseo = new ListaSimpleOrdenada();
//        lseo.insertar(77);
//        lseo.insertar(43);
//        lseo.insertar(55);
//        lseo.insertar(48);
//        lseo.insertar(22);
//        lseo.insertar(80);
//        
//        lseo.mostrar();
//        lseo.eliminar(55);
//        System.out.println("Lista con el 55 eliminado");
//        lseo.mostrar();

          ListaSimpleOrdenada lseoPersonas = new ListaSimpleOrdenada();
          lseoPersonas.insertar(p1);
          lseoPersonas.insertar(p2);
          lseoPersonas.insertar(p3);
          lseoPersonas.insertar(p4);
          lseoPersonas.mostrar();
          
        // ** PRUEBA PILA **
//        Pila pila = new Pila();
//        pila.apilar(77);
//        pila.apilar(43);
//        pila.apilar(48);
//        pila.apilar(22);
//        pila.apilar(80);
//        System.out.println("Muestra desde el ultimo elemento insertado:");
//        pila.mostrar();
//        System.out.println("Muestra desde el primer elemento insertado:");
//        pila.mostrarInversamente();
        // ** PRUEBA COLA **
//        Cola cola = new Cola();
//        cola.insertar(77);
//        cola.insertar(43);
//        cola.insertar(48);
//        cola.insertar(22);
//        cola.insertar(80);
//        cola.mostrar();
    }

}

/**
 * Clase de prueba para listas, pilas y colas.
 *
 * @author char.ly
 */
class Persona implements Comparable {

    long dni;
    int edad;
    String nombre;
    char genero;
    float altura;
    boolean trabaja;

    public Persona(long dni, int edad, String nombre, char genero, float altura, boolean trabaja) {
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
        this.altura = altura;
        this.trabaja = trabaja;
    }

    // Comparacion por dni
    @Override
    public int compareTo(Object o) {
        Persona p = (Persona) o;
        return Long.compare(this.dni, p.dni);
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", edad=" + edad + ", nombre=" + nombre + ", genero=" + genero + ", altura=" + altura + ", trabaja=" + trabaja + '}';
    }

}
