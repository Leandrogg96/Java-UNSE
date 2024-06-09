import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crea una biblioteca de capacidad 99
        AppBiblio app1 = new AppBiblio(99, 999);

        menu(app1);
    }

    public static void menu(AppBiblio app1) {
        Scanner opc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Bienvenido a la biblioteca. Que accion deseas realizar?");
            System.out.println("0. Registrarse.");
            System.out.println("1. Pedir libro.");
            System.out.println("2. Devolver libro.");
            System.out.println("3. Ver libros.");
            System.out.println("4. Salir.");

            while (!opc.hasNextInt()) {
                String input = opc.next();
                System.out.println(input + "No es una opcion valida.");
                System.out.println("Ingrese nuevamente una opcion:");
            }

            opcion = opc.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Ingresaste a la opcion de registro: ");

                    break;
                case 1:
                    System.out.println("Ingresaste a pedir un libro: ");
                    app1.prestamo();
                    break;
                case 2:
                    System.out.println("Ingresaste a devolver un libro: ");
                    app1.devolucion();
                    break;
                case 3:
                    System.out.println("Ingresaste a ver libros: ");
                    app1.mostrar();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Ingresa una opcion nuevamente.");
            }


        } while (opcion != 4);
    }
}