import java.util.Scanner;
import java.util.ArrayList;

class MyCalculator{
    public long power(int n, int p){
        long result = (long)Math.pow(n, p);
        return result;
    }

}


public class ExceptionHandling {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nValues =  new ArrayList<>();
        ArrayList<Integer> pValues = new ArrayList<>();

        MyCalculator myCalculator = new MyCalculator();


        while(scanner.hasNext()){
            nValues.add(scanner.nextInt());
            pValues.add(scanner.nextInt());

            for (int i = 0; i < 1; i++){
                try{
                    if( nValues.get(i) < 0 || pValues.get(i) < 0){
                        throw new UnsupportedOperationException();

                    }
                    else if (nValues.get(i)== 0 && pValues.get(i) == 0){
                        throw new Exception();
                    }
                    else {
                        System.out.println(myCalculator.power(nValues.get(i), pValues.get(i)));
                        nValues.remove(i);
                        pValues.remove(i);
                    }

                }
                catch(UnsupportedOperationException e){
                    System.out.println("java.lang.Exception: n or p should not be negative.");
                    nValues.remove(i);
                    pValues.remove(i);
                }
                catch(Exception e){
                    System.out.println("java.lang.Exception: n and p should not be zero.");
                    nValues.remove(i);
                    pValues.remove(i);
                }
            }

        }






    }
}
