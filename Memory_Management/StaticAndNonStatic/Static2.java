package Memory_Management.StaticAndNonStaticMethods;

public class Static2 
{
    public static void main(String[] args) 
    {
        System.out.println("This is main of Static");
        boolean n = Zeyaur();
        int b = Static3.Rahman();
        System.out.println(b);
        System.out.println(n);
    }
    static boolean Zeyaur()
    {
        return true;
    }
}

class Static3
{
    public static void main(String[] args) 
    {
        System.out.println("This is main of Static3");
        Rahman();
    }
    static int Rahman()
    {
        int x = 85;
        System.out.println(x);
        return 90;
    }
}
