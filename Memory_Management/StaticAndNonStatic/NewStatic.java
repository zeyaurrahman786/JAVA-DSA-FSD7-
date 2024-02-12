// package Memory_Management.StaticAndNonStaticMethods;

public class NewStatic
{
    int age;   // instance variable
    String name;
    String clg;

    NewStatic(int x, String y, String z)  // Parameteries Construction
    {
        age = x;
        name = y;
        clg = z;
    }
    public static void main(String[] args) 
    {
        NewStatic Huzaifa = new NewStatic(21,"Huzaifa","IPER");
        NewStatic Shivani = new NewStatic(25,"Shivani","NRI");
        NewStatic Aman = new NewStatic(20,"Aman","CT");

        System.out.println(Huzaifa.age);
        System.out.println(Huzaifa.name);
        System.out.println(Huzaifa.clg);
        System.out.println(Shivani.age);
        System.out.println(Shivani.name);
        System.out.println(Shivani.clg);
        System.out.println(Aman.age);
        System.out.println(Aman.name);
        System.out.println(Aman.clg);
    } 
     
}



class Ct
{
    public static void main(String[] args) 
    {
        
    }
    Ct()
    {

    }
    class tc{
        tc(){

        }
    }
}