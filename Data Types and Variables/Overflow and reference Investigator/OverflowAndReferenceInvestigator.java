package overflow.and.reference.investigator;

/*@author aranc */
public class OverflowAndReferenceInvestigator {
    public static void main(String[] args) {
        byte maxByte = 127;
        byte overflowedValue = (byte) (maxByte + 1);
        
        System.out.println("--- Primitive Overflow Investigation ---");
        System.out.println("Max byte value: " + maxByte);
        System.out.println("After incrementing by 1 (Overflowed): " + overflowedValue);
        
        String una = new String ("Sup");
        String pangalawa = new String ("Sup");
        String strLiteral = "Sup";

        System.out.println("--- String Comparison Investigation ---");
        System.out.println("String 1 == String 2: " + (una = pangalawa));
        System.out.println("String equals (sting 2): " + una.equals(pangalawa));
        System.out.println("String 1 == Sting Literal: " + (una = strLiteral));
        System.out.println("string equals(Sting Literal): " + una.equals(strLiteral));
        System.out.println();
        
        int[] originalArray = {10, 20, 30};
        int[] sharedArrayRef = originalArray;
        
        System.out.println("--- Shared Array Reference Investigation ---");
        System.out.println("Before modification - sharedArrayRef[0]: " + sharedArrayRef[0]);
        
        originalArray[0] = 99;
        
        System.out.println("After modifying originalArray[0] to 99:");
        System.out.println("sharedArrayRef[0]: " + sharedArrayRef[0]);
    }
    
}
