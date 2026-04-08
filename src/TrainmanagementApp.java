import java.util.Scanner;
import java.util.regex.Pattern;

public class TrainmanagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        boolean trainValid = Pattern.matches("TRN-\\d{4}", trainId);
        boolean cargoValid = Pattern.matches("PET-[A-Z]{2}", cargoCode);

        if (trainValid) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID (Format: TRN-1234)");
        }

        if (cargoValid) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code (Format: PET-AB)");
        }

        sc.close();
    }
}