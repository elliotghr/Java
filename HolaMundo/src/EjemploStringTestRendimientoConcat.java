public class EjemploStringTestRendimientoConcat {
    static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            // c = c.concat(a).concat(b).concat("\n"); // -> 9214ms
            // c += a + b + "\n"; // -> 3574ms
            sb.append(c).append(a).append(b).append("\n"); // -> 28ms
        }

        long fin = System.currentTimeMillis();

        System.out.println("Tiempo transcurrido: " + (fin - inicio) + "ms");
    }
}
