public class EjemploStringMetodosArreglo {
    static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++) {
            System.out.println("arreglo[i] = " + arreglo[i]);
        }

        System.out.println("trabalenguas.split(\"a\")); = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        System.out.println("arreglo2 = " + arreglo2);
        int largoArreglo2 = arreglo2.length;

        for (int i = 0; i < largoArreglo2; i++) {
            System.out.println(arreglo2[i]);
        }

        String archivo = "alguna.imagen.png";
        String[] arregloArchivo = archivo.split("\\.");
        int largoArchivo = arregloArchivo.length;
        System.out.println("largoArchivo = " + largoArchivo);
        for (int i = 0; i < largoArchivo; i++) {
            System.out.println("arregloArchivo[i] = " + arregloArchivo[i]);
        }
        System.out.println("extensión: " + arregloArchivo[2]);
    }
}
