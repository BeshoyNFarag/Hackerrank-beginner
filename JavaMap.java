import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;


public class JavaMap {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<>();
        ArrayList<String> names = new ArrayList<>();
        String name;

        int queries = scanner.nextInt();
        scanner.nextLine();
        String key;
        int value;

        while (queries > 0) {
            key = scanner.nextLine();
            value = scanner.nextInt();
            scanner.nextLine();
            phoneBook.put(key, value);
            queries--;
        }




       while (scanner.hasNextLine()) {
            name = scanner.nextLine();
            names.add(name);
        }

        for(String n : names){
            if (phoneBook.containsKey(n)){
                System.out.println(n + "=" + phoneBook.get(n));
            }
            else
                System.out.println("Not found");

        }


    }
}
