package PPTAssignmentCoreJava2;

public class Q_9Assign2 {
    public static void main(String[] args) {
        String s = "Umbrella";
        boolean ans = false;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'e'){
                ans = true;
            }
        }
        System.out.println("Is 'e' present in Umbrella ?  "+ans);
    }
}
