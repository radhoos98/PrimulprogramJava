
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanez = new Scanner(System.in);
        String hhh = scanez.next();
        int c = scanez.nextInt();
        if (hhh.equals("FastTrack")) {
            System.out.println("Learning text comparison");
        } else if (!hhh.equals("FastTrack)")) {
            System.out.println("Got to try some more");
        }
     // exercitiul 5

        int x = scanez.nextInt();
        int y=8;
        int z=6;
        if (x>y||x==z){
            System.out.println("The amount of snow this winter was" + x +"cm");
        }
        else System.out.println("The forecast snow is"+ x + "cm");

        //exercitiul 6
        int a =scanez.nextInt();
        int b =3;
        int c =4;
        if (a>b && a!=c){
            System.out.println("The number is greater than 3 and not equal to 4");
    }
        else if (a==c){
            System.out.println("The Number is equal to 4");
        }
        else if (a<b){
            System.out.println("The number is lower than 3");
        }

        //exercitiul 7
        System.out.println("press a number key");
        int number=scanez.nextInt();
        switch (number){
            case 0:number=0;
            break;
            case 1: number=1;
            break;
            case 2:number=2;
            break;
            case 3: number=3;
            break;
            case 4:number =4;
            break;
            case 5: number=5;
            break;
            case 6: number=6;
            break;
            case 7: number=7;
            break;
            case 8:number=8;
            break;
            case 9: number=9;
            break;}
            System.out.println(number);
 if (number<0||number>9){
    System.out.println("Not allowed");
}}
}
