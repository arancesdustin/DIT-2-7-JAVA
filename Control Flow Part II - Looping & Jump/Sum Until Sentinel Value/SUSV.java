package susv;

/*@author aranc */

        import java.util.Scanner;

public class SUSV {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        
        System.out.println("Enter int to add to the total. Enter -1 to stop.");
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        while (input != -1) {

            total += input;
            
            System.out.print("Enter next integer: ");
            input = scanner.nextInt();
        }

        System.out.println("\n--- Final Result ---");
        System.out.println("The final total is: " + total);

        scanner.close();
    }
    
}
