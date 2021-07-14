package Exercise9;

import java.util.Scanner;

/** Pide un número por teclado e indica si es un número primo o no
 *
 */

public class EsPrimo {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        numero = scanner.nextInt();
        if (esPrimo(numero)) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }
        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        // menos de 1 y 4 no son primos
        if (numero <= 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % x == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }
}