import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
//        int x = 3;
//        int number = 55;
//
//        if (number > 0)
//        {
//            System.out.println("The number is positive!");
//            if (number > x)
//            {
//                System.out.println("The number is larger than x: " + x);
//            }
//        }

        System.out.println("1. Get User");
        System.out.println("2. Add User");
        System.out.println("3. Delete User");
        System.out.println("4. Print User");
        System.out.println("5. Exit Menu");
        System.out.println("");

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter choice: ");

        int entry = 0;
        boolean check = false;

        try
        {
            entry = reader.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Entry not recognised.");
            check = true;
        }

        if (!check)
        {
            switch(entry)
            {
                case 1:
                {
                    System.out.println("Get User");
                    break;
                }

                case 2:
                {
                    System.out.println("Add User");
                    break;
                }

                case 3:
                {
                    System.out.println("Delete User");
                    break;
                }

                case 4:
                {
                    System.out.println("Print User");
                    break;
                }

                case 5:
                {
                    System.out.println("Exit Menu");
                    break;
                }

                default:
                {
                    System.out.println("Entry not recognised");
                }
        }

        }
    }

}