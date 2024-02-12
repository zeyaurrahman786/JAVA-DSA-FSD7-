// 1. Write a program to find maximum between two numbers.

public class q1 {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 35;
        if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
        // String U = (num1 < num2) ? "num1 is greater than y" : (num1 < y) ? "num1 is less than y" : "num1 is equal to y";
        // System.out.println(U);
    }
}
