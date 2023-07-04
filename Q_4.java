package PPTAssignment3CoreJava;

public class Q_4 {
    public static void main(String[] args) {
      overloading o = new overloading();
      o.show(20,40);
      o.show(2.4,5.6);
    }
}
class overloading{
    void show(int a, int b)
    {
        System.out.println("This is integer function ");
    }
    void show(double a, double b)
    {
        System.out.println("This is double function ");
    }
}
