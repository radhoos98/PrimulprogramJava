
import java.util.Scanner;

public class Main {


//    public static void main(String[] args) {
        Scanner scanez = new Scanner(System.in);
//        String hhh = scanez.next();
//        int c = scanez.nextInt();
//        if (hhh.equals("FastTrack")) {
//            System.out.println("Learning text comparison");
//        } else if (!hhh.equals("FastTrack)")) {
//            System.out.println("Got to try some more");
//        }


//   Exercitiul 1
//        System.out.println("creeaza o bucla de la 1 la 10");
//           for (int i=1;i<=10;i++){
//               System.out.println(i);
//   Exercitiul 2
//        System.out.println("cout backwards from a number to a lower given nimber");
//        for (int a=9;a>=2;a--){
//                System.out.println(+a);
//   Exercitiul 3

//        System.out.println("write a Java program by using two for loops to produce the output below");
//        for (int column = 0; column <= 7; column++) {
//
//            for (int row = 1; row <= 7 - column; row++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//  NU INTELEG DE CE IMI PRINTEAZA  O STELUTA ININTEA ORDINII CERUTE
//
//
//  Exercitiul 4
//        System.out.println("Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100." +
//               "Also compute and display the average.");
//      int rezultat = 0;
//            for (int a = 1; a <= 100; a++) {
//                if (a % 2 != 0) {
//                    rezultat = rezultat + a;
//    }
//        }
//        System.out.println(rezultat);
//        System.out.println(rezultat/50);
//      While do method
//        int i = 0;
//        while (i <= 100) {
//            if (i % 2 != 0) {
//
//                rezultat += i;
//            }
//            i++;
//        }
//        System.out.println(rezultat);
//        System.out.println(rezultat / 50);
//
        //do while method

//LOOP 3
//        System.out.println("modify the program to sum from 111 to 8899");
//        int rezultat = 0;
//
//        for(int a=111;a<=8899;a++) {
//            if (a % 2 != 0) {
//                rezultat = rezultat + a;
//            }
//        }
//        System.out.println(rezultat);
//        System.out.println(rezultat/4394)
//        int count=0;
//        for(int a=111;a<=8899;a++) {
//            if (count>=111&&count<=8899)count++;
//        }
//
//
//
//        System.out.println(count);


//        int[] myArray = new int[100];
//        for (int i = 0; i < 100; i++) {
//            myArray[i] = i + 1;
//        }
//        for (int i = 0; i < 100; i++) {
////            System.out.println(myArray[i]);
////        }
//        }

// Lab 13  Exercitiul 4

//     public static boolean contains(int[] arr, int number) {
//        for (int n : arr) {
//            if (number == n) {
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        int[] my_array1 = {
//                245, 205, 869, 334,13};
//        System.out.println(contains(my_array1, 13));
//        System.out.println(contains(my_array1, 245));
//    }

//    Lab 13 Exercitiul 5

    public static int findIndex(int arr[], int x)
    {

        if (arr == null) {
            return -1;
        }

        int len = arr.length;
        int i = 0;


        while (i < len) {

            if (arr[i] == x) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] my_array = { 3,6,1,7,9,2,0,5};

        System.out.println("Index position of 5 is: "
                + findIndex(my_array, 1));

        System.out.println("Index position of 7 is: "
                + findIndex(my_array, 9));
    }
}



