import java.util.Scanner;

public class Addtwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum:" + (a+b));
        sc.close();
    }
}
