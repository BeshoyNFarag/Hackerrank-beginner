import java.util.Scanner;
import java.util.ArrayList;

public class List {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < size; i++){
            list.add(i,scanner.nextInt());  ;
        }

        int queries = scanner.nextInt();

        ArrayList<String> queriesList = new ArrayList<>();
        String input = scanner.nextLine();

        while(queries > 0 ){

            if(input.equals("Insert")){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                list.add(x,y);
                queries --;

            }
            else if(input.equals("Delete")){
                int x = scanner.nextInt();
                list.remove(0);
                queries --;

            }
            input = scanner.nextLine();




        }

        for(int x : list){
            System.out.print(x+" ");


        }

    }
}
