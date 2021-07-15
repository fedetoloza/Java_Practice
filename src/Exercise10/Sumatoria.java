package Exercise10;


import java.util.Scanner;

public class Sumatoria {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }

    public int SumarHasta(){
        int suma = 0;

        for(int cont = 0; cont <= getNum(); cont++){
            suma += cont;
        }
        return suma;
    }

    public void ValidarNumero(){
        Scanner num = new Scanner(System.in);
        do{
            System.out.println("Ingrese un numero mayor que 1");
            setNum(num.nextInt());

            if (getNum() <= 1) {
                System.out.println("El valor ingresado no es correcto");
                System.out.println("vuelva a intentarlo");
            }
        }  while(!(getNum() > 1 ));
    }
}
