// 20. Write a program to input basic salary of an employee and calculate its Gross salary 
// according to following: 
// • Basic Salary <= 10000 : HRA = 20%, DA = 80% 
// • Basic Salary <= 20000 : HRA = 25%, DA = 90% 
// • Basic Salary >  20000 : HRA = 30%, DA = 95% 


public class q20 {
   public static void main(String[] args) {
        float x = 25000;
        if(x<=10000)
        {
            float gross= (float)(x + x*0.2 + x*0.8);
            System.out.println("Gross salary : " + gross);
        }
        else if(x<=20000)
        {
            float gross= (float)(x + x*0.25 + x*0.9);
            System.out.println("Gross salary : " + gross);
        }
        else if(x>20000)
        {
            float gross=(float)(x+ x*0.3 + x*0.95);
            System.out.println("Gross salary : " + gross);
        } 
        else
        {
            System.out.println("No salary");
        }
   } 
}
