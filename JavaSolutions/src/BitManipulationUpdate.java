import java.util.Scanner;

public class BitManipulationUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int n = 5;
        int pos = 1;
        int bitMask = 1 <<pos;
        if(oper == 1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else if(oper == 0){
            int newBitMask = bitMask;
            int newNumber = bitMask | n;
            System.out.println(newNumber);

        }

    }

}
