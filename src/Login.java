import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        // Declare string variables
        String userName, password, newPassword;

        // Create a new object
        Scanner inp = new Scanner(System.in);

        // Prompt the user to input variables
        System.out.print(" Enter your username : ");
        userName = inp.nextLine();
        System.out.print(" Enter your password :");
        password = inp.nextLine();

        // Check the information
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print(" Login ");
        } else {
            System.out.print(" Wrong information! ");

        // Check whether the user wish to reset the password
            System.out.println(" Would you like to reset your password ? " +
                    "\n reset password '1' " +
                    "\n do not reset password '2' ");
            int select = inp.nextInt();
            inp.nextLine();

            switch (select) {
                case 1:
                    System.out.print(" Enter new password : ");
                    newPassword = inp.nextLine();

                    if (newPassword.equals("java123")) {
                        System.out.print(" Unfortunately, the new password you entered is the same as your old password. Enter a different password. ");
                    } else {
                        System.out.print(" Congratulations! You've successfully reset your password. ");
                        System.out.print(" Your new password : " + newPassword);
                    }
                    break;
                case 2:
                    System.out.print(" You do not wish to reset your password. ");
                    break;
                default:
                    System.out.println(" Please, enter '1' or '2'.");
            }
        }
    }
}
