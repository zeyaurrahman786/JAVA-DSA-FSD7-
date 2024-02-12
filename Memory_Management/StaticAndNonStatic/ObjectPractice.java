package Memory_Management.StaticAndNonStaticMethods;

public class ObjectPractice 
{
    String State;
    String Capital;

    ObjectPractice (String x, String y){
        State = x;
        Capital = y;
}
    public static void main(String[] args) 
    {
       ObjectPractice State = new ObjectPractice("Madhya Pradesh","Patna");  
       ObjectPractice Capital = new ObjectPractice("Bihar","Bhopal");
       System.out.println(State.State);
       System.out.println(Capital.Capital);
       System.out.println(Capital.State);
       System.out.println(State.Capital);
    }
}


