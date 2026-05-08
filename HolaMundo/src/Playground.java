import javax.swing.*;

public class Playground {
    public static void main(String[] args) {
        etiqueta:
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + ": descanso de fin de semana! ");
//                  Rompiendo el ciclo a propósito para generar un error y ver el uso de las etiquetas
                    break etiqueta;
                }
                System.out.println("Dia " + i + ", trabajando " + j + "hrs. ");
            }
        }

        String trabalenguas = "Tres tristes tigres tragan trigo en un trigal".toLowerCase();
        int trabalenguasLenght = trabalenguas.length();
        int count = 0;

        for (int i = 0; i < trabalenguasLenght; i++) {
//            System.out.println(trabalenguas.charAt(i));
            if (trabalenguas.charAt(i) == 't') {
                count++;
            }
        }
        System.out.println("count = " + count);
//        ---------------------------------------------------------------------------------------
//        EJERCICIOS:

        String frase = "Java es divertido".toLowerCase();
        System.out.println("frase = " + frase);
        count = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("# vocales = " + count);
        int fraseLength = frase.length() - 1;
        String fraseInvertida = "";
        for (int i = fraseLength; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }

        System.out.println("fraseInvertida = " + fraseInvertida);

        Character caracter = 'a';
        System.out.println("caracter = " + caracter);
        count = 0;
        for (int i = 0; i < fraseLength; i++) {
            if (frase.charAt(i) == caracter) {
                count++;
            }
        }

        System.out.println("caracter:" + caracter + " count = " + count);

        int numero1 = 12;
        int numero2 = 16;
        int numero3 = 15;
        int max = numero1;

        int res = (numero2 > numero1) ? numero2 : Math.max(max, numero3);
        System.out.println("res = " + res);

        int numeroMulti = 5;
        System.out.println("numeroMulti = " + numeroMulti);

        for (int j = 1; j <= 10; j++) {
            System.out.println(numeroMulti + "x" + j + "= " + (numeroMulti * j));
        }

// ________________________________________
//        Pálindromo
// ________________________________________
        System.out.println("Palindromo");

        frase = "java ";
        fraseLength = frase.length() - 1;
        fraseInvertida = "";
        for (int i = fraseLength; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }

        if (frase.equals(fraseInvertida)) {
            System.out.println("La frase es un palindromo");
        } else {
            System.out.println("La frase no es un palindromo");
        }
// ________________________________________
//        Cajero automático simple
// ________________________________________
        Boolean salir = false;

        while (!salir) {
            String option = JOptionPane.showInputDialog("Seleccione una opción: \n1. Consultar saldo\n2. Retirar dinero\n3. Depositar dinero\n4. Salir");

            int optionInt = Integer.parseInt(option);

            switch (optionInt) {
                case 1:
                    System.out.println("Opción 1: Consultar saldo");
                    break;
                case 2:
                    System.out.println("Opción 2: Retirar dinero");
                    break;
                case 3:
                    System.out.println("Opción 3: Depositar dinero");
                    break;
                case 4:
                    System.out.println("Opción 4: Salir");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }


    }
}
