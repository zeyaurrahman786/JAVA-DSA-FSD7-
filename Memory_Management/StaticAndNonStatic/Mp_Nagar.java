package Memory_Management;

public class Mp_Nagar 
{
    public static void main(String[] args) 
    {
        Zone1 refrence1 = new Zone1();
        System.out.println(Zone1.x);
        Zone1.x = 90;
        System.out.println(Zone1.x);
        System.out.println(refrence1.y);
        refrence1.y = 67;
        System.out.println(refrence1.y);
    }
}

class Zone1
{
    static int x = 78;
    int y = 90; // instance variable
}