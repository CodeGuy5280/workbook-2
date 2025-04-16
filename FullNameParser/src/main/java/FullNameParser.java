import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter your full name (first last or first middle last): ");
        String fullName = in.nextLine().trim();  // Trim leading/trailing spaces

        // Split on one or more spaces
        String[] nameParts = fullName.split(" ");


        // Parse name
        if (nameParts.length == 2) {
            String first = nameParts[0];
            String last = nameParts[1];

            System.out.println("First name: " + first);
            System.out.println("Last name: " + last);

        } else if (nameParts.length == 3) {
            String first = nameParts[0];
            String middle = nameParts[1];
            String last = nameParts[2];

            System.out.println("First name: " + first);
            System.out.println("Middle name: " + middle);
            System.out.println("Last name: " + last);

        } else {
            System.out.println("Invalid name format. Please enter either 'first last' or 'first middle last'.");
        }

        in.close();
    }
}
