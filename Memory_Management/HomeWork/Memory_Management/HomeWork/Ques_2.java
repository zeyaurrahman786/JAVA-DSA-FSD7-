package Memory_Management.HomeWork;

public class Ques_2 {
    int Volume_of_Cube(int a) {
        int Cube = a * a * a;
        System.out.println(Cube);
        return Cube;
    }

    public static void main(String[] args) {
        int a = 5;
        Ques_2 xy = new Ques_2();
        xy.Volume_of_Cube(a);
    }
}
