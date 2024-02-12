// 11. Write a program to input week number and print week day.

public class q11 {
    public static void main(String[] args) {
        int WeekNum = 7;
        if (WeekNum == 1) {
            System.out.println("Monday");
        } else if (WeekNum == 2) {
            System.out.println("Tuesday");
        } else if (WeekNum == 3) {
            System.out.println("Wednesday");
        } else if (WeekNum == 4) {
            System.out.println("Thrusday");
        } else if (WeekNum == 5) {
            System.out.println("Friday");
        } else if (WeekNum == 6) {
            System.out.println("Satuday");
        } else if (WeekNum == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
