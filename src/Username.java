// Importing module to utilise Scanner class for input
import java.util.Scanner;

public class Username
{
    public static void main(String[] args)
    {
        // Creating a username String and a reader instance of the Scanner class
        String username;
        Scanner reader = new Scanner(System.in);

        // Assigning the user input to the username String, provided the user input is not empty
        // If the user input is empty, the user will be prompted again until a non-empty input is provided
        do
        {
            System.out.print("Enter Username: ");
            username = reader.nextLine();
        }
        while (username.isEmpty());

        // Creating a string password and a variable counter, initialised to 0
        String password;
        int counter = 0;

        // Case where Admin username is entered
        if (username.toLowerCase().equals("admin"))
        {

            // Only proceeding if the counter variable is less than 3
            // If counter is 3 or greater, the loop is exited
            while (counter < 3)
            {
                // Prompting the user for a password
                System.out.print("Enter Password: ");

                // Assigning the user input to the reader variable using the Scanner class
                // Then assigning the user input to the password String
                reader = new Scanner(System.in);
                password = reader.nextLine();

                // Checking the user inputted password against the expected value
                if (password.equals("PaSSword!!!"))
                {
                    // Case where the inputted password is correct
                    // Printing an empty line followed by the Access Granted message
                    System.out.println();
                    System.out.println("Access Granted.");

                    // Returning to end the program
                    return;
                }

                // Case where the inputted password is incorrect
                else
                {
                    // Printing an empty line followed by the Access Denied message
                    System.out.println();
                    System.out.println("Access Denied.");

                    // Incrementing the counter variable
                    counter++;

                    // Printing the Attempts Remaining message followed by an empty line
                    System.out.println((3 - counter) + " Attempts Remaining." );
                    System.out.println();
                }
            }
        }

        // Case where a different username to Admin is entered
        else
        {
            // Prompting the user for a password and storing the input in the password String
            System.out.print("Enter Password: ");
            reader = new Scanner(System.in);
            password = reader.nextLine();

            // Returning to end the program after receiving user input
            return;
        }

        // Case where the counter has reached 3 or more, signalling too many wrong attempts
        // Printing an empty line followed by the System Locked message
        System.out.println();
        System.out.println("System locked. Please contact an administrator.");
    }
}
