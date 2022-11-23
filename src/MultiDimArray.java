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

        // Printing some empty lines to differentiate the two versions
        System.out.println();
        System.out.println();

        // Alternative version using the for each loop
        for (int[] columns: numbers)
        {
            for (int integer: columns)
            {
                System.out.print(integer + " ");
            }

            System.out.println();
        }

        // Declaring a three-dimensional array of strings
        String[][][] cube = new String[3][3][3];
    }

}
