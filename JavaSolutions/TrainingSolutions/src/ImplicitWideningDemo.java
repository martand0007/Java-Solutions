public class ImplicitWideningDemo {
    public static void main(String[] args) {
        int i = 100;
        double d = i;
        System.out.println("int:"+ i);
        System.out.println("double(widened):"+ d);
    }
}
