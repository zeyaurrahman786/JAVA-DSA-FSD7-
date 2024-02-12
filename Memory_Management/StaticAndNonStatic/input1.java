import java.util.Scanner;  // import java.util.*;   // * -> Astric (All Class ko access karta hai)

public class input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();        
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Enter your marks : ");
        float marks = sc.nextFloat();
        System.out.println("Your name is : " + name);
        System.out.println("Your age is : " + age);
        System.out.println("Your marks is : " + marks);
    }
}
