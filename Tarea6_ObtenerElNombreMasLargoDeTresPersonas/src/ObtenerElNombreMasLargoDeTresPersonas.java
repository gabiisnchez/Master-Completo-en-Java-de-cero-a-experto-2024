import javax.swing.*;

public class ObtenerElNombreMasLargoDeTresPersonas {
    public static void main(String[] args) {

        String nombre1 =JOptionPane.showInputDialog(null, "Introduce el nombre completo de una persona.");
        String nombre2 =JOptionPane.showInputDialog(null, "Introduce el nombre completo de una persona.");
        String nombre3 =JOptionPane.showInputDialog(null, "Introduce el nombre completo de una persona.");

        /* FORMA DE HACERLO SIN IF ELSE y OPERADOR TERNARIO

        String max = (nombre1.split(" ")[0].length() < nombre2.split(" ")[0].length()) ? nombre2 : nombre1;
        max = (nombre3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: nombre3;

        System.out.println("La persona con el nombre mas largo es " + max);
         */

        String [] nombreSinEspacios1 = nombre1.split(" ");
        int largo1 = nombreSinEspacios1[0].length();

        String [] nombreSinEspacios2 = nombre2.split(" ");
        int largo2 = nombreSinEspacios2[0].length();

        String [] nombreSinEspacios3 = nombre3.split(" ");
        int largo3 = nombreSinEspacios3[0].length();

        int nombreLargo = Math.max(largo1, largo2);
        int nombreLargoFinal = Math.max(nombreLargo, largo3);

        if (nombreLargoFinal == largo1){
            System.out.println(nombre1 + " tiene el nombre más largo.");
        } else if (nombreLargoFinal == largo2) {
            System.out.println(nombre2 + " tiene el nombre más largo.");
        } else if (nombreLargoFinal == largo3) {
            System.out.println(nombre3 + " tiene el nombre más largo.");
        }
    }
    }

