import java.util.*;
import java.util.stream.*;

public class TrainmanagementApp {

    public static void main(String[] args) {

        List<Integer> bogies = Arrays.asList(50, 60, 70, 80, 90, 100);

        long startLoop = System.nanoTime();

        List<Integer> loopResult = new ArrayList<>();
        for (int b : bogies) {
            if (b > 70) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        long startStream = System.nanoTime();

        List<Integer> streamResult = bogies.stream()
                .filter(b -> b > 70)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        System.out.println("Loop Time: " + loopTime + " ns");
        System.out.println("Stream Time: " + streamTime + " ns");
    }
}