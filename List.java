/*
* 5
12 0 1 78 12
2
Insert
5 23
Delete
0

* 0 1 78 12 23
* */


import java.util.Scanner;
import java.util.ArrayList;

public class List{
    public static void main(String [] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int size;
        int queries;
        int insertIndex;
        int insertNumber;
        int deleteIndex;
        String command;
        size = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0 ; i < size ; i++){
            numbers.add(scanner.nextInt());
        }

        queries = scanner.nextInt();


        while(queries >0){
            command = scanner.nextLine();
            if(command.equals("Delete")){
                deleteIndex = scanner.nextInt();
                numbers.remove(deleteIndex);
                queries--;
            }
            else if(command.equals("Insert")){
                insertIndex = scanner.nextInt();
                insertNumber = scanner.nextInt();
                numbers.add(insertIndex, insertNumber);
                queries--;

            }



        }
        for(int n : numbers){
            System.out.print(n + " ");
        }



    }
}
