package warehouse.inventory.scanner;

/*@author aranc */

import java.util.Scanner;

public class WarehouseInventoryScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[][] warehouse = {
            {15, 22, -1, 40},
            {8, 3, 50, 12},
            {30, -1, 25, 18}
        };
        
        int choice;
        
        do{
            System.out.println("\n=== Warehouse Inventory Scanner Menu ===");
            System.out.println("1. Total Inventory (Skipping Damaged Shelves)");
            System.out.println("2. Find First Critically Low Shelf");
            System.out.println("3. Simulate Restocking with Input Validation");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int totalInventory = 0;
                    for (int i = 0; i < warehouse.length; i++) {
                        for (int j = 0; j < warehouse[i].length; j++) {
                            if (warehouse[i][j] == -1) {
                                continue;
                            }
                            totalInventory += warehouse[i][j];
                        }
                    }
                    System.out.println("Total valid inventory count: " + totalInventory);
                    break;

                case 2:
                    boolean foundLowShelf = false;
                    int criticallyLowThreshold = 5;
                    for (int i = 0; i < warehouse.length; i++) {
                        for (int j = 0; j < warehouse[i].length; j++) {
                            if (warehouse[i][j] != -1 && warehouse[i][j] < criticallyLowThreshold) {
                                System.out.println("First critically low shelf found at Row " + i + ", Col " + j + " with count: " + warehouse[i][j]);
                                foundLowShelf = true;
                                break;
                            }
                        }
                        if (foundLowShelf) {
                            break;
                        }
                    }
                    if (!foundLowShelf) {
                        System.out.println("No critically low shelves found.");
                    }
                    break;

                case 3:
                    simulateRestocking(scanner);
                    break;

                case 4:
                    System.out.println("Exiting Warehouse Inventory Scanner. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void simulateRestocking(Scanner scanner) {
        System.out.print("Enter quantity to restock (must be greater than 0): ");
        int restockAmount = scanner.nextInt();

        while (restockAmount <= 0) {
            System.out.println("Invalid amount. Restock quantity must be positive.");
            System.out.print("Re-enter quantity to restock: ");
            restockAmount = scanner.nextInt();
        }

        System.out.println("Successfully restocked items by: " + restockAmount);
        return;
    }
}