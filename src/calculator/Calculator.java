package calculator;
import java.util.Scanner;
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
    public class OperatiiLogice {
        public int checkBiggerNumber(int first, int second) {
            if (first > second) {
                return first;
            } else {
                return second;
            }
        }

        public void checkString() {
            String aa = "asdasd ";
            String bb = "asdasd";

            if (!aa.equals("asd")) {
                System.out.println("is egale");
            }


        }

        public void switchCaseMethod() {
            System.out.println("Introdu un numar");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            switch (number) {
                case 1:
                    System.out.println("1");
                case 2:
                    System.out.println("2");
                case 3:
                    System.out.println("3");
            }
        }

        public void printToHundred(int number) {
            for (int i = number; i <= 100; i++) {
                System.out.println(i);
            }
        }

        public void printToHundredWhile(int number) {
            while (number <= 100) {
                System.out.println(number);
                number++;
            }
        }

        public void sumAndAverageHundred() {
            int rezultat = 0;

            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    rezultat += i;

                }
            }
            System.out.println(rezultat);
            System.out.println("Media numerelor este: "
                    + rezultat / 50);
        }


        public int[] getArrayHundred(){
            int[] myArray = new int[100];

            for (int i = 0; i < 100; i++) {
                myArray[i] = i + 1;
            }
            return myArray;
        }
        public float getAverageArray(int[] array){
            float sum=0f;

            for(int i=0;i<array.length; i++){
                sum= sum+array[i];
            }
            return sum/array.length;

        }

        public void printHyphenArray(){
            String[] myArray = new String[10];
            for (int i = 0; i < myArray.length; i++){
                myArray[i] ="- ";
            }

            for (int j = 0; j < 10; j++) {
                for (int i = 0; i < myArray.length; i++) {
                    System.out.print(myArray[i]);
                }
                System.out.println();
            }

}
    }}

