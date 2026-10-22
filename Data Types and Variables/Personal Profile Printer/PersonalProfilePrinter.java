package personal.profile.printer;

/*@author aranc */
public class PersonalProfilePrinter {
    public static void main(String[] args) {
        int age = 20;
        double height = 1.75;
        char initial = 'D';
        boolean student = true;
        
        String fullName = "Dustin L. Arances";
        
        System.out.println("--- Personal Profile ---");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Middle Initial: " + initial);
        System.out.println("Student Status: " + student);
        
    }
    
}
