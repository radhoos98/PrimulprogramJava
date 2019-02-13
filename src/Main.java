import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanez = new Scanner (System.in);
//        double x = 7;
//        int y = 8;
//        System.out.println("hello");
//        System.out.println("Radu Serbanescu");
//
//        double adunare = x + y;
//        System.out.println(x + y);
//        System.out.println("adunare=" + adunare);
//        double impartire = y / x;
//        System.out.println("impartire" + impartire);
//
//        System.out.println(-5 + 8 * 6);
//        System.out.println((55 + 9) % 9);
//        System.out.println(20 + -3 * 5 / 8);
//        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        int res = scadere(2,3);
        System.out.println(res);
        System.out.println(scadere(2,3));
        System.out.println(inmultire(2,3));
        System.out.println(impartire (8,4));
        System.out.println(scadere(21,11));


Baiat ionut=new Baiat();
ionut.culoare="verde";
ionut.greutate= 28.3f;
ionut.inaltime=120;
ionut.nume="Ionut";

        System.out.println(ionut.culoare);
    }



    public static int scadere(int primulNumar, int alDoileaNumar) {
        int resultat = primulNumar - alDoileaNumar;
        return resultat;


    }
    public static int inmultire(int primulNumar, int alDoileaNumar){
        int resultat = primulNumar * alDoileaNumar;
        return resultat;
    }
    public static int impartire (int primulNumar, int alDoileaNumar){
        int resultat = primulNumar / alDoileaNumar;
        return resultat;
    }
}


