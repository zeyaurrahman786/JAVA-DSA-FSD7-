package Memory_Management.StaticAndNonStaticMethods;

public class function 
{

    // return_data_type       name_of_function()
    // {
    //     return return data;
    // }

        static double Jio()
        {
            return 2.2;
        }

    public static void main(String[] args) 
    {
        double x = Jio();
        int y = Airtel();
        System.out.println(x);
        System.out.println(y);
        System.out.println(Jio());
        System.out.println(Airtel());
    }

    static int Airtel()
        {
            return 129;
        }

}
