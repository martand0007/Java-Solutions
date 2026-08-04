public class Prefix {
    public static void main(String[] args) {

        int[] base = {3, 7, 2, 9, 5, 1, 4, 8, 6, 10};

        int[] prefix = new int[base.length];
        prefix[0] = base[0];

        for (int i = 1; i < base.length; i++) {
            prefix[i] = prefix[i - 1] + base[i];
        }

        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}