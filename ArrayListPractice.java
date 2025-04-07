
import java.util.Scanner;
import java.util.ArrayList;




public class ArrayListPractice {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
        int lines = scanner.nextInt(); scanner.nextLine();
        int [] [] arrays = new int [lines] [];
        int intInLine;
        int queries;
        int row, column;

        for (int i = 0; i < lines; i++) {
            intInLine = scanner.nextInt();
            arrays[i] = new int[intInLine];
            for (int j = 0; j < intInLine; j++) {
                arrays[i][j] = scanner.nextInt();
            }
        }


        for( int [] n  : arrays ){


            ArrayList<Integer> list = new ArrayList<>();
            for(int x : n ){

                list.add(x);
            }
            numbers.add(list);

        }
        queries = scanner.nextInt();
        scanner.nextLine();
        while(queries > 0){
            row = scanner.nextInt();
            column = scanner.nextInt();

            try{

                System.out.println(numbers.get(row-1).get(column-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
            queries--;


        }


    }
}
