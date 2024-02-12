package Memory_Management.StaticAndNonStaticMethods;

public class Static 
{
    public static void main(String[] args) 
    {
         
        System.out.println("This is main of Static");
        boolean x = Huzaifa();
        int b = Static1.Shivani();
        System.out.println(b);
        System.out.println(x);
    }
    static boolean Huzaifa()
    {
        return true;
    }
}

class Static1
{
    public static void main(String[] args) 
    {
        System.out.println("This is the main of Static1");
        Shivani();
    }
    static int Shivani()
    {
        int s = 90;
        System.out.println(s);
        return 78;
    }
}
