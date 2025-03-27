import java.util.Scanner;


public class EndofFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineCount = 0;
        String input;

        while(scanner.hasNext()){
            input = scanner.nextLine();
            lineCount ++;
            System.out.println(lineCount +" " +input);
        }

    }
}
