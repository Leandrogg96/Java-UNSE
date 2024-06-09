import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        AplicacionLista appLista = new AplicacionLista();
        menu(appLista);

    }

    public static void menu(AplicacionLista appLista) {
        Scanner opc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n------------- Menu -------------");
                System.out.println("1. Generar");
                System.out.println("2. Eliminar");
                System.out.println("3. Actulizar datos");
                System.out.println("4. Imprimir");
                System.out.println("5. Salir");

            while (!opc.hasNextInt()) {
                String input = opc.next();
                System.out.println(input + "No es una opcion valida.");
                System.out.println("Ingrese nuevamente una opcion:");
            }

            opcion = opc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa los datos del Radio Taxi que quieras generar: ");
                    appLista.generarElemento();
                    break;
                case 2:
                    System.out.println("Ingresa el numero de movil que deseas eliminar: ");
                    appLista.eliminarElemento();
                    break;
                case 3:
                    System.out.println("Ingresa el numero de movil para modificar sus datos: ");
                    appLista.actualizarElemento();
                    break;
                case 4:
                    System.out.println("Mostrando los datos de la lista... \n\n----------- Lista de Radio Taxis -----------\n");
                    appLista.imprimirLista();
                    System.out.println(" ---------------------------------------------------------------- ");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Ingresa una opcion nuevamente.");

            }

        } while (opcion != 5);
    }
}