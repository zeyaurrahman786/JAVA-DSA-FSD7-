

public class IncrementAndDecrement
 {
    public static void main(String[] args) {
        // int x = 2;
        // System.out.println(x++);    // 2    (Post Increment)
        // System.out.println(x);      // 3

        // int x = 2;
        // System.out.println(++x);   // 3    (Pre Increment)

        // int x = 5;
        // int y = 6;
        // System.out.println(x++ + y++ + x + y);  // 24

        // int x = 5;
        // int y = 6;
        // System.out.println(x + y + x++ + y++ + x + y);   // 35

        // int x = 5;
        // int y = 6;
        // System.out.println(x + x + x++ + y + y++);   // 27

        // int x = 5;
        // int y = 6;
        // System.out.println((x) + (y++) + (y) + (x) + (x++) + (x) + (y++) + (y));   // 49

        // int x = 5;
        // int y = 6;
        // System.out.println(x + y++ + y + x + (x++ + x) + y++ + y);  // 49

        // int x = 2;
        // System.out.println(x-- + x);  // 3  (Post Decrement)

        int x = 2;
        System.out.println(--x + x);  // 2  (Pre Decrement)
    }
}
