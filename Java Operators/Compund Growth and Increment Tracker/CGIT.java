package cgit;

/*@author aranc */
public class CGIT {
    public static void main(String[] args) {
        double balance = 1000.0;
        System.out.println("Initial Balance: " + balance);

        balance += 250.0;
        System.out.println("Balance after step 1 (+=): " + balance);

        balance *= 1.10;
        System.out.println("Balance after step 2 (*=): " + balance);

        balance += 500.0;
        System.out.println("Balance after step 3 (+=): " + balance);

        System.out.println();

        int count = 5;
        System.out.println("Testing Postfix (count++):");
        System.out.println("Inside println: " + count++);
        System.out.println("Immediately after: " + count);

        System.out.println("\nTesting Prefix (++count):");
        System.out.println("Inside println: " + ++count);
        System.out.println("Immediately after: " + count);
    }
    
}
