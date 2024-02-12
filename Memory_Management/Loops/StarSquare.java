import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            int n = sc.nextInt();
            for (int R = 1; R <= n; R++) 
            {
                for (int C = 1; C <=n; C++) 
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
        
}


