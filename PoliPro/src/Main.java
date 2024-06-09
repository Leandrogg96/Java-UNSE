import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AppPoli app1 = new AppPoli();
        menu(app1);

    }

    public static void menu(AppPoli appLista) {
        Scanner opc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n------------- Menu -------------");
            System.out.println("1. Agregar Polinomio.");
            System.out.println("2. Sumar dos polinomios.");
            System.out.println("3. Restar dos polinomios.");
            System.out.println("4. Imprimir polinomios almacenados.");
            System.out.println("5. Salir.");

            while (!opc.hasNextInt()) {
                String input = opc.next();
                System.out.println(input + "No es una opcion valida.");
                System.out.println("Ingrese nuevamente una opcion:");
            }

            opcion = opc.nextInt();

            switch (opcion) {
                case 1:
                    appLista.agregarPolinomio();
                    break;
                case 2:
                    System.out.println("Ingresaste a la funcion suma. Ingresa dos polinomios para efectuar su suma.");
                    appLista.resultado();
                    break;
                case 3:
                    System.out.println("Funcionalidad no disponible.");
                    break;
                case 4:
                    System.out.println("Funcionalidad no disponible.");
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion no valida, ingresa una opcion nuevamente.");
                    break;
            }
        } while (opcion != 5);
    }
}