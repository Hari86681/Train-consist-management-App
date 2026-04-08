import java.util.ArrayList;

public class TrainmanagementApp {
    public static void main(String[] args) {
        ArrayList<String> bogies = new ArrayList<>();

        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("After adding bogies: " + bogies);

        bogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + bogies);

        boolean exists = bogies.contains("Sleeper");
        System.out.println("Is Sleeper present? " + exists);

        System.out.println("Final bogie list: " + bogies);
    }
}