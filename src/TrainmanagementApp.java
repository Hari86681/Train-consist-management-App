import java.util.ArrayList;
import java.util.List;


public class TrainmanagementApp {

    /**
     * The main method is the entry point of the Java application.
     * The JVM invokes this method to start program execution.
     *
     * @param args Command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Train Management System!");
        System.out.println("=== Train Consist Management App ===");
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train consist initialized successfully.");
        System.out.println("Application: Train Management System");
        System.out.println("Version: 1.0");
        System.out.println("Initial bogie count: " + trainConsist.size());
        System.out.println("Application started successfully.");
        System.out.println("System is ready for operations...");

    }
}