public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //Character at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
         sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert
        sb.insert(0,'S');
        System.out.println(sb);

        //delete the extra 's'
        sb.delete(0,1);
        System.out.println(sb);
    }
}
