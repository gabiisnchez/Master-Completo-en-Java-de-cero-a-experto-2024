import java.util.Scanner;

public class MultiplicarDosNumeros {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = s.nextInt();
        System.out.println("Ingrese el número por el que lo quieres multiplicar: ");
        int num2 = s.nextInt();
        int resultado = 0;

        boolean positivo1 = num1 > -1;
        boolean positivo2 = num2 > -1;

        int absoluto1 = positivo1 ? num1 : -num1;

        for (int i = 0; i < absoluto1; i++){
            resultado = resultado + num2;
        }
        if ((!positivo1 && !positivo2) || !positivo1){
            resultado = -resultado;
        }
        System.out.println("resultado = " + resultado);
    }
}
