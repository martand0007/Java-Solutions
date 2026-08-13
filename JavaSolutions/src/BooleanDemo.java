public class BooleanDemo {
    public static void main(String[] args) {
        int age=20;
        boolean isAdult = age>18;
        boolean haslicense = true;
        boolean canDrive = isAdult && haslicense;
        System.out.println("canDrive:"+canDrive);
    }
}
