import java.util.Scanner;

public class TrainmanagementApp {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("===============================================\n");

        String[] bogieIds = {"B101", "B205", "B309", "B402", "B550"};

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\nBogie ID Found ✅");
        } else {
            System.out.println("\nBogie ID Not Found ❌");
        }

        System.out.println("\nUC18 search completed...");
        sc.close();
    }
}