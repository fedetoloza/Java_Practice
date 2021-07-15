package Exercise13;

import java.util.*;

public class SumaDeArraysCor {
    public static void main(String[] args) {

        SumaDeArrays();
    }

    public static void SumaDeArrays(){
        Scanner num = new Scanner(System.in);
        System.out.println("indique cantidad de numeros de la primera lista");
        List<Integer> arrayMay10 = new ArrayList<>();
        int arraysize1 = num.nextInt();
        int[] array1 = new int[arraysize1];

        for (int i=0 ; i<= arraysize1-1; i++){
            System.out.println("ingrese un numero al conjunto: ");
            array1[i] = num.nextInt();
            if (array1[i] > 10) {
                arrayMay10.add(array1[i]);
            }
        }
        System.out.println("indique cantidad de numeros de la segunda lista");
        int arraysize2 = num.nextInt();
        int[] array2 = new int[arraysize2];

        for (int i=0 ; i<= arraysize2-1; i++){
            System.out.println("ingrese un numero al conjunto: ");
            array2[i] = num.nextInt();
            if (array2[i] > 10) {
                arrayMay10.add(array2[i]);
            }

        }
        Collections.sort(arrayMay10);
        System.out.println("la primer lista es: " + Arrays.toString(array1));
        System.out.println("la segunda lista es: " + Arrays.toString(array2));
        System.out.println("la lista de numeros mayores de 10 entre ambas es: " + arrayMay10);
    }
}
