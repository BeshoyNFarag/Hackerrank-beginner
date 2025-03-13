import java.util.Scanner;

public class InAndOut2 {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        String str = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + str);
        System.out.println("Double: " + num1);
        System.out.println("Int: " + num);


    }
}
