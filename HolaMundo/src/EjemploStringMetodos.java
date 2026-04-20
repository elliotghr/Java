public class EjemploStringMetodos {
    static void main(String[] args) {
        String nombre = "Elliot";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Elliot\") = " + nombre.equals("Elliot"));
        System.out.println("nombre.equals(\"Elliot\") = " + nombre.equals("elliot"));
        System.out.println("nombre.equalsIgnoreCase(\"Elliot\") = " + nombre.equalsIgnoreCase("elliot"));
        System.out.println("nombre.compareTo(\"Elliot\") = " + nombre.compareTo("Elliot"));
        System.out.println("nombre.compareTo(\"César\") = " + nombre.compareTo("César"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        System.out.println("nombre.substring(3, 6) = " + nombre.substring(3, 6));

        String trabalenguas = "trbalenguas";
        System.out.println("trabalenguas.replace(\"a\", \"x\") = " + trabalenguas.replace("a", "x"));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a')); = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"tr\")); = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"as\")); = " + trabalenguas.endsWith("as"));
        System.out.println("     trabalenguas       ");
        System.out.println("\"     trabalenguas       \".trim() = " + "     trabalenguas       ".trim());

    }
}
