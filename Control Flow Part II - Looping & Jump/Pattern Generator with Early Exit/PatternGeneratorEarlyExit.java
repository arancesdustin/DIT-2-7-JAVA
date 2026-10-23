package pattern.generator.early.exit;

/*@author aranc */
public class PatternGeneratorEarlyExit {
    public static void main(String[] args) {
        int size = 9;

        System.out.println("PGO:");

        for (int i = 1; i <= size; i++) {

            if (i == 3) {
                System.out.println("Row " + i + " skipped.");
                continue;
            }

            for (int j = 1; j <= size; j++) {

                if (j > 3) {
                    break;
                }

                System.out.print("| ");
            }
            
            System.out.println();
        }
    }
    
}
