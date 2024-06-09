import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    LocalDate date;
    Locale l = new Locale("es","AR");

    public Fecha(int dia, int mes, int anio) {
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }
    public Fecha() {
        leerDatosFecha();
    }

    public void leerDatosFecha() {
        System.out.println("Dia: ");
        this.dia = validarDia();
        System.out.println("Mes: ");
        this.mes = validarMes();
        System.out.println("Anio: ");
        this.anio = validarAnio();
    }

    public int validarAnio() {
        Scanner lectura = new Scanner(System.in);
        while (!lectura.hasNextInt() && lectura.nextInt() > date.getYear()) {
            String input = lectura.next();
            System.out.println(input + " no es un anio valido. Por favor, ingrese un anio mayor que el actual");
            System.out.print("Ingrese un anio: ");
        }
        return lectura.nextInt();
    }


    public int validarDia() {
        Scanner lectura = new Scanner(System.in);
        while (!lectura.hasNextInt() && lectura.nextInt() < 31 && lectura.nextInt() > 0) {
            String input = lectura.next();
            System.out.println(input + " no es un dia valido. Por favor, ingrese un numero entre 1 y 30");
            System.out.print("Ingrese un dia: ");
        }
        return lectura.nextInt();
    }

    public int validarMes() {
        Scanner lectura = new Scanner(System.in);
        while (!lectura.hasNextInt() && lectura.nextInt() < 13 && lectura.nextInt() > 0) {
            String input = lectura.next();
            System.out.println(input + " no es un mes valido. Por favor, ingrese un numero entre 1 y 12.");
            System.out.print("Ingrese un mes: ");
        }
        return lectura.nextInt();
    }


    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
    public Fecha fechaActual()
    {
        LocalDate actual = LocalDate.now();
        return (new Fecha(actual.getDayOfMonth(),actual.getMonth().getValue(),actual.getYear()));

    }
    public String getNombreMes()
    {
        return  date.getMonth().getDisplayName(TextStyle.FULL,l);
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public String toString()
    {
        return getDia()+" "+getMes()+ " "+ getAnio();
    }

}

