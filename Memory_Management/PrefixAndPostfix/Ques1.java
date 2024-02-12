public class Ques1 {
    public static void main(String[] args) 
    {

        // int x = 2;
        // int y = 3;
        // System.out.println(x);
        // System.out.println(x++);
        // System.out.println(x);

        // int x = 2;
        // int y = 3;
        // int z = 5;
        // int ans = x + y++ + y +z;
        // System.out.println(ans);

        // int x = 2;
        // int y = 3;
        // int z = 5;
        // int ans = x + y++ + y + z + x++ * x / z++;
        // System.out.println(ans);

        int x = 2;
        int y = 3;
        int z = 5;

        // int ans = x + y++ + y + z + x++ * x / z++;
        int ans1 = x + y-- + y + z + x-- * x / z--;
        // System.out.println(y);
        // System.out.println(x);
        // System.out.println(ans);
        System.out.println(ans1);
        // System.out.println(z);

    }
}
