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


    }
}
