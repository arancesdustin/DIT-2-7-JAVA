package unit.casting.converter;

/*@author aranc */
public class UnitCastingConverter {
   public static void main(String[] args) {
        double totalCenti = 295.21;
        
        int wholeMeters = (int) (totalCenti / 100);
        double remainingCenti = totalCenti % 100;
        
        System.out.println("--- Unit Conversion Summary ---");
        System.out.println("Total Centimeters: " + totalCenti + " cm");
        System.out.println("Equivalent Whole Meters: " + wholeMeters + " m");
        System.out.println("Remaining Centimeters: " + remainingCenti + " cm");
        System.out.println();
        
        int baseSteps = 1500;
        double widenedSteps = baseSteps;
        
        System.out.println("--- Implicit Widening Example ---");
        System.out.println("Original int steps: " + baseSteps);
        System.out.println("Widened double steps: " + widenedSteps);
        System.out.println();
        
        double preciseMeasurement = 99.99;
        int truncatedMeasurement = (int) preciseMeasurement;
        
        System.out.println("--- Explicit Narrowing Example ---");
        System.out.println("Original double value: " + preciseMeasurement);
        System.out.println("Narrowed int value (after cast): " + truncatedMeasurement);
    }
    
}
