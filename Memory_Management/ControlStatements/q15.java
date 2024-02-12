// 15. Write a program to input all sides of a triangle and check whether triangle is valid or not.


public class q15 {
    public static void main(String[] args) {
        int x = 2;  // x = first side of traingle
        int y = 9;  // y = second side of traingle
        int z = 8;  // z = third side of traingle

        if((x+y)>=z)
        {
            System.out.println("It is valid traingle.");
        }
        else if((y+z)>=x)
        {
            System.out.println("It is a valid traingle.");
        }
        else if((x+z)>=y)
        {
            System.out.println("It is a valid traingle.");
        }
        else 
        {
            System.out.println("It is not a valid traingle.");
        }
    }
}
