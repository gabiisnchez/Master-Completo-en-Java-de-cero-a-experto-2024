public class HolaMundo {
    public static void main(String[] args) {

        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;

        System.out.println("numero = " + numero);

        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero2);
            numero2 = 10;
            System.out.println("numero2 = " + numero2);
        }

        var numero3 = "15";
    }
}
