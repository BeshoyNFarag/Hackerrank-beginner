import java.util.Scanner;
import java.util.ArrayList;

public class DataTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int queries = scanner.nextInt();
        scanner.nextLine();  // Consume the newline left by nextInt()

        // Read the queries into the list
        for (int i = 0; i < queries; i++) {
            String num = scanner.nextLine();
            list.add(num);
        }

        // Process each number in the list
        for (int i = 0; i < list.size(); i++) {
            String numStr = list.get(i);

            try {
                long num = Long.parseLong(numStr);  // Parse the string as a long
                boolean fitInAny = false;
                System.out.println(num + " can be fitted in:");

                // Check if the number fits in Byte range
                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {

                    System.out.println("* byte");
                    fitInAny = true;
                }

                // Check if the number fits in Short range
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                    System.out.println("* short");
                    fitInAny = true;
                }

                // Check if the number fits in Int range
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                    fitInAny = true;
                }

                // Check if the number fits in Long range
                if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) {
                    System.out.println("* long");
                    fitInAny = true;
                }

                // If the number does not fit in any of the ranges
                if (!fitInAny) {
                    System.out.printf("%s can't be fitted anywhere.%n", numStr);
                }

            } catch (NumberFormatException e) {
                System.out.printf("%s can't be fitted anywhere.%n", numStr);
            }
        }
        scanner.close();
    }
}
