import java.util.Scanner;

public class Readfullname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your gender: ");
        String gender = sc.next();
        System.out.println("Hello "+ name);
        sc.close();

    }
}
