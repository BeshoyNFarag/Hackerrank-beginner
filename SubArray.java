import java.util.Scanner;


public class SubArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum =0;
        int size = scanner.nextInt();
        int[] array = new int[size];


        for (int i = 0 ; i < size; i++){
            array[i] = scanner.nextInt();
        }

        for(int i = 0 ; i < size; i++){
            sum = array[i];
            if(sum < 0 ){
                counter ++;

                sum = 0;
            }

            else
                sum =0;



        }
        for(int i = 0; i < size; i ++){
            sum = array[i];
            for(int j = i; j < size; j ++){
                if (j + 1 >= size){
                    break;
                }
                sum += array[j + 1];
                if(sum < 0){
                    counter ++;

                }

            }


        }
        System.out.println(counter );




    }
}