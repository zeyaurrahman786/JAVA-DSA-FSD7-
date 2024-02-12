// 17. Write a program to find all roots of a quadratic equation.

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter A : ");
            int a=scan.nextInt();

             System.out.println("Enter B : ");
            int b=scan.nextInt();

             System.out.println("Enter C : ");
            int c=scan.nextInt();

            int d= (b*b) - (4*a*c);

            if(d>0)
            {
                double x1= (((-b)+ Math.sqrt(d)) / (2*a));
                System.out.println("First root = " + x1);

                double x2=((-b)- Math.sqrt(d))/(2*a);
                System.out.println("Second root = " + x2);
            }

            else if(d==0)
            {
                double x=(-b)/(2*a);
                System.out.println("Roots are = " + x);
            }
            else if(d<0)
            {
                System.out.println("Root not exists.");
            }
        }
    }
}
