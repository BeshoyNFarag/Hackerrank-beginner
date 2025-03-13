
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        StringBuffer reverse =  new StringBuffer(A);
        reverse.reverse();

        if(reverse.toString().equals(A)){
            System.out.println("Yes");
        }
        else{

            System.out.println("No");
        }

    }
}
