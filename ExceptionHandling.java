import java.util.Scanner;


class MyCalculator{
    public long power(int n, int p){
        long result = (long)Math.pow(n, p);
        return result;
    }

}


public class ExceptionHandling {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int [] nArray = new int[5];
        int [] pArray = new int[5];

        MyCalculator myCalculator = new MyCalculator();



        for (int i = 0; i < 5; i++){
            nArray[i] = scanner.nextInt();
            pArray[i] = scanner.nextInt();


        }

        for (int i = 0; i < 5; i++){
            try{
                if( nArray[i] < 0 || pArray[i] < 0){
                    throw new UnsupportedOperationException();
                }
                else if (nArray[i] == 0 && pArray[i] == 0){
                    throw new Exception();
                }
                else
                    System.out.println(myCalculator.power(nArray[i], pArray[i]));

            }
            catch(UnsupportedOperationException e){
                System.out.println("java.lang.Exception: n or p should not be negative.");
            }
            catch(Exception e){
                System.out.println("java.lang.Exception: n and p should not be zero.");
            }
        }



    }
}
