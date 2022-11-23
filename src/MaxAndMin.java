import java.util.Random;

public class MaxAndMin
{
    public static void main(String[] args)
    {
        // Declaring array of 10 integers numbers
        int[] numbers = new int[10];

        // Looping through array numbers and populating with random integers in [1, 10]
        for (int i = 0; i < numbers.length; i++)
        {
            Random rand = new Random();
            numbers[i] = rand.nextInt(10) + 1;
        }

        // Printing a line for stylistic purposes
        System.out.println();

        // Declaring and initialising minimum and maximum variables
        // Values are hard-coded here based on parameters of random method earlier
        int minimum = 10;
        int maximum = 1;

        // Looping through the array numbers again
        for (int i = 0; i < numbers.length; i++)
        {
            // If the current element is greater than the maximum, the maximum is updated
            if (numbers[i] > maximum)
            {
                maximum = numbers[i];
            }

            // If the current element is less than the minimum, the minimum is updated
            if (numbers[i] < minimum)
            {
                minimum = numbers[i];
            }
        }

        // Printing both the maximum and minimum values found
        System.out.println("Maximum value: " + maximum);
        System.out.println("Minimum value: " + minimum);
    }
}
