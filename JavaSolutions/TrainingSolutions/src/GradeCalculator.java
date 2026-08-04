import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        //Validation
        if (marks < 0 || marks > 100) {
            System.out.println("Absurb input");
        } else {
            if (marks > 90 && marks <= 100) {
                System.out.println("Grade A");
            } else if (marks >= 81) {
                System.out.println("Grade B");
            } else if (marks >= 71) {
                System.out.println("Grade C");
            } else if (marks >= 61) {
                System.out.println("Grade D");
            } else if (marks >= 33) {
                System.out.println("Grade E");
            } else {
                System.out.println("Fail");
            }

            sc.close();
        }
    }
}