package calculator;

public class Calculator {

    public  int scadere(int primulNumar, int alDoileaNumar) {
        int resultat = primulNumar - alDoileaNumar;
        return resultat;


    }
    public int adunare (int primulNumar,int alDoileaNumar){
        int resultat = primulNumar + alDoileaNumar;
        return resultat;
    }

    public int inmultire(int primulNumar, int alDoileaNumar) {
        int resultat = primulNumar * alDoileaNumar;
        return resultat;
    }

    public  int impartire(int primulNumar, int alDoileaNumar) {
        int resultat = primulNumar / alDoileaNumar;
        return resultat;
    }
public void sumAndAverageHundred(){
        int rezultat=0;
        int i = 0;
        while (i <= 100) {
        if (i % 2 != 0) {

             rezultat = i + i;
        }
        i++;

        System.out.println(rezultat);
        System.out.println(rezultat / 50);
}
    }

    public void printALoopToTen(){

        for (int i=1;i<=10;i++){
            System.out.println(i);
    }

    }

}
