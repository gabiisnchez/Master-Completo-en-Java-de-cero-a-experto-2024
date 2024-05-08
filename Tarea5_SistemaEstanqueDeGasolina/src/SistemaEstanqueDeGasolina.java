import java.util.Scanner;

public class SistemaEstanqueDeGasolina {
    public static void main(String[] args) {

        String mensaje1 = "Estanque lleno.";
        String mensaje2 = "Estanque casi lleno.";
        String mensaje3 = "Estanque 3/4.";
        String mensaje4 = "Medio estanque.";
        String mensaje5 = "Suficiente.";
        String mensaje6 = "Insuficiente.";
        /*
        if (capacidadActual >= 0 && capacidadActual < 20) {
            System.out.println("Insuficiente");
        } else if (capacidadActual >= 20 && capacidadActual < 35) {
            System.out.println("Suficiente");
        } else if (capacidadActual >= 35 && capacidadActual < 40) {
            System.out.println("Medio Estanque");
        } else if (capacidadActual >= 40 && capacidadActual < 60) {
            System.out.println("Estanque  3/4");
        } else if (capacidadActual >= 60 && capacidadActual < 70) {
            System.out.println("Estanque casi lleno");
        } else if (capacidadActual == 70) {
            System.out.println("Estanque lleno");
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la cantidad de gasolina que hay actualmente: ");
        double estanqueActual = s.nextDouble();

        if (estanqueActual == 70){
            System.out.println(mensaje1);
        }else{
            if ((estanqueActual < 70) && (estanqueActual > 60)){
                System.out.println(mensaje2);
            }else{
                if ((estanqueActual < 60) && (estanqueActual > 40)){
                    System.out.println(mensaje3);
                }else{
                    if ((estanqueActual < 40) && (estanqueActual > 35)){
                        System.out.println(mensaje4);
                    }else{
                        if ((estanqueActual < 35) && (estanqueActual > 20)){
                            System.out.println(mensaje5);
                        }else{
                            if ((estanqueActual < 20) && (estanqueActual > 1)){
                                System.out.println(mensaje6);
                            }else{
                                if (estanqueActual == 0){
                                    System.out.println("Estanque vacío.");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
