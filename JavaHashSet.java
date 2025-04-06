/*
* we need to take the user input and split it into its componenets
* we then take another line from the user and we split it
*
* */


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class JavaHashSet {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Set<String> userList = new HashSet<String>();
        int queries = 0;
        queries = scanner.nextInt(); scanner.nextLine();
        int [] uniqueness = new int[queries];


        for(int i = 0; i < queries; i++){
            userList.add(scanner.nextLine().split(" ")[1]);
            uniqueness[i] =  userList.size();

        }
        for (int i = 0; i < queries; i++){
            System.out.println(uniqueness[i]);
        }





    }
}
