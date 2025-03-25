import java.util.Scanner;


public class UsernameChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int inputSize = input.length();
        boolean valid = true;


        for (int i = 0; i < inputSize; i++) {
            if (inputSize < 8) {
                valid = false;
                break;
            }
            else if (Character.isDigit(input.charAt(0))) {

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

