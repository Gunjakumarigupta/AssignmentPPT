package PPtAssignment4CoreJava;
interface Animal{
    void eat();
}
class Tiger implements Animal{
    public void eat(){
        System.out.println("Tiger is carnivores.");
    }
}
public class Q_1 {
    public static void main(String[] args) {
        Animal a = new Tiger();
        a.eat();
    }
}
