import java.io.*;
import java.util.*;
import java.util.Scanner;

interface AdvancedArithmetic{

    int divisor_sum (int n);
}

class Calculator implements AdvancedArithmetic{
    private int count = 0;
    public int divisor_sum (int n){
        for(int i = 1 ; i <= n ; i ++){
            if(n % i == 0){
                count += i;
            }

        }

        return count;
    }
}


public class Interfaces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdvancedArithmetic calc = new Calculator();

        int n = scanner.nextInt();

        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(calc.divisor_sum(n));



    }
}