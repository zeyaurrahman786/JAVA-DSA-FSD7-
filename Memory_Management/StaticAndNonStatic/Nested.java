package Memory_Management.StaticAndNonStaticMethods;

public class Nested 
{
    public static void main(String[] args) 
    {
        int f = 90;
        System.out.println(f);
        
    }
}

class A
{
    int a = 80;
    static int print()
    {   
        int h = 90;
        System.out.println(h);
        return 90;
    }

    int d()
    {
        System.out.println("i am d");
        return 90;
    }

    class B
    {
        int ba = 80;
        int value()
        {
            System.out.println("I am value");
            return 92;
        }
    }
    
}