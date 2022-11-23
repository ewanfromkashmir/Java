public class TestArray
{
    public static void main(String[] args)
    {
        // Initialising integer variable sum to 0
        int sum = 0;

        // Initialising double float average to 0.0
        double average = 0.0;

        // Creating and initialising array of integers numbers
        int[] numbers = {12, 3, 4, 6, 1, 2, 9, 11, 18, 0};

        // Summing the elements of the list numbers using a for loop and assigning the result to sum
        for (int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
        }

        // Calculating mean and assigning to average variable
        average = ((double) sum / ((double) numbers.length));

        // Printing the sum and mean
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + average);
    }
}
