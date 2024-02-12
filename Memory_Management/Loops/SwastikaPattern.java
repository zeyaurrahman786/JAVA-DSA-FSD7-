import java.util.*;

public class SwastikaPattern {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n/2;
        for (int r = 1; r <= n; r++) 
        {
            for (int c = 1; c <= n; c++) 
            {
                if (c == m + 1 || r == m + 1 || r == 1 && c > m + 1 || c == 1 && r <= m || c == n && r > m + 1|| r == n && c <= m) 
                {
                    System.out.print("* ");
                } else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
