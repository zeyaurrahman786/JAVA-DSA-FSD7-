// 18. Write a program to calculate profit or loss.


public class q18 {
    public static void main(String[] args) {
        int x = 1000;      // x = cost price
        int y = 500;      // y = selling price
        if(x<y)
        {
            System.out.println("Profit = " + (y-x) );
        }
        else if(x>y)
        {
            System.out.println("Loss = " + (x-y));
        }
        else
        {
            System.out.println("No Profit No Loss");
        }
    }
}
