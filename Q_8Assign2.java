package PPTAssignmentCoreJava2;

import java.util.Arrays;
import java.util.Scanner;

public class Q_8Assign2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
    }
}
