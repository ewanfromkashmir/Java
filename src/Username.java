import java.util.Scanner;

public class Username
{
    public static void main(String[] args)
    {
        String username;
        Scanner reader = new Scanner(System.in);

        do
        {
            System.out.print("Enter Username: ");
            username = reader.nextLine();
        }
        while (username.isEmpty());

        String password;
        int counter = 0;

        while ((username.toLowerCase().equals("admin")) && (counter < 3))
        {
            System.out.print("Enter Password: ");
            reader = new Scanner(System.in);
            password = reader.nextLine();

            if (password.equals("PaSSword!!!"))
            {
                System.out.println();
                System.out.println("Access Granted.");
                return;
            }

            else
            {
                System.out.println();
                System.out.println("Access Denied.");
                counter++;
                System.out.println((3 - counter) + " attempts remaining." );
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("System locked. Please contact an administrator.");





    }
}
