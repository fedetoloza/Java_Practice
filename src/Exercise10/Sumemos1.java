package Exercise10;

import java.util.Scanner;

/** Realizar la suma del 1 al número que indiquemos, este debe ser mayor que 1.
 *
 */

public class Sumemos1 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        Sumatoria sumatoria = new Sumatoria();

        do {
            System.out.println("Ingrese un numero mayor que 1");
            sumatoria.setNum(dato.nextInt());
            if (sumatoria.getNum() <= 1) {
                System.out.println("El valor ingresado no es correcto");
                System.out.println("vuelva a intentarlo");
            }
        } while(!(sumatoria.getNum()>1));

        System.out.println("La suma es: "+ sumatoria.SumarHasta());
    }
}
