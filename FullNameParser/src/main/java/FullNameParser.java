import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your full name (first last or first middle last): ");
        String fullName = in.nextLine().trim();

        String[] nameParts = fullName.split(" ");

        if (nameParts.length == 2) {
            String firstName = nameParts[0];
            String lastName = nameParts[1];

            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);

        } else if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Last Name: " + lastName);
        }else {
            System.out.println("Invalid name entered");
        }


    }
}
