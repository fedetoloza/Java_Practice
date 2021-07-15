package Exercise10;

import java.util.Scanner;

/** Realizar la suma del 1 al número que indiquemos, este debe ser mayor que 1.
 *
 */

public class Sumemos1 {
    public static void main(String[] args) {
        Sumatoria sumatoria = new Sumatoria();

        sumatoria.ValidarNumero();

        System.out.println("La suma es: "+ sumatoria.SumarHasta());
    }
}
