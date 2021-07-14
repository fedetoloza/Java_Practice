package Exercise12;

import java.util.Locale;
import java.util.Scanner;
import static Exercise11.EliminarEspacios.chauEspacios;

/** Crea una función que cuente el número de vocales que contiene una cadena.
 *  Desde la función principal tendrás que pedir una palabra o frase al usuario y tendrás
 *  que mostrar el número de vocales que contiene haciendo uso de la función anterior.
 */

public class ContandoVocales {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        System.out.println("Escriba una palabra o frase: ");
        String frase = sn.next();

        String fraseFinal = chauEspacios(frase);

        cuantasVocalesHay(fraseFinal.toLowerCase(Locale.ROOT));
    }
    public static void cuantasVocalesHay(String fraseFinal) {
        int contador = 0;
        for(int i=0; i<fraseFinal.length(); i++){
            if(fraseFinal.charAt(i)=='a'|| fraseFinal.charAt(i)=='e'||fraseFinal.charAt(i)=='i'||fraseFinal.charAt(i)=='o'||fraseFinal.charAt(i)=='u'){
                contador++;
            }
        }
        if(contador == 1){
            System.out.println("Hay "+ contador + " sola vocal");
        } else {
            System.out.println("Hay " + contador + " vocales");
        }
    }
}