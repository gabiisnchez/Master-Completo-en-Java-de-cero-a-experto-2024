import java.util.Scanner;

public class ProgramaMenejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el nombre de un familiar o amigo");
        String nombre1 =scanner.nextLine();

        System.out.println("Escribe el nombre de un familiar o amigo");
        String nombre2 =scanner.nextLine();

        System.out.println("Escribe el nombre de un familiar o amigo");
        String nombre3 =scanner.nextLine();

        String nombre1Cod = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2);
        String nombre2Cod = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2);
        String nombre3Cod = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2);

        String resultado = nombre1Cod + "_" + nombre2Cod + "_" + nombre3Cod;
        System.out.println(resultado);
    }
}
