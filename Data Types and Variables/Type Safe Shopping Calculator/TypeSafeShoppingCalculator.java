package type.safe.shopping.calculator;

/*@author aranc */
public class TypeSafeShoppingCalculator {
    public static void main(String[] args) {
        int quantity = 3;
        double unitPrice = 29.05;
        
        String tindahan = "Arances MINIMART";
        
        double totalCost = quantity * unitPrice;
        
        System.out.println("--- Purchase Summary ---");
        System.out.println("Store Name: " + tindahan);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total Cost: $" + totalCost);
    }
    
}
