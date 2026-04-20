public class EjemploStringConcatenacion {
    static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        // Sin parentesis
        System.out.println(detalle + numeroA + numeroB);

        // Con parentesis
        System.out.println(detalle + (numeroA + numeroB));

        // Realizando la suma primero
        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(profesor);
        System.out.println(detalle2);
    }
}
