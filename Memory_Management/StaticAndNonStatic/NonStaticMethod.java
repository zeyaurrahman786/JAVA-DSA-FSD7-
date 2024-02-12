package Memory_Management.StaticAndNonStaticMethods;

public class NonStaticMethod 
{

NonStaticMethod()
{
    System.out.println("Constructor");
}

    public static void main(String[] args)
    {
      new NonStaticMethod();
    }
}
