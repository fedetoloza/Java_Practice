package Exercise1;

/**  Declara dos variables numéricas (con el valor que desees), muestra por consola la
 *   suma, resta, multiplicación, división y módulo (resto de la división).
 */



class Operaciones {
    public static void main(String[] args) {
        // variables numericas a utilizar
        int valor1 = 5;
        int valor2 = 2;

        System.out.println("Operaciones basicas entre " + valor1 + " y " + valor2);
        System.out.println("la suma de " + valor1 + " y " + valor2 + " es igual a :" + sumaOperaciones(valor1, valor2));
        System.out.println("la resta de " + valor1 + " y " + valor2 + " es igual a :" + restaOperaciones(valor1, valor2));
        System.out.println("la multiplicacion de " + valor1 + " y " + valor2 + " es igual a :" + multiplicacionOperaciones(valor1, valor2));
        System.out.println("la division de " + valor1 + " y " + valor2 + " es igual a :" + divisionOperaciones(valor1, valor2));

    }
    public static int sumaOperaciones(int valor1, int valor2){
        return (valor1 + valor2);
    }
    public static int restaOperaciones(int valor1, int valor2){
        return (valor1 - valor2);
    }
    public static int multiplicacionOperaciones(int valor1, int valor2){
        return (valor1 * valor2);
    }
    public static int divisionOperaciones(int valor1, int valor2){
        return (valor1 / valor2);

    }
}

