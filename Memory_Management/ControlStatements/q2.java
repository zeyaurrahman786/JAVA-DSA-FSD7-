// 2. Write a program to find maximum between three numbers.

public class q2 {
    public static void main(String[] args) {
        int num1 = 35;
        int num2 = 25;
        int num3 = 80;
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is greater ");
        }   
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is greater");
        }
        else {
            System.out.println(num3 + " is greater");
        }
        // String U = (x>y) ?  "x is greater than y" : (x<y) ? "x is less than y" : "x is equal to y"; 
        // System.out.println(U);
    }
}
