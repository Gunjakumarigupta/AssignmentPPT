package PPTAssignment3CoreJava;

 class colour {
    void painting(){
        System.out.println("Colours are use in painting");
    }
}
class pink extends colour{
    void painting(){
        System.out.println("Colours are beautiful");
    }
}
class green extends colour{
    void painting(){
        System.out.println("Trees colour's are green");
    }
}
public class Q_2 {
    public static void main(String[] args) {
        pink p = new pink();
        p.painting();
        green g = new green();
        g.painting();
        colour c = new colour();
        c.painting();
    }
}

