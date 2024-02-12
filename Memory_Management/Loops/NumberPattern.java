public class NumberPattern 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for (int r = 1, p = 1; r <= n; r++, p += 2) 
        {
            for (int r = 1; r <= n; r++) 
            {
                for (int c = 1; c <= r; c++) 
                {
                    System.out.print(p + " ");
                } 
            }
            System.out.println();
        }
    }

}