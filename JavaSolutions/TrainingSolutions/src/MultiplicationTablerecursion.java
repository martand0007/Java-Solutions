import java.util.Scanner;

public class MultiplicationTablerecursion {

    static void printTable(int n, int i) {
        if (i > 10) {   // Base Case
            return;
        }

        System.out.println(n + " x " + i + " = " + (n * i));

        printTable(n, i + 1);   // Recursive Call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printTable(n, 1);

        sc.close();
    }
}