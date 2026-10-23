package nsp;

/*@author aranc */
public class NSP {
    public static void main(String[] args) {
        int loopBound = 21;

        System.out.println("Number and Square Sequence (1 to " + loopBound + "):");
        
        for (int i = 1; i <= loopBound; i++) {
            
            int square = i * i;
            System.out.println("Number: " + i + " | Squared: " + square);
        }
 
    }
}