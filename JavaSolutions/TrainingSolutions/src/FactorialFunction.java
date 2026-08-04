import java.util.Scanner;

public class FactorialFunction {

    public static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = factorial(n);

        System.out.println("Factorial = " + fact);

        sc.close();
    }
}
