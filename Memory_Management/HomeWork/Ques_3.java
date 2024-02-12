// package Memory_Management.HomeWork;

public class Ques_3 {
    double Area_Of_Triangle(int breadth, int height) {
        double area = (breadth * height) / 2;
        System.out.println(area);
        return area;
    }

    public static void main(String[] args) {
        int breadth = 12;
        int height = 8;
        Ques_3 z = new Ques_3();
        z.Area_Of_Triangle(breadth, height);

    }
}
