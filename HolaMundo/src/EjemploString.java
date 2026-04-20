public class EjemploString {
    static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        // Comparación por instancia
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 " + esIgual);

        // Comparación por valor
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) " + esIgual);

        // Comparación de variables con el mismo valor
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 " + esIgual);

        // Comparación con equals
        String curso4 = "programación java";
        esIgual = curso4.equalsIgnoreCase(curso);
        System.out.println("curso3.equalsIgnoreCase(curso) " + esIgual);
    }
}
