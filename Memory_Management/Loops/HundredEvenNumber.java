import java.util.Scanner;

public class HundredEvenNumber {
    public static void main(String[] args) {
        {
            try (Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt();
                for(int i=1;i<=n;i++)
                {
                    if(i%2==0)
                    {
                        System.out.println(i);
   
                    }
                    
                }
            }
        }
    }
}
