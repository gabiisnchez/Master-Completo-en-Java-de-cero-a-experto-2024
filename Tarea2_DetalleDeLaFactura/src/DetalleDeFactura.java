import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca el nombre de la factura:");
        String nombreFactura = scanner.nextLine();

        System.out.println("Introduzca el precio del producto 1:");
        double precioProducto1 = scanner.nextDouble();

        System.out.println("Introduzca el precio del producto 2:");
        double precioProducto2 = scanner.nextDouble();

        double totalBruto = precioProducto1 + precioProducto2;
        double valorImpuesto = totalBruto * 0.19;
        double valorMonto = totalBruto + valorImpuesto;

        String mensajeFinal = "La factura " + nombreFactura + " tiene un total bruto de " + totalBruto + ", con un impuesto de " + valorImpuesto + " y el monto después de impuesto es de " + valorMonto;
        System.out.println(mensajeFinal);
    }
}
