import java.util.Scanner;

public class OperatiiLogice {
    public void main(String[] args) {
        Scanner scanez = new Scanner(System.in);
        String hhh = scanez.next();
        int c = scanez.nextInt();
        if (hhh.equals("FastTrack")) {
            System.out.println("Learning text comparison");
        } else if (!hhh.equals("FastTrack)")) {
            System.out.println("Got to try some more");
        }
    }

    public  void compareNumber(int number) {
        int a = 2;
        int b = 8;
        if (number >= a) {
            System.out.println(number);
        } else if (number <= b) {
            System.out.println(number);
        }
    }

    public  void checkNumber() {
        int x = 5;
        int y = 6;
        if (x > y) {
            System.out.println(x);
        } else if (x < y)
            System.out.println(y);
    }
}