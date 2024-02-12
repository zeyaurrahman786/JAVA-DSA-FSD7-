package Memory_Management.StaticAndNonStaticMethods;

public class Object1 
{
    public static void main(String[] args) 
    {
        Object1 Obj1 = new Object1();
        Object2 x = new Object2();
        Object1 y = new Object1();
    }
} 

class Object2
{
    public static void main(String[] args)
    {
        Object2 Obj2 = new Object2();
        Object1 Obj3 = Obj2.new Object1();
    }
    class Object1
    {
        {

        }
    }
}
