package Memory_Management.HomeWork;

public class Ques_1 {
    String State;  // instance varible
    String Capital;

    Ques_1(String x, String y)  // Parameter constructor
    {
        State = x;
        Capital = y; 
    }

    public static void main(String[] args) 
    {
        Ques_1 State1 = new Ques_1("Madhya Pradesh", "Bhopal");
        System.out.println(State1.State);
        System.out.println(State1.Capital);

        Ques_1 State2 = new Ques_1("Bihar", "Patna");
        System.out.println(State2.State);
        System.out.println(State2.Capital);

        Ques_1 State3 = new Ques_1("Uttar Pradesh", "Lucknow");
        System.out.println(State3.State);
        System.out.println(State3.Capital);
    }
}
