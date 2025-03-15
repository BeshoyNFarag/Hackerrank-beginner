import java.util.Scanner;



public class Loops2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] a = new int[size];
        int [] b = new int[size];
        int [] n = new int[size];
        int result = 0;

        for(int i = 0; i < size; i++){
            a [i] = scanner.nextInt();
            b [i] = scanner.nextInt();
            n [i] = scanner.nextInt();
        }

        for(int i = 0; i < size; i++){
            for(int j = 0; j < n [i]; j++){
                result += (a[i] + (Math.pow(2, j) * b[i])) - a[i];
                System.out.print((result +  a[i]) + " ");

            }
            System.out.println();
            result = 0;
        }


    }

}

