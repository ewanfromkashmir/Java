import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLists
{
    public static void main(String[] args)
    {
        // Creating an array of Strings users for demonstration purposes
        String[] users = new String[10];
        users[0] = "Ewan";
        users[1] = "Macy";

        // Declaring an ArrayList list1
        ArrayList<String> list1 = new ArrayList<>();

        // Adding elements to ArrayList list1
        list1.add("Ewan");
        list1.add("Macy");
        list1.add("Oscar");

        // Creating a copy list1a of list1
        ArrayList<String> list1a = list1;

        // Printing both list1 and list1a
        System.out.println(list1);
        System.out.println(list1a);

        // Adding another element to list1
        list1.add("Donovan");

        // Printing an empty line
        System.out.println();

        // Printing both list1 and list1a once more
        System.out.println(list1);
        System.out.println(list1a);

        // Declaring a LinkedList list2
        LinkedList<String> list2 = new LinkedList<>();
    }
}
