import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainmanagementApp {
    public static void main(String[] args) {
        List<Bogie> list = new ArrayList<>();

        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("Sleeper", 80));
        list.add(new Bogie("AC Chair", 60));
        list.add(new Bogie("First Class", 24));

        Map<String, List<Bogie>> grouped = list.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b.name + " -> " + b.capacity);
            }
        }
    }
}