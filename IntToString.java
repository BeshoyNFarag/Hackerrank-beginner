
import java.util.Scanner;

public class IntToString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        if(String.valueOf(num) instanceof String){
            System.out.println("Good job");

        }
        else{
            System.out.println("Wrong answer");
        }


    }
}
