import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Access element by index
        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if (index >= 0 && index < arr.length) {
            System.out.println("Element at index " + index + " = " + arr[index]);
        } else {
            System.out.println("Invalid Index");
        }

        // Searching
        System.out.print("Enter value to search: ");
        int value = sc.nextInt();

        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                pos = i;
                break;
            }
        }

        System.out.println("Index of " + value + " = " + pos);
        System.out.println("Contains " + value + "? " + (pos != -1));

        // Size Information
        System.out.println("Size = " + arr.length);

        // Forward Traversal
        System.out.println("\nForward Traversal:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Reverse Traversal
        System.out.println("\nReverse Traversal:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        // Sorting
        Arrays.sort(arr);
        System.out.println("\nAfter Sorting: " + Arrays.toString(arr));

        sc.close();
    }
}