package arrays;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        // Creating an array list to store some integers
        ArrayList<Integer> list= new ArrayList<>();
        // Adding elements to the array list
        list.add(10);
        list.add(18);
        list.add(123);
        list.add(45);
        list.add(20);
        list.add(234);
        //printing the array list
        System.out.println("ArrayList: " + list);

        //updating thr array list
        list.get(2); // Accessing the element at index 2
        list.set(2, 100); // Updating the element at index 2
        list.remove(3); // Removing the element at index 3
        System.out.println("Updated ArrayList: " + list);

        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add to the ArrayList:");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt()); // Adding user input to the ArrayList
        }
        System.out.println("\nArrayList after user input: " + list);
        sc.close();

    }
}
