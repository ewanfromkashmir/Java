import java.util.Scanner;

public class ExistInArray
{
    public static void main(String[] args)
    {
        // Creating and initialising array of integers numbers
        int[] numbers = {1, 2, 3, 4};

        // Creating an integer target, initialised to 0, and a reader instance of the Scanner class
        int target = 0;
        Scanner reader = new Scanner(System.in);

        // Obtaining target integer via user input
        try
        {
            System.out.print("Enter target integer: ");
            target = Integer.parseInt(reader.nextLine());
        }
        catch (NumberFormatException e)
        {
            // Printing an error message and returning in case of an exception
            System.out.println("Error: please enter an integer only.");
            return;
        }

        // Looping through the array of numbers
        for (int i = 0; i < numbers.length; i++)
        {
            // Checking each number in the array against the target number
            if (numbers[i] == target)
            {
                // Printing a Value Found message and returning if the numbers match
                System.out.println("Value " + target + " found in array.");
                return;
            }
        }

        // Printing a Value Not Found message if the end of the program is reached
        System.out.println("Value not found in array.");


    }
}
