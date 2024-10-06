import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fecha fecha = new fecha();
        verificador vc = new verificador();

        System.out.println("Ingrese el dia que desea validar ");
        int dia = sc.nextInt();
        fecha.setDia(dia);

        System.out.println("Ingrese el mes que desea validar ");
        int mes = sc.nextInt();
        fecha.setMes(mes);

        System.out.println("Ingrese el anio que desea validar ");
        int anio = sc.nextInt();
        fecha.setAnio(anio);

        boolean esValido = vc.verificarFecha(fecha);
        if (esValido) {
            System.out.println("La fecha ingresada es valdia ");
        }
        else {
            System.out.println("La fecha ingresada no es valdia ");
        }


    }
}