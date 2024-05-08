import java.util.Scanner;

public class MostrarOrdenadosDosNumeros {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el primero número para ordenar de mayor a menor: ");
        int num1 = s.nextInt();

        System.out.println("Introduce el segundo número para ordenar de mayor a menor: ");
        int num2 = s.nextInt();

        int mayor = num1 > num2 ? num1 : num2;
        int menor = num1 < num2 ? num1 : num2;

        /*
        String resultado = (num1 > num2) ? num1 + ", "  + num2 : num2 + ", "  + num1
        System.out.println("Los números ordenados de mayor a menor son: " + resultado);
         */

        System.out.println("Los números ordenados de mayor a menor son: " + mayor + ", " + menor);
    }
}
