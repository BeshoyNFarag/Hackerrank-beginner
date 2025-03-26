import java.util.Scanner;


public class UsernameChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumbers = scanner.nextInt();
        scanner.nextLine();
        String[] usernames = new String[inputNumbers];


        boolean valid = true;


        for (int j = 0; j < inputNumbers; j++) {
            usernames[j] = scanner.nextLine();

        }
        for (int x = 0; x < inputNumbers; x++) {
            String input = usernames[x];
            int inputSize = input.length();


            for (int i = 0; i < inputSize; i++) {
                if (inputSize < 8 || inputSize > 30) {
                    valid = false;
                    break;
                }
                else if (Character.isDigit(input.charAt(0)) || !input.substring(0,1).matches("[A-Za-z0-9]") ) {

                    valid = false;
                    break;
                }
                else if (input.substring(i, i+1 ).matches("[A-Za-z0-9_]") != true) {
                    valid = false;
                    break;

                }

                else {
                    valid = true;

                }



            }
            if(valid) System.out.println("Valid");

            else System.out.println("Invalid");


        }
    }










}

/*
* input
* 8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007
*
* */


