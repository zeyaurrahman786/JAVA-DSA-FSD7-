// 16. Write a program to check whether the triangle is equilateral, isosceles or scalene triangle.


public class q16 {
    public static void main(String[] args) {
        int x = 5;  // x = first side of traingle
        int y = 5;  // y = second side of traingle
        int z = 5;  // z = third side of traingle
        if(x==y && y==z && x==z)
        {
            System.out.println("It is an Equilateral Triangle");
        }
        else if(x==y || y==z || x==z)
        {
            System.out.println("It is an Isosceles Traingle");
        }
        else
        {
            System.out.println("It is an Scalene Traingle");
        }
    }
}
