import java.util.ArrayList;

public class Test_ArrayList
{
    public static void main(String[] args)
    {
        // Creating a generic ArrayList
        ArrayList<String> arlTest = new ArrayList<String>();

        // Printing the size of the ArrayList
        System.out.println("Size of ArrayList at creation: " + arlTest.size());

        // Adding elements to the ArrayList
        arlTest.add("D");
        arlTest.add("U");
        arlTest.add("K");
        arlTest.add("E");

        // Printing the ArrayList once the elements have been added
        System.out.println("List of all elements: " + arlTest);

        // Removing an element from the list and printing the new list
        arlTest.remove("D");
        System.out.println("List of all elements after removing first element: " + arlTest);

        // Removing an element from the list by index and printing again
        arlTest.remove(2);
        System.out.println("List of all elements after removing second element: " + arlTest);

        // Printing size of list having removed two elements
        System.out.println("Size of ArrayList after removing two elements: " + arlTest.size());

        // Checking if the list contains "K" and printing the result
        System.out.println("List contains letter K: " + arlTest.contains("K"));
    }
}
