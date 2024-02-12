

public class LogicalOperator {
    public static void main(String[] args) {
        int a = 36;
        int b = 36;
        System.out.println((a!=b) && (a<b) && (a<=b) && (b>=a));
        System.out.println(!((a!=b) && (a<b) && (a<=b) && (b>=a)));
    }
}
