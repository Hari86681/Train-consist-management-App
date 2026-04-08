import java.util.HashMap;
import java.util.Map;

public class TrainmanagementApp {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Sleeper", 72);
        map.put("AC Chair", 60);
        map.put("First Class", 24);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}