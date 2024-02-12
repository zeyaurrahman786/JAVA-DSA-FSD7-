import java.util.Scanner;

public class StarTriangleUlta {
    public static void main(String[] args)
     {
         try (Scanner sc = new Scanner(System.in)) 
        {
            int n = sc.nextInt();
            for (int R = 1; R <= n; R++) 
            {
                for (int C = 1; C<=(n-R)+1; C++) 
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
