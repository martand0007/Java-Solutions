import java.util.Scanner;

public class SquareFunction {

    public static void square(int n) {
        System.out.println("Square = " + (n * n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        square(n);

        sc.close();
    }
}
