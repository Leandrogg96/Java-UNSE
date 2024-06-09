import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AppCajaFuerte app1 = new AppCajaFuerte();
        menu(app1);

    }

    public static void menu(AppCajaFuerte app1){
        Scanner opc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("-----------Menu-----------\n");
            System.out.println("1. Abrir caja fuerte.");
            System.out.println("2. Cambiar clave.");
            System.out.println("3. Cerrar caja fuerte.");
            System.out.println("4. Salir");

            while (!opc.hasNextInt()) {
                String input = opc.next();
                System.out.println(input + "No es una opcion valida.");
                System.out.println("Ingrese nuevamente una opcion:");
            }

            opcion = opc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingresaste a la opcion de abrir caja.");
                    app1.abrirCaja();
                    break;
                case 2:
                    System.out.println("Ingresaste a la opcion cambiar clave.");
                    app1.cambiarClave();
                    break;
                case 3:
                    System.out.println("Ingresaste a la opcion cerrar caja fuerte.");
                    app1.cerrarCaja();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Ingrese nuevamente una opcion: ");
                    break;
            }
        } while (opcion != 4);
    }
}
