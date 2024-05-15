import java.util.Scanner;

public class SistemaDeNotasDeAlumnos {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double nota;
        int cont1 = 0;
        int contMayoresA5 = 0;
        int contMenoresA4 = 0;
        double sumaMayoresA5 = 0;
        double sumaMenoresA4 = 0;
        double sumaTotal = 0;

        double promedioNotasMayoresA5, promedioNotasMenoresA4;

        boolean error = false;

        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce una nota (entre 1 y 7) N" + (i + 1) + ": ");
            nota = s.nextDouble();

            if (nota == 0){
                error = true;
                break;
            }
            if (nota == 1 ){
                cont1++;
            } else {
                if (nota > 5){
                    contMayoresA5++;
                    sumaMayoresA5 += nota;
                } else if (nota < 4) {
                    contMenoresA4++;
                    sumaMenoresA4 += nota;
                }
            }
            sumaTotal += nota;
        }
        if (error){
            System.err.println("Error: No pueden haber notas con valor 0, se finaliza la ejecución del programa.");
            System.exit(1);
        }
        System.out.println("contNotas1 = " + cont1);
        if (contMayoresA5 == 0){
            System.out.println("No se puede calcular el promedio de notas mayores a 5");
        } else {
            promedioNotasMayoresA5 = sumaMayoresA5 / contMayoresA5;
            System.out.println("promedioNotasMayoresA5 = " + promedioNotasMayoresA5);
        }
        if (contMenoresA4 == 0){
            System.out.println("no se puede calcular el promedio de notas menores a 4");
        } else {
            promedioNotasMenoresA4 = sumaMenoresA4 / contMenoresA4;
            System.out.println("promedioNotasMenoresA4 = " + promedioNotasMenoresA4);
        }
        double promedioTotalNotas = sumaTotal / 20;
        System.out.println("promedioTotalNotas = " + promedioTotalNotas);
    }
}
