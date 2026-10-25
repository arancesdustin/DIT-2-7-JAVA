package sasm;

/*@author aranc */
import java.util.Arrays;

public class SASM {
   public static void main(String[] args) {
        int[] scores = {85, 92, 78, 90, 65, 88, 95, 72};
        int target = 90;

        int foundIndex = -1;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Linear Search: Target " + target + " found at index " + foundIndex + ".");
        } else {
            System.out.println("Linear Search: Target " + target + " not found in the array[cite: 20].");
        }

        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("\nOriginal Array: " + Arrays.toString(scores));
        System.out.println("Sorted Copy:    " + Arrays.toString(sortedScores));
        
        /* Sorting a copy rather than the original array matters because sorting modifies the 
         order of elements in-place. If other parts of a program rely on the original sequence 
         such as maintaining historical entry order, corresponding index associations with another 
         parallel dataset, or performing a linear search tied to original positions, mutating the 
         original array could introduce bugs or alter expected data integrity. Preserving the original 
         array ensures safety when multiple representations of data are needed. 
        */
    }
    
}
