package simple.grade.classifier;

/*@author aranc */
public class SimpleGradeClassifier {
    public static void main(String[] args) {
        int score = 90;
        
        System.out.println("Test Score: " + score);
        
        if (score >= 75){
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
    
}
