// 4. Write a program to check whether a number is divisible by 5 and 11 or not.

public class q4 {
    public static void main(String[] args) {
        int num = 22;
        if(num%5==0 && num%11==0){
            System.out.println("Number is divisible by both 5 nad 11");
        }
        if(num%5==0 && num%11!=0){
            System.out.println("Number is divisible by 5 but not by 11");
        }
        if(num%11==0 && num%5!=0){
            System.out.println("Number is divisible by 11 but not 5");
        }
        if(num%5!=0 && num%11!=0) {
            System.out.println("Number is not divisible by 5 nad 11");
        }
    }
}
