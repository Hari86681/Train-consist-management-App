import java.util.Scanner;

public class TrainmanagementApp {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("===============================================\n");

        String[] bogieIds = {"B101", "B205", "B309", "B402", "B550"};

        System.out.print("Available Bogie IDs: ");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("\nBogie ID Found ✅");
        } else {
            System.out.println("\nBogie ID Not Found ❌");
        }

        System.out.println("\nUC19 search completed...");
        sc.close();
    }
}