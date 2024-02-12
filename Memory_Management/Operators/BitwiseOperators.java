

public class BitwiseOperators {
    public static void main(String[] args) {
        // int x = 72;
        // int y = 122;
        // int z = x|y;
        // System.out.println(z);

        // int x = 72;
        // int y = 122;
        // int z = x&y;
        // System.out.println(z); 

        // int x = 107;
        // int y = 113;
        // int z = x^y;
        // System.out.println(z);

        // int x = 0b10000000000000000000000000000011;  // -2147483645
         // System.out.println(x);

        // int x = 0b00000000000000000000000000000011; // 3
         // System.out.println(x);

        // int x = 0b00000000000000000000000000000111;   // 7
        // System.out.println(x);

        //    int x = 0b10000000000000000000000000001111;   // -2147483633
        //    int y = 0b11111111111111111111111111111000;  // -8
        // System.out.println(x);
        // System.out.println(y);

        // int x = 0b10000000000000000000000000000011;
        // int y = x<<31;
        // System.out.println(y);   // -2147483648

        // int x = 0b00000000000000000000000000000011;
        // int y = x<<64;
        // System.out.println(y);   // 3 

        // long x = 0b0000000000000000000000000000000000000000000000000000000000000001;
        // long y = x<<63;
        // System.out.println(y);  // -9223372036854775808


        // long x = 0b0000000000000000000000000000000000000000000000000000000000000001;
        // long y = x<<64;
        // System.out.println(y);  //  1

        // int x = -3;
        // int y = x<<1;
        // System.out.println(y);  // -6

        // int x = -5;
        // int y = x<<5;
        // System.out.println(y); // -160

        // int x = -5;
        // int y = x<<29;            // ( << Left Shift)
        // System.out.println(y);  // 1610612736

        // int x = 5;
        // int y = x>>5;             // (>> Right Shift)
        // System.out.println(y);  // 0

        // int x = 5;
        // int y = x>>32;
        // System.out.println(y);  // 5 (Because of recyclic)

        // int x = 5;
        // int y = x>>33;
        // System.out.println(y);  // 2

        // int x = -5;
        // int y = x>>0;
        // System.out.println(y);  // -5

        // int x = -5;
        // int y = x>>1;
        // System.out.println(y);   // -3

        // int x = -5;
        // int y = x>>2;
        // System.out.println(y);  // -2

        // int x = -5;
        // int y = x>>3;
        // System.out.println(y);  // -1

        // int x = -5;
        // int y = x>>4;
        // System.out.println(y);   // -1

        // int x = -5;
        // int y = x>>5;
        // System.out.println(y);  // -1

        // int x = -5;
        // int y = x>>29;
        // System.out.println(y);  // -1

        // int x = -5;
        // int y = x>>31;
        // System.out.println(y);  // -1

        // int x = -5;
        // int y = x>>32;
        // System.out.println(y);  // 5

        // int x = -5;
        // int y = x>>33;    
        // System.out.println(y);  // -3

        int x = -5;
        int y = x>>34;
        System.out.println(y);  // -2

        // int x = 0b11111111111111111111111111111011;
        // int y = x>>21;
        // System.out.println(y);  // -1

        // int x = 5;
        // int y = x>>>2;      // (>>> Unsigned Right Shift)
        // System.out.println(y);  // 1

        // int x = -5;
        // int y = x>>>2;
        // System.out.println(y);   // 1073741822

        // int h = 5;
        // System.out.println(~(h));  // -6

        // int h = -5;
        // System.out.println(~(h));  // 4    // (~ Bitwise Complement)


    }
}
