import java.util.Scanner;

public class LinearSearchFruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] fruits = {"Apple", "Banana", "Mango", "Orange", "Grapes"};

        System.out.print("Enter fruit to search: ");
        String key = sc.nextLine();

        int index = -1;

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(key)) {
                index = i;
                break;
            }
        }

        if (index != -1)
            System.out.println("Fruit found at index " + index);
        else
            System.out.println("Fruit not found");

        sc.close();
    }
}