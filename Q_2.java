package PPtAssignment4CoreJava;

// Abstract method
abstract class Colour{
   abstract void flower();
   abstract void tree();
}
class Colours extends Colour{
    void flower(){
        System.out.println("Roses are red.");
    }
    void tree(){
        System.out.println("Trees are green.");
    }
}
public class Q_2 {
    static int sum(int a, int b){
        return a+b;
    }
    static int multiply(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Colour c = new Colours();
        c.flower();
        c.tree();
        System.out.println("Sum :"+sum(10,42));
        System.out.println("Product :"+multiply(10,4));
    }
}
