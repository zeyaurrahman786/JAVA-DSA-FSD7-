// 19. Write a program to input marks of five subjects Physics, Chemistry, Biology, 
// Mathematics and Computer. Calculate percentage and grade according to following: 
// • Percentage >= 90% : Grade A 
// • Percentage >= 80% : Grade B 
// • Percentage >= 70% : Grade C 
// • Percentage >= 60% : Grade D 
// • Percentage >= 40% : Grade E 
// • Percentage < 40% : Grade F


public class q19 {
   public static void main(String[] args) {
        int Physics=90;
        int Chemistry=90;
        int Biology=90;
        int Maths=90;
        int Computer=90;
        int total=Physics+Chemistry+Biology+Maths+Computer;
        System.out.println("Total mark : " + total);
        int percentage= total/5;
        if(percentage>=90)
        {
            System.out.println("Grade A");
        }
        else if(percentage>=80)
        {
            System.out.println("Grade B");
        }

        else if(percentage>=70)
        {
            System.out.println("Grade C");
        }

        else if(percentage>=60)
        {
            System.out.println("Grade D");
        }

        else if(percentage>=40)
        {
            System.out.println("Grade E");
        }

        else if(percentage<40)
        {
            System.out.println("Grade F");
        }
   } 
}
