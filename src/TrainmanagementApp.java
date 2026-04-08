import java.util.HashSet;

public class TrainmanagementApp {
    public static void main(String[] args) {
        HashSet<String> bogieIDs = new HashSet<>();

        bogieIDs.add("B101");
        bogieIDs.add("B102");
        bogieIDs.add("B103");
        bogieIDs.add("B101");
        bogieIDs.add("B102");

        System.out.println(bogieIDs);
    }
}