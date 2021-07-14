package Exercise10;


public class Sumatoria {
    private int num;
    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return this.num;
    }
    public int SumarHasta(){
        int suma = 0;

        for(int cont = 0; cont <= getNum(); cont++){
            suma += cont;
        }
        return suma;
    }
}
