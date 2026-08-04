public class FirstOccurence {

    // Function to find first occurrence
    public static int firstOccurrence(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Function to find last occurrence
    public static int lastOccurrence(int[] numbers, int key) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {12, 34, 56, 78, 56, 90, 21};
        int key = 56;

        System.out.println("First Occurrence: " +
                firstOccurrence(numbers, key));

        System.out.println("Last Occurrence: " +
                lastOccurrence(numbers, key));
    }
}