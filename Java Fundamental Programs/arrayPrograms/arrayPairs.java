package basicProgramming;

public class arrayPairs {
    public static void printAllPairs(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.println("(" + array[i] + "," + array[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 7, 6, 5};
        printAllPairs(array);
    }
}
