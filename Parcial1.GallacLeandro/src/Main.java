import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AppTarjeta appTar = new AppTarjeta();
        menu(appTar);

    }

    public static void menu(AppTarjeta appTar) {
        Scanner opc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n------------- Menu -------------");
            System.out.println("1. Generar tarjetas.");
            System.out.println("2. Eliminar tarjetas");
            System.out.println("3. Modificar Monto");
            System.out.println("4. Listado de tarjetas");
            System.out.println("0. Salir");

            while (!opc.hasNextInt()) {
                String input = opc.next();
                System.out.println(input + "No es una opcion valida.");
                System.out.println("Ingrese nuevamente una opcion:");
            }

            opcion = opc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa los datos de las tarjetas que quieras generar: ");
                    appTar.generarTarjetas();
                    break;
                case 2:
                    System.out.println("Ingresa el numero de la tarjeta que deseas eliminar: ");
                    appTar.eliminarTarjeta();
                    break;
                case 3:
                    System.out.println("Ingresa el numero de la tarjeta para modificar su monto: ");
                    appTar.modificarMonto();
                    break;
                case 4:
                    System.out.println("Mostrando los datos de la lista... \n\n----------- Lista de tarjetas -----------\n");
                    appTar.mostarListado();
                    System.out.println(" ---------------------------------------------------------------- ");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Ingresa una opcion nuevamente.");

            }

        } while (opcion != 0);
    }
}