package Operators;

public class AreaOfSquare {

    // return_data_type       name_of_function()
    // {
    //     return return data;
    // }

    static double Area(double x , double y)
    {
        double ans = x*y;
        return ans;
    }

    public static void main(String[] args) 
    {
        double a = 20;
        double b = 30;
        double i = (Area(a,b));
        System.out.println(i);
    }
}
