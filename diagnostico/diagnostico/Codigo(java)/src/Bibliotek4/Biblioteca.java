package Bibliotek4;

public class Biblioteca {

    // Atributos
    private Libro[] libros;

    public Biblioteca() {

    }

    // Metodo constructor
    public Biblioteca(int capacidad) {
        this.libros = new Libro[capacidad];
    }

    // Metodo para agregar un libro
    public void agregarLibro(Libro libro) {

        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getCod() == libro.getCod()) {
                System.out.println("El libro se encuentra en la biblioteca. Se incrementara el stock.");
                libros[i].setNumLibSt(libros[i].getNumLibSt() + libro.getNumLibSt());

                return;
            }

            for (int j = 0; j < libros.length; j++) {
                if (libros[j] == null) {
                    libros[j] = libro;
                    System.out.println("El libro '" + libro.getTitulo() + "' se agrego correctamente");

                    return;
                }
            }
        }
        System.out.println("No es posible agregar el libro. La biblioteca esta llena!");
    }

    // Metodo para prestar un libro por codigo
    public void prestarLibro(int cod) {
        for (Libro libro : libros) {
            if (libro != null && libro.getCod() == cod) {
                libro.prestarLibro();
                return;
            }
        }
        System.out.println("El libro no se encuentra en la biblioteca.");
    }

    // Metodo para devolver un libro por codigo
    public void devolverLibro(int cod) {
        for (Libro libro : libros) {
            if (libro != null && libro.getCod() == cod) {
                libro.devolverLibro();
                return;
            }
        }
        System.out.println("El libro no se encuentra en la biblioteca.");
    }

    // Metodo para eliminar un libro de la biblioteca por codigo
    public void eliminarLibro(int cod) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getCod() == cod) {
                System.out.println("Libro eliminado de la biblioteca: " + libros[i].getTitulo());
                libros[i] = null;
                return;
            }
        }
        System.out.println("El libro no se encuentra en la biblioteca.");
    }

    // Metodo para mostrar los libros en la biblioteca
    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca: ");
        for (Libro libro : libros) {
            if (libro != null) {
                System.out.println("- COD:(" + libro.getCod() + ") | Titulo: '" + libro.getTitulo() + "' | Autor: " + libro.getAutor() + " | Stock: " + libro.getNumLibSt());
            }
        }
    }
}