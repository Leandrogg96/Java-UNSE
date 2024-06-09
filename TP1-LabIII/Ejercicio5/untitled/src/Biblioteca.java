import java.util.Scanner;

public class Biblioteca {
    private CopiaLibro[] copias;

    public Biblioteca(int capacidad) {
        this.copias = new CopiaLibro[capacidad];
        copias[0] = new CopiaLibro(1, "Viaje2", "bolsillo2", 2012, 9, "Crimen", "Leandro", "Argentina", 1996, 21, "Junio");
        copias[1] = new CopiaLibro(0, "pedo", "bolsillo", 2011, 3, "Crimen", "Leandro", "Argentina", 1996, 21, "Junio");
        copias[2] = new CopiaLibro(3, "luna", "bolsillo", 2011, 3, "Crimen", "Leandro", "Argentina", 1996, 21, "Junio");
        copias[3] = new CopiaLibro(4, "magui", "bolsillo", 2011, 3, "Crimen", "Leandro", "Argentina", 1996, 21, "Junio");
        copias[4] = new CopiaLibro(2, "pia", "bolsillo", 2011, 3, "Crimen", "Leandro", "Argentina", 1996, 21, "Junio");
        copias[5] = new CopiaLibro(5, "lluu", "bolsillo", 2011, 3, "Crimen", "Leandro", "Argentina", 1996, 21, "Junio");
        copias[6] = new CopiaLibro(6, "tesa", "bolsillo", 2011, 3, "Crimen", "Leandro", "Argentina", 1996, 21, "Junio");
    }

    public void prestarCopia() {
        System.out.println("Ingresa el codigo del libro que deseas pedir: ");
        int codigo = validarEntero();
        prestarLibro(codigo);
    }

    public void prestarLibro(int cod) {
        for (CopiaLibro copia : copias) {
            if (copia != null && copia.getCod() == cod) {
                copia.prestarLibro();
                return;
            }
        }
        System.out.println("El libro no se encuentra en la biblioteca.");
    }

    public void devolverCopia() {
        System.out.println("Ingresa el codigo del libro que devuelves: ");
        int codigo = validarEntero();
        devolverLibro(codigo);
    }

    // Metodo para devolver un libro por codigo
    public void devolverLibro(int cod) {
        for (CopiaLibro copia : copias) {
            if (copia != null && copia.getCod() == cod) {
                copia.devolverLibro();
                return;
            }
        }
        System.out.println("El libro no se encuentra en la biblioteca.");
    }

    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca: ");
        for (CopiaLibro copia : copias) {
            if (copia != null) {
                System.out.println("- COD:(" + copia.getCod() + ") | Titulo: '" + copia.getCopiaDeLibro().getNombre() + "' | Autor: " + copia.getCopiaDeLibro().getAutor().getNombre() + " | Stock: " + copia.getCopiaDeLibro().getStock());
            }
        }
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
}
