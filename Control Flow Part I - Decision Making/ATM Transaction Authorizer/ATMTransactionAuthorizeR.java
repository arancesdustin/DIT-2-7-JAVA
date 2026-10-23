package atm.transaction.authorize.r;

/*@author aranc */
public class ATMTransactionAuthorizeR {
    public static void main(String[] args) {
        String correctUsername = "Dustin";
        int correctPin = 1234;
        double balance = 7000.00;
        double withdrawalAmount = 400.00;

        String inputUsername = "Dustin";
        int inputPin = 1234;

        if (inputUsername.equals(correctUsername)) {
            if (inputPin == correctPin) {
                
                String tier = "";
                if (balance >= 10000.0) {
                    tier = "Platinum";
                } else if (balance >= 5000.0) {
                    tier = "Gold";
                } else if (balance >= 1000.0) {
                    tier = "Silver";
                } else {
                    tier = "Bronze";
                }
                
                System.out.println("Authentication successful. Account Tier: " + tier);

                boolean isWithinLimit = false;
                double dailyLimit = 0.0;

                double feePercentage = 0.0;
                switch (tier) {
                    case "Platinum":
                        dailyLimit = 2000.0;
                        feePercentage = 0.0;
                        break;
                    case "Gold":
                        dailyLimit = 1000.0;
                        feePercentage = 0.01;
                        break;
                    case "Silver":
                        dailyLimit = 500.0;
                        feePercentage = 0.02;
                        break;
                    case "Bronze":
                    default:
                        dailyLimit = 200.0;
                        feePercentage = 0.03;
                        break;
                }

                if (withdrawalAmount <= dailyLimit) {
                    double fee = withdrawalAmount * feePercentage;
                    double totalDeduction = withdrawalAmount + fee;

                    if (balance >= totalDeduction) {

                        System.out.println("TRANSACTION APPROVED: Successfully withdrew $" + withdrawalAmount + " (Fee: $" + fee + ")");
                    } else {
                        System.out.println("TRANSACTION DENIED: Insufficient balance to cover withdrawal amount plus transaction fee.");
                    }
                } else {
                    System.out.println("TRANSACTION DENIED: Withdrawal amount exceeds the daily limit of $" + dailyLimit + " for " + tier + " tier.");
                }

            } else {
                System.out.println("TRANSACTION DENIED: Incorrect PIN.");
            }
        } else {
            System.out.println("TRANSACTION DENIED: Username not found.");
        }
    }
    
}
