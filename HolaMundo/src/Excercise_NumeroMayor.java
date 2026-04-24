import javax.swing.JOptionPane;

public class Excercise_NumeroMayor {
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog(null, "Introduce el primer número: ");
        String numero2 = JOptionPane.showInputDialog(null, "Introduce el segundo número: ");

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);

//      Usando operador ternario
        int resultado = (num1 > num2) ? num1 : num2;
//      Usando Math.max
        resultado = Math.max(num1, num2);

        System.out.println("El numero más alto es: " + resultado);
    }
}
