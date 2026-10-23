package multi.tier.discount.system;

/*@author aranc */
public class MultiTierDiscountSystem {
    public static void main(String[] args) {
        double purchaseAmount = 500.00; 
        double discountPercentage = 0.0;
        
        if (purchaseAmount >= 200.0) {
            discountPercentage = 0.15;
        } else if (purchaseAmount >= 100.0) {
            discountPercentage = 0.10;
        } else if (purchaseAmount >= 50.0) {
            discountPercentage = 0.05;
        } else {
            discountPercentage = 0.0;
        }
        
        double discountAmount = purchaseAmount * discountPercentage;
        double finalPrice = purchaseAmount - discountAmount;

        System.out.println("Purchase Amount: $" + purchaseAmount);
        System.out.println("Assigned Discount Tier: " + (int)(discountPercentage * 100));
        System.out.println("Final Discounted Price: $" + finalPrice);
    }
    
}
