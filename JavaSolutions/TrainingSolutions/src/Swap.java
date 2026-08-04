public class Swap {
    public static void main(String[] args) {
        int a = 90;
        int b = 80;
        System.out.println("Before: a= " + a + " b = " + b);
        a = a+b;
        b = a-b;
        a = a - b;

        System.out.println("After: a = " + a + " b = " + b);

    }
}
