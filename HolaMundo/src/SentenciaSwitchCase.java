public class SentenciaSwitchCase {
    public static void main(String[] args) {

        char num = 'z';

        switch (num){
            case '0':
                System.out.println("El numero es cero");
                break;
            case '1':
                System.out.println("El numero es uno");
                break;
            case '2':
                System.out.println("El numero es dos");
                break;
            case '3':
                System.out.println("El numero es tres");
                break;
            case 'a':
                System.out.println("El caracter es a");
                break;
            default:
                System.out.println("Número o caracter desconocido");
        }

        String nombre = "juan";

        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case "Gabi":
                System.out.println("Hola Gabi, bienvenido!");
                break;
            case "pepe":
                System.out.println("Hola pepe, bienvenido!");
                break;
            default:
                System.out.println("Usuario desconocido!");

        }
    }
}
