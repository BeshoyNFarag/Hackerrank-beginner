import java.util.Scanner;
import java.util.ArrayList;


//a method that uses Math class and power object to raise n to the power of p
class MyCalculator{
    public long power(int n, int p){
        long result = (long)Math.pow(n, p);
        return result;
    }

}


public class ExceptionHandling {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        //use ArrayList class for flexible storing
        ArrayList<Integer> nValues =  new ArrayList<>();
        ArrayList<Integer> pValues = new ArrayList<>();

        MyCalculator myCalculator = new MyCalculator();

        //take as many input as the user wants with the while loop
        while(scanner.hasNext()){
            nValues.add(scanner.nextInt());
            pValues.add(scanner.nextInt());


            //iterating through the ArrayList

            //the i is set to be less than zero as it will restart itself every time
            //we dont want the for loop to print all the results each time it gets input
            for (int i = 0; i < 1; i++){

                // try many options where each case (if) has a different result
                try{
                    if( nValues.get(i) < 0 || pValues.get(i) < 0){
                        throw new UnsupportedOperationException();

                    }
                    else if (nValues.get(i)== 0 && pValues.get(i) == 0){
                        throw new Exception();
                    }

                    //remove the element after the usage as the i will be always zero
                    else {
                        System.out.println(myCalculator.power(nValues.get(i), pValues.get(i)));
                        nValues.remove(i);
                        pValues.remove(i);
                    }

                }
                //remove the element after the usage as the i will be always zero
                catch(UnsupportedOperationException e){
                    System.out.println("java.lang.Exception: n or p should not be negative.");
                    nValues.remove(i);
                    pValues.remove(i);
                }
                //remove the element after the usage as the i will be always zero
                catch(Exception e){
                    System.out.println("java.lang.Exception: n and p should not be zero.");
                    nValues.remove(i);
                    pValues.remove(i);
                }
            }

        }






    }
}
