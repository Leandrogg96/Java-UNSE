package Bibliotek4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crea un bibliteca de capacidad 99:

        Biblioteca bibliotek4 = new Biblioteca(99);

        menu(bibliotek4);


    }

        public static void menu(Biblioteca bibliotek4) {
            Scanner opc = new Scanner(System.in);

            int opcion;

            do {
                System.out.println("\n==== Menu ====");
                System.out.println("1. Agregar un libro");
                System.out.println("2. Eliminar un libro");
                System.out.println("3. Prestar un libro");
                System.out.println("4. Devolver un libro");
                System.out.println("5. Mostrar los libros en la biblioteca");
                System.out.println("0. Salir");
                System.out.print("Ingrese la opcion deseada: ");
                opcion = validarEntero();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingresa los datos del libro que quieras ingresar: ");
                        Libro libro = new Libro();
                        bibliotek4.agregarLibro(libro);
                        break;
                    case 2:
                        System.out.println("Ingresa el codigo del libro que deseas eliminar: ");
                        int codEli = validarEntero();
                        bibliotek4.eliminarLibro(codEli);
                        break;
                    case 3:
                        System.out.println("Ingresa el codigo del libro que deseas prestar: ");
                        int codPres = validarEntero();
                        bibliotek4.prestarLibro(codPres);
                        break;
                    case 4:
                        System.out.println("Ingresa el codigo del libro que deseas devolver: ");
                        int conDev = validarEntero();
                        bibliotek4.devolverLibro(conDev);
                        break;
                    case 5:
                        bibliotek4.mostrarLibros();
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opcion no valida. Por favor ingrese una opcion que sea valida.");
                }
            } while (opcion != 0);

            opc.close();
        }

        public static int validarEntero() {
            Scanner lectura = new Scanner(System.in);
            while (!lectura.hasNextInt()) {
                String input = lectura.next();
                System.out.println(input + " no es un numero entero. Por favor, ingrese un numero entero.");
                System.out.print("Ingrese un numero entero: ");
            }
            return lectura.nextInt();
        }
}