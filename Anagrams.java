import java.util.Scanner;
import java.util.Arrays;


public class Anagrams {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        char [] sortedInput = input1.toLowerCase().toCharArray();
        char [] sortedInput2 = input2.toLowerCase().toCharArray();

        Arrays.sort(sortedInput);
        Arrays.sort(sortedInput2);


        if(input1.length() == input2.length() && Arrays.equals(sortedInput, sortedInput2))  {

            System.out.println("Anagram");
        }
        else
            System.out.println("Not Anagram");


    }

}

