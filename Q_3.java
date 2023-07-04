package PPTAssignment3CoreJava;
class Shape{
    void drawing(){
        System.out.println("It is drawing class.");
    }
}
class Rectangle extends Shape{
    void drawing(){
        System.out.println("drawing rectangle shape of match box.");
    }
}
class Circle extends Shape{
    void drawing(){
        System.out.println("drawing circle shape of sun.");
    }
}
public class Q_3 {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.drawing();
         s = new Circle();
        s.drawing();
    }
}
