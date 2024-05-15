import java.util.Scanner;

public class CalcularElNumeroMenorDeMultiplesValores {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("¿Cuántos números quiere comparar?");
        int cantidad = s.nextInt();

        if (cantidad < 10){
            System.out.println("Error! Debe comparar como mínimo 10 números enteros.");
        } else {
            int menor = Integer.MAX_VALUE;
            int numero;

            for (int i = 0; i < cantidad; i++){
                System.out.println("Ingrese el número " + (i + 1) + ": ");
                numero = s.nextInt();
                menor = (numero < menor) ? numero : menor;
            }

            System.out.println("El número menor es: " + menor);

            if (menor < 10){
                System.out.println("El número " + menor + "es menor que 10.");
            } else {
                System.out.println("El número " + menor + "es mayor o igual que 10.");
            }
        }
    }
}
