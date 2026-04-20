public class EjemploStringExtensionArchivo {
    static void main(String[] args) {
        String archivo = "alguna.imagen.png";

        int position = archivo.lastIndexOf(".");
        String extension = archivo.substring(position + 1);
        System.out.println("extension = " + extension);
    }
}
