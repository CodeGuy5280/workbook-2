import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First Name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().trim();

        // Last Name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();

        // Middle Name (optional)
        System.out.print("Do you have a middle name? (yes/no): ");
        String hasMiddleName = scanner.nextLine().trim().toLowerCase();
        String middleName = "";
        if (hasMiddleName.equals("yes")) {
            System.out.print("Enter your middle name: ");
            middleName = scanner.nextLine().trim();
        }

        // Suffix (optional)
        System.out.print("Do you have a suffix (e.g., Jr, PhD)? (yes/no): ");
        String hasSuffix = scanner.nextLine().trim().toLowerCase();
        String suffix = "";
        if (hasSuffix.equals("yes")) {
            System.out.print("Enter your suffix: ");
            suffix = scanner.nextLine().trim();
        }

        // Construct Full Name
        String fullName = firstName;
        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }
        fullName += " " + lastName;
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        // Display Full Name
        System.out.println("Your full name is: " + fullName);
            }
        }

