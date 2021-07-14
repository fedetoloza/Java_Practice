package Exercise11;

import java.util.Scanner;

/** Eliminar los espacios de una frase pasada por consola por el usuario. Por ejemplo, si
 *  ingreso “el dia esta hermoso para programar” debería devolver “eldiaestahermosoparaprogramar”.
 */

public class EliminarEspacios {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        System.out.println("Escriba una frase: ");
        String frase = sn.next();

        System.out.println(chauEspacios(frase));
    }
    public static String chauEspacios(String frase){
        String fraseSinEspacios = "";
        char carActual;

        for(int i=0; i<frase.length(); i++) {
            carActual = frase.charAt(i);

            if (carActual != ' ') {
                fraseSinEspacios += String.valueOf(carActual);
            }
        }
        return fraseSinEspacios;
    }

}
