// 7. Write a program to check whether a character is alphabet or not.

public class q7 {
    public static void main(String[] args) {
        char ch = 'A';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
                        
        // if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90))

        {
           System.out.println(ch + " is an alphabet.");
        } 
        else 
        {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}
