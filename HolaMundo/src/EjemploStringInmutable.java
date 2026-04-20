public class EjemploStringInmutable {
    static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        curso.concat(profesor);
        System.out.println("Prueba inmutabilidad: " + curso);

        String resultado = curso.concat(profesor);
        System.out.println("Prueba con nueva variable: " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> {
            return c.concat(profesor);
        });
        System.out.println("curso: " + curso);
        System.out.println("Prueba con transformador (inmutable): " + resultado2);

        String resultado3 = resultado.replace("Java", "Python");
        System.out.println("Prueba con replace (inmutable): " + resultado3);
    }
}
