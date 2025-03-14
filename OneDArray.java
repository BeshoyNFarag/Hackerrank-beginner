import java.util.Scanner;


public class OneDArray {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] array =  new int[size];

        for(int i = 0 ; i < size; i++){
            array[i] = scanner.nextInt();
        }
        for(int i =0 ; i < size; i++){
            System.out.println(array[i]);

        }
    }
}
