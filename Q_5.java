package PPTAssignment3CoreJava;

interface Animal {
    void child();
}
class Cat implements Animal {
    public void child() {
        System.out.println("kitten");
    }
}
class Dog implements Animal {
    public void child() {
        System.out.println("puppy");
    }
}
public class Q_5 {
    public static void main(String[] args){
        Animal a = new Cat();
        a.child();
        a = new Dog();
        a.child();
    }
}