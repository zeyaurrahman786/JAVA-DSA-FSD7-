// 14. Write a program to input angles of a triangle and check whether triangle is valid or not.


public class q14 {
    public static void main(String[] args) {
        int firstangle = 60;
        int secondangle = 60;
        int thirdangle = 60;

        if(firstangle+secondangle+thirdangle==180)
        {
            System.out.println("It is a valid traingle.");
        }
        else
        {
            System.out.println("It is not a valid traingle.");
        }
    }
}
