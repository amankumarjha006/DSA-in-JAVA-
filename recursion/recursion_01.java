// for printing the numbers from 5 to 0 using recursion
package recursion;


public class recursion_01 {

    // This method prints numbers from n to 1 using recursion
    public static void printNumb(int n) {
        if (n == 0) {
            return;  // Base case: stop when n reaches 0
        }
        System.out.println(n);  // Print the current number
        printNumb(n - 1);       // Recursive call
    }

    // Main method: the entry point of the program
    public static void main(String[] args) {
        int n = 5;
        printNumb(n);  // Call the recursive method
    }
}
