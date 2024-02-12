// 9. Write a program to input any character and check whether it is alphabet, digit or special character.

public class q9 {
    public static void main(String[] args) {
        char ch = 'a';
        if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
            System.out.println(ch + " is an alphabet character.");
        }
        else if (ch>='0' && ch<='9') {
            System.out.println(ch + " is a digit.");
        }
        else {
            System.out.println(ch + " is a special character.");
        }
    }
}
