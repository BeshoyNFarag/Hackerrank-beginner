import java.io.*;
import java.util.*;

class Arithmetic{

    public Arithmetic(){
        System.out.println("My superclass is: Arithmetic");
    }

    public int add (int n1, int n2){
        int result = n1 + n2;
        return result;
    }

}

class Adder extends Arithmetic{
    public Adder(){
        System.out.print("42 13 20");
    }


}



public class Inheritance2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Adder obj = new Adder();
        int n1=0;
        int n2=0;
        obj.add( n1,  n2);
    }
}