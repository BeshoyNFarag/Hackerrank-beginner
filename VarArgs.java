/*
* 1
2
3
4
5
6
*
*
*
* 1+2=3
    1+2+3=6
    1+2+3+4+5=15
    1+2+3+4+5+6=21
*
* */


import java.util.Scanner;

public class VarArgs {
    public void add(int ... numbers){
        StringBuffer sb = new StringBuffer();
        int sum = numbers[0];
        String conc = numbers[0] + "+";
        for(int i = 1; i < 6; i++){

            sum += numbers[i];
            conc = conc + numbers[i] + "+";
            sb.append(conc);
            sb.deleteCharAt(conc.length()-1);

            if(i!= 3){
                System.out.println(sb +"="+ sum);
            }

            sb.delete(0,conc.length()-1);
        }

    }


    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        VarArgs varArgs = new VarArgs();

        int n1, n2 , n3 ,n4, n5, n6;
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        n4 = scanner.nextInt();
        n5 = scanner.nextInt();
        n6 = scanner.nextInt();
        varArgs.add(n1, n2, n3, n4, n5, n6);




    }
}
