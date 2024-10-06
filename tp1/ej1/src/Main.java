//1. Desarrollar una función que reciba tres números enteros positivos y devuelva el
//mayor de los tres, sólo si éste es único (es decir el mayor estricto). Devolver -1 en
//caso de no haber ninguno. No utilizar operadores lógicos (and, or, not). Desarrollar
//también un programa para ingresar los tres valores, invocar a la función y mostrar
//el máximo hallado, o un mensaje informativo si éste no existe.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mayorEstricto mayor = new mayorEstricto();

        System.out.println("Ingese el primer numero entero ");
        int valor1 = scanner.nextInt();

        System.out.println("Ingese el segundo numero entero ");
        int valor2 = scanner.nextInt();

        System.out.println("Ingese el tercer numero entero ");
        int valor3 = scanner.nextInt();

         if (mayor.calcularMayorEstricto(valor1, valor2, valor3) == -1){
             System.out.println("No existe mayor estricto ");
         } else if (mayor.calcularMayorEstricto(valor1, valor2, valor3) == valor1) {
             System.out.println("Mayor estricto: " + valor1);
         } else if (mayor.calcularMayorEstricto(valor1, valor2, valor3) == valor2) {
             System.out.println("Mayor estricto: " + valor2);
         } else if (mayor.calcularMayorEstricto(valor1, valor2, valor3) == valor3) {
             System.out.println("Mayor estricto: " + valor3);
         }

    }
}