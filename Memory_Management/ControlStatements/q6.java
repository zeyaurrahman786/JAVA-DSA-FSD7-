// 6. write a program to check whether a year is leap year or not.

public class q6
{ 
    public static void main(String[] args) {
        int Year = 2022;
        if(Year%400==0)
        {
            System.out.println("It is a leap year");
        } 
        else if(Year%100==0)
        {
            System.out.println("Not a leap year");
        } 
        else if(Year%4==0)
        {
            System.out.println("It is a leap year");
        } 
        else
        {
            System.out.println("Not a leap year");
        }

        // Ternary Operator -> Condition ? Expression1 : Expression2;
        // int Year = 2024;
        // String U = Year % 4 == 0 ? Year % 100 != 0 ? "It is a leap year" : Year % 400 == 0 ? "It is a leap year " : "Not a leap year" : "Not a leap year";
        // System.out.println(U);
    }
}