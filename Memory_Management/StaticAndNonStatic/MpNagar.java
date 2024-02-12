package Memory_Management.StaticAndNonStaticMethods;

public class MpNagar
{
    
    class Zone1
    {
        String x = "Manohar";
    }

    public static void main(String[] args) 
    {
        MpNagar refrence = new MpNagar();
        Zone1 reference2 = refrence.new Zone1();
        System.out.println(reference2.x);
    }
}
