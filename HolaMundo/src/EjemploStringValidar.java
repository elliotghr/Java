public class EjemploStringValidar {
    static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (!esNulo) {
            System.out.println(curso.toUpperCase());
        }
        // Validar null
        if (curso == null) {
            curso = "Java";
        }
        // Validar vacio
        if (curso.length() == 0) {
            curso = "Java";
        }
        // Otra manera de validar vacio
        if (curso.isEmpty()) {
            curso = "Java";
        }
        // Validar si es un string sin contenido como -> "     "
        if (curso.isBlank()) {
            curso = "Java";
        }

        System.out.println(curso.concat(" es un gran curso"));
    }
}
