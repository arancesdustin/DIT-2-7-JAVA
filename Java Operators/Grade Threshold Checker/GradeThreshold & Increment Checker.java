package grade.threshold.checker;

/*@author aranc */
public class GradeThresholdChecker {
    public static void main(String[] args) {
    double average = 82.5;
        int absences = 2;

     boolean Eligible = (average >= 75 && absences <= 3) || (average >= 90);

        System.out.println("Student Details:");
        System.out.println("Average Grade: " + average);
        System.out.println("Absences: " + absences);
        System.out.println("-----------------------------------");

        if (Eligible) {
            System.out.println("Status: PASS[cite: 3]");
            System.out.println("Reasoning: The student achieved an average of "
                    + "75 or higher with fewer than 3 absences, or achieved an "
                    + "average of 90 or higher regardless of absences.");
        } else {
            System.out.println("Status: FAIL[cite: 3]");
            System.out.println("Reasoning: The student did not meet the "
                    + "requirement of having an average >= 75 with <= 3 absences, "
                    + "nor did they reach an average of 90 or higher.");
        }
    }
}
