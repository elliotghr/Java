import javax.swing.JOptionPane;

public class Excersise_TanqueGasolina {
    public static void main(String[] args) {
        String tanqueGasolina = JOptionPane.showInputDialog(null, "Introduce el nivel de gasolina en el tanque (en litros): ");

        int tanqueGasolina1 = 0; // Inicializamos la variable tanqueGasolina1
        try {
            tanqueGasolina1 = Integer.parseInt(tanqueGasolina);
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Por favor, introduce un número entero.");
            main(args); // Volver a llamar al método main para solicitar la entrada nuevamente
        }

        if (tanqueGasolina1 == 0) {
            System.out.println("El tanque está vacío.");
        } else if (tanqueGasolina1 > 0 && tanqueGasolina1 <= 10) {
            System.out.println("El tanque está casi vacío.");
        } else if (tanqueGasolina1 > 10 && tanqueGasolina1 <= 20) {
            System.out.println("El tanque está a la mitad.");
        } else if (tanqueGasolina1 > 20 && tanqueGasolina1 <= 30) {
            System.out.println("El tanque está casi lleno.");
        } else {
            System.out.println("El tanque está lleno.");
        }
    }
}
