import java.util.Scanner;

public class MixedInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age and salary: ");

        int age = sc.nextInt();
        double salary = sc.nextDouble();

        System.out.printf("Age: %d, Salary: $%.2f\n", age, salary);

        sc.close();
    }
}
