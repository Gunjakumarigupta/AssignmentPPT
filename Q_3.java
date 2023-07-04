package PPtAssignment4CoreJava;
interface Sum{
    int calc(int x);
}
public class Q_3 {
    public static void main(String[] args) {
      int b = 4;
      Sum s = (int x) -> x+x;
        System.out.println(s.calc(b));
    }
}
