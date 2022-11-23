public class MultiDimArray
{
    public static void main(String[] args)
    {
        // Declaring two-dimensional array of integers numbers
        int[][] numbers = {{1, -2, 3}, {-4, -5, 6}, {7, -8, 9}};

        // Looping through the first dimension of the array
        for (int i = 0; i < numbers.length; i++)
        {
            // Looping through the second dimension of the array
            // Printing each element of the array with a space
            for (int j = 0; j < numbers[i].length; j++)
            {
                System.out.print(numbers[i][j] + " ");
            }

            // Printing an empty line for each row of the array
            System.out.println();
        }
    }

}
