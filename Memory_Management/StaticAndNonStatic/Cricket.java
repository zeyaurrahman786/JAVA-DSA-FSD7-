package Memory_Management.StaticAndNonStaticMethods;

public class Cricket 
{
    int Virat;
    int Gill;

    Cricket(int x, int y) 
    { // Parameteries Construction
        Virat = x;
        Gill = y;
    }

    public static void main(String[] args) 
    {
        India();
        Cricket2.SriLanka();

    }

    static void India() 
    {
        Cricket x = new Cricket(88, 92);
        System.out.println("Run Of Virat Kohli :- " + x.Virat);
        System.out.println("Run Of Subhman GIll :- " + x.Gill);
    }
}

class Cricket2 
{
    int Siraj;
    int Shami;

    Cricket2(int a, int b) 
    {
        Siraj = a;
        Shami = b;
    }

    static void SriLanka() 
    {
        Cricket2 x = new Cricket2(3, 5);
        System.out.println("Wicket Of Mohammed Siraj :- " + x.Siraj);
        System.out.println("Wicket Of Mohammed Shami :- " + x.Shami);
    }
}