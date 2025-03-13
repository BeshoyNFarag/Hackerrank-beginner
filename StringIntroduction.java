/*
* given 2 Strings
* calculate the sum of there chars and print it in a line (done)
* capitalize the first of each of them and concatenate them and print them (done)
* see which one comes before the other ()
* */

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        StringBuffer ABuffer = new StringBuffer(A);
        StringBuffer BBuffer = new StringBuffer(B);
        A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
        B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());


        int lenght = A.length() + B.length();
        System.out.println(lenght);
        if(A.compareTo(B)>0) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.printf("%s %s", A, B);






    }
}
