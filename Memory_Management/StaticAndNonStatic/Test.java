package Memory_Management;

public class Test 
{
    static public int g()
    {
        return 79;
    }
    public static void main(String[] args) 
    {
        Test x = new Test();
        Test.A y = x.new A();
        Test.A.C z = y.new C();
        System.out.println(y.j);
        y.j = 80;
        System.out.println(y.j);
        z.Zeyaur();
        System.out.println();
        Test.g();
        D k = new D();
        System.out.println(k.g);
        D.E a = k.new E();
    }

    class A
    {
        int j = 90;
        class C
        {
            double Zeyaur() 
            {
                int h = 67;
                System.out.println(h);
                // Zeyaur();
                return 90.9;
            }
        }
    }

}

class D
{
    float g = 90.9f;

    class E
    {
        
    }
}