package ObjectOrientedProgramming;

public class StudentClass 
{
    public static class Student{
        String name;
        int rollno;
        double percent;
    }
    public static void main(String[] args)
    {
        Student x = new Student();
        x.name = "Zeyaur";
        x.rollno = 63;
        x.percent = 85;
        System.out.println(x.name);
        System.out.println(x.rollno);
        System.out.println(x.percent);

        Student y = new Student();
        y.name = "Rahman";
        y.rollno = 64;
        y.percent = 90;
        System.out.println(y.name);
        System.out.println(y.rollno);
        System.out.println(y.percent);
    }
}
