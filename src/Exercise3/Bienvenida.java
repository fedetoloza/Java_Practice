package Exercise3;

import java.util.Scanner;

/** Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida
 *  por consola. Por ejemplo: si introduzco “Fernando”, me aparece “Bienvenido Fernando”.
 */

public class Bienvenida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba su nombre: ");
        String name = scanner.next();
        scanner.close();
        System.out.println("Bienvenido/a " + name);
    }
}