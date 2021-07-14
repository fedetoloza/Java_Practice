package Exercise7;

import java.util.Scanner;

/** Lee un número por teclado y comprueba que este número es mayor o igual que cero, si
 *  no lo es lo volverá a pedir (do while), después muestra ese número por consola
 */

public class EsMayor {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Introduce un numero mayor o igual que 0");
            numero = scanner.nextInt();
        } while (numero < 0);

        System.out.println(numero);

    }
}
