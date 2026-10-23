package nested.login.validator;

/*@author aranc */
public class NestedLoginValidator {
    public static void main(String[] args) {
        String correctUsername = "lta";
        String correctPassword = "Dustin05";
        boolean isAccountLocked = false;

        String inputUsername = "ltf";
        String inputPassword = "Dustin06";

        if (inputUsername.equals(correctUsername)) {
            
            if (inputPassword.equals(correctPassword)) {
                
                if (!isAccountLocked) {
                    System.out.println("Login successful! Welcome, " + correctUsername + ".");
                } else {

                    System.out.println("Login failed: Your account is locked.");
                }

            } else {

                System.out.println("Login failed: Incorrect password or username.");
            }

        } else {

            System.out.println("Login failed: Incorrect password or username.");
        }
    }
    
}
