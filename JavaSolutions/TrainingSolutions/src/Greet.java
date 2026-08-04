import java.util.Scanner;

public class Greet {

    public static void greet(String user_name) {
        System.out.println("Good morning " + user_name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        greet(name);

        sc.close();
    }
}
