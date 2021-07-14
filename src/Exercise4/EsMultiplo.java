package Exercise4;

import java.util.Scanner;

/** Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es,
 *  también debemos indicarlo.
 */

public class EsMultiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int valor1 = scanner.nextInt();
        scanner.close();

        if (esMultiploDe2(valor1) == 0){
            System.out.println(valor1 +" es divisible por 2");
        } else {
            System.out.println(valor1 + " no es divisible por 2");
        }
    }
    public static int esMultiploDe2(int valor1){
        return (valor1 % 2);
    }
}
