public class Arrays {
    public static void main(String[] args)
    {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Printing all the array elements using a for loop
        for (int i = 0; i < myList.length; i++)
        {
            System.out.println(myList[i] + " ");
        }

        // Printing all the array elements using a for each loop
        for (double i: myList)
        {
            System.out.print(i + " ");
        }
    }
}
