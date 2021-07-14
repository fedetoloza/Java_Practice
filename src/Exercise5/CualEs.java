package Exercise5;

import java.util.Scanner;

/** Lee un número o un caracter (char) por teclado y muestre por consola, el carácter al que
 *  pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
 */

public class CualEs {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int asciiValue = numero.nextInt();


        char convertedChar = (char)asciiValue;
        System.out.println("El equivalente en ASCII de " + asciiValue + " es: " + convertedChar);
    }
}
