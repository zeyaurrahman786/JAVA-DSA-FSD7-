package Memory_Management.StaticAndNonStaticMethods;

public class StaticFunction 
{

    static int score(int M, int P, int C, int H, int E)
    {
        int ans = M+P+C+H+E;
        return ans;
    }

    public static void main(String[] args) 
    {
        int M = 65;
        int P = 75;
        int C = 90;
        int H = 95;
        int E = 95;
        int ans = score(M,P,C,H,E);
        System.out.println(ans);
    }
}
