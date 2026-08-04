import java.util.Scanner;

public class CharBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = {'A', 'C', 'E', 'G', 'I', 'K', 'M'};

        System.out.print("Enter character to search: ");
        char key = sc.next().charAt(0);

        int low = 0, high = arr.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (index != -1)
            System.out.println("Character found at index " + index);
        else
            System.out.println("Character not found");

        sc.close();
    }
}