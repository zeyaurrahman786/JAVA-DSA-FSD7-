package Memory_Management.StaticAndNonStaticMethods;

public class Bhopal 
{
    int x = 90;
    void School()
    {
        System.out.println("School");
    }

    public static void main(String[] args) 
    {
        Bhopal ref = new Bhopal();
        System.out.println(ref.x);
        GandhiNagar ref2 = ref.new GandhiNagar();
        System.out.println(ref2.y);
        RoyalMarket ref3 = ref.new RoyalMarket();
        System.out.println(ref3.z);
        
    }

    class GandhiNagar 
    {
       int y = 80;
       void B_TECH()
       {
        System.out.println("B_TECH");
       }
    }

    class RoyalMarket
    {
        int z = 70;
        void Diploma ()
        {
            System.out.println("Diploma");
        }
    }
}
