public class Conversion {
    public static void main(String[] args) {
        char ch = 'Q';

        // Character to ASCII
        int ascii = (int) ch;

        // ASCII back to Character
        char newCh = (char) ascii;

        System.out.println("Character = " + ch);
        System.out.println("ASCII = " + ascii);
        System.out.println("Character Again = " + newCh);
    }
}
//public class ASCIIToChar {
   // public static void main(String[] args) {
        //int ascii = 81;

       // char ch = (char) ascii;

        //System.out.println("ASCII Value = " + ascii);
      //  System.out.println("Character = " + ch);
   // }
//}