public class TrainmanagementApp {
    public static void main(String[] args) {
        int[] capacities = {60, 40, 80, 50, 70};
        System.out.println("Before Sorting:");
        printArray(capacities);
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - 1 - i; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
        System.out.println("\nAfter Sorting:");
        printArray(capacities);
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}