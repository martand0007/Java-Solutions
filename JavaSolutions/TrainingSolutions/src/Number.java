import java.sql.SQLOutput;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1= sc.nextInt();
        System.out.println(num1);
        int num2 = sc.nextInt();
        System.out.println(num2);
        int num3 = sc.nextInt();
        System.out.println(num3);
        int average = (num1 + num2 + num3)/3;
        System.out.println(average);
    }
}
