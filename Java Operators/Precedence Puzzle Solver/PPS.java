package pps;

/*@author aranc */
public class PPS {
    public static void main(String[] args) {
        int l = 5;
        int e = 10;

        // Predicted Result: true
        
        boolean result1 = l++ + e > 10;
        System.out.println("Puzzle 1 Result: " + result1);
        
        int a = 4;
        int n = 8;

        // Predicted Result: False
        
        boolean result2 = ++a * 2 < 10 && n-- > 5;
        System.out.println("Puzzle 2 Result: " + result2);
        
        int h = 12;
        int i = 5;
        
        // Predicted Result: True
        
        boolean result3 = !(h > i * 2 && i == 5) || h % i == 2;
        System.out.println("Puzzle 3 Result: " + result3);
    }
    
}
