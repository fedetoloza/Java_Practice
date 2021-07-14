package Exercise2;

/** Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los
 *  dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que
 *  funciona.
 */

public class MayorDe {
    public static void main(String[] Args){
        int valor1 = 15;
        int valor2 = 15;

        if (valor1 > valor2){
            System.out.println(valor1 + " es mayor que " + valor2);
        } else {
            if (valor1 < valor2) {
                System.out.println(valor1 + " es menor que " + valor2);
            } else {
                System.out.println(valor1 + " y " + valor2 + " son iguales.");
            }
        }
    }
}
