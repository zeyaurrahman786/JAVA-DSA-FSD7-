import java.util.Scanner;

public class HollowRightAngledTriangle
 {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++)
             {
                if (j == 1 || j == n || i == 1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
