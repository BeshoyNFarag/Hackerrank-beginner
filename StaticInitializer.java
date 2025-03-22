import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializer {
    static int B;
    static int H;

    static{
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        if(StaticInitializer.B > 0 && StaticInitializer.H > 0){
            int area = StaticInitializer.B * StaticInitializer.H;
            System.out.println(area);

        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }






    }//end of main

}//end of class

