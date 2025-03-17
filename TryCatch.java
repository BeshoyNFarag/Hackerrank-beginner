


import java.util.InputMismatchException;
import java.util.Scanner;


public class TryCatch {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);


        try{
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int result = x/y;
            if (Integer.class.isInstance(x) && Integer.class.isInstance(y)){
                System.out.println(result);

            }
            else
                throw new InputMismatchException();
            if (y == 0){
                throw new ArithmeticException();
            }
        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException zero){
            System.out.println(zero);

        }




    }
}
