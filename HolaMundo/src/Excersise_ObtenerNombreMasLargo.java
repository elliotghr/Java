import javax.swing.JOptionPane;

public class Excersise_ObtenerNombreMasLargo {
    static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog(null, "Introduce el primer nombre: ");
        if (nombre1 == null || nombre1.trim().isEmpty()) {
            System.out.println("No se ha introducido un nombre válido.");
            return;
        }
        String nombre2 = JOptionPane.showInputDialog(null, "Introduce el segundo nombre: ");
        String nombre3 = JOptionPane.showInputDialog(null, "Introduce el tercer nombre: ");

        // String[] nombres = {"Elliot Gandarilla", "Alejandra Gimenez", "Nano Banano"};
        String[] nombres = {nombre1, nombre2, nombre3};

        String nombreMasLargo = "";

        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i].split(" ")[0];
            if (nombre.length() > nombreMasLargo.length()) {
                nombreMasLargo = nombre;
            }
        }

        System.out.println("nombre más largo = " + nombreMasLargo);
    }
}
