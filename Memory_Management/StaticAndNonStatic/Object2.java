package Memory_Management.StaticAndNonStaticMethods;

public class Object2 
{
    static int m1()
    {
        return 75;
    }

    int m2()
    {
        return 95;
    }

    public static void main(String[] args) {
        Object2 Obj1 = new Object2();
        Object2 x = new Object2();
        m1();
        Obj1.m2();
        Object2.b y = Obj1.new b();
        Object2.b.c z = y.new c();
        h a = new h();
        h.k b = a.new k();
        System.out.println();
    }

    class b
    {
        class c
        {

        }
    }
}

class h
{
    int k = 2;
    class k
    {

    }
}
