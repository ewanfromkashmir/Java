import java.util.Random;

public class Duplicates
{
    public static void main(String[] args)
    {
        // Creating two integer arrays Array1 and Array2
        int[] Array1 = new int[5];
        int[] Array2 = new int[5];

        // Initialising both Array1 and Array2 with random values
        for (int i = 0; i < Array1.length; i++)
        {
            Random rand = new Random();
            Array1[i] = rand.nextInt(20) + 1;
        }

        for (int i = 0; i < Array2.length; i++)
        {
            Random rand = new Random();
            Array2[i] = rand.nextInt(20) + 1;
        }

        // Printing an empty line and message for formatting purposes
        System.out.print("Duplicates: ");

        // Looping through Array1's elements
        for (int i = 0; i < Array1.length; i++)
        {
            // Looping through Array2's elements
            for (int j = 0; j < Array2.length; j++)
            {
                // Comparing the current element of Array1 and Array2 to check for a duplicate
                if (Array1[i] == Array2[j])
                {
                    // Printing any duplicates to the screen
                    System.out.print(Array1[i] + " ");
                }
            }
        }
    }
}
