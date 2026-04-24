import java.util.Scanner;

public class OperadoresLogicoLogin {
    public static void main(String[] args) {

        String username = "admin";
        String password = "1234";

        String username2 = "admin2";
        String password2 = "1234";

        String username3 = "admin3";
        String password3 = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el usuario:");

        String usuario = scanner.next();

        System.out.println("Ingresa la contraseña");
        String contrasenia = scanner.next();

        boolean isLogged = false;

        // Validación multiple con arrays
        String[] usernames = {username, username2, username3};
        String[] passwords = {password, password2, password3};

        for (int i = 0; i < usernames.length; i++) {
//            if (usuario.equals(usernames[i]) && contrasenia.equals(passwords[i])) {
//                isLogged = true;
//                break;
//            }

            // Ejemplo con operador ternario (no es la más optima para miles o millones de usuarios)
            isLogged = (usuario.equals(usernames[i]) && contrasenia.equals(passwords[i])) ? true : false;

            if (isLogged) {
                break;
            }
        }

        /*
        // Validación individual
        if (usuario.equals(username) && password.equals(contrasenia)) {
            isLogged = true;
        }
         */
        /*
        if (isLogged) {
            System.out.println("Login exitoso. Bienvenido, " + usuario);
        } else {
            System.out.println("Login fallido");
        }
         */
        String message = (isLogged) ? "Login exitoso. Bienvenido, " + usuario : "Login fallido";
        System.out.println(message);
    }
}
