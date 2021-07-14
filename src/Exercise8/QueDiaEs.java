package Exercise8;

import java.util.Scanner;

/** Crea una aplicación que nos pida un día de la semana y que nos diga si es un día
 *  laboral o no (si ingreso “jueves” me debería decir que si es laboral).
 */

public class QueDiaEs {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Pone un dia: ");
        String dia = entrada.next();


        switch(dia.toLowerCase()){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es fin de semana, disfrutalo");
                break;
            default:
                System.out.println("No es un dia de semana");
                break;
        }

    }


}