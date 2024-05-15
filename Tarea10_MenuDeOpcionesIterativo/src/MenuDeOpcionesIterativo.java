import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MenuDeOpcionesIterativo {
    public static void main(String[] args) {

        int opcionIndice = 0;
        do {
            Map<String, Integer> opciones = new HashMap<>();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();
            Object opcion = JOptionPane.showInputDialog(null, "Seleccione una Operación", "Mantenedor de usuario", JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación.");
            } else {
                opcionIndice = opciones.get(opcion.toString());

                String mensaje = null;

                switch (opcionIndice) {
                    case 1:
                        mensaje = "Usuario actualizado correctamente.";
                        JOptionPane. showMessageDialog(null, mensaje);
                        break;
                    case 2:
                        mensaje = "Usuario eliminado correctamente";
                        JOptionPane. showMessageDialog(null, mensaje);
                        break;
                    case 3:
                        mensaje = "Usuario agregado correctamente";
                        JOptionPane. showMessageDialog(null, mensaje);
                        break;
                    case 4:
                        mensaje = "Listando los usuarios";
                        JOptionPane. showMessageDialog(null, mensaje);
                        break;
                }
            }
        } while (opcionIndice != 5);
            JOptionPane.showMessageDialog(null, "Has salido con éxito!");
    }
}
