// 8. Write a program to input any alphabet and check whether it is vowel or consonant.


public class q8 {
    public static void main(String[] args) {
        char ch = 'b';
        if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
            System.out.println(ch + " is a vowel.");
        }
        else {
            System.out.println(ch + " is a consonant.");
        }
    }
}
