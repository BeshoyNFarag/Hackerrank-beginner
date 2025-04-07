/*
* 5
john tom
john mary
john tom
mary anna
mary anna
*
*1
2
2
3
3
* */


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;


public class JavaHashSet {
    public static void main(String [] args){


        Scanner scanner = new Scanner(System.in);
        Set<ArrayList<String>> sets = new HashSet<>();
        ArrayList<Integer> nums = new ArrayList<>();

        String input;
        String firstName;
        String lastName;
        int namesNumber = scanner.nextInt();scanner.nextLine();


        for(int i = 0; i < namesNumber; i++){
            input = scanner.nextLine();
            firstName = input.split(" ")[0];
            lastName = input.split(" ")[1];
            ArrayList<String> names = new ArrayList<>();
            names.add(firstName);
            names.add(lastName);
            sets.add(names);
            nums.add(sets.size());

        }
        for (int n : nums){
            System.out.println(n);
        }




    }
}
