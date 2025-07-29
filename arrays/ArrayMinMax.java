package arrays;
import java.util.*;
public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = max(arr);
        int min = min(arr);
        System.out.println("You entered: " + Arrays.toString(arr));
        System.out.println("Minimum element in the array: " + min);
        System.out.println("Maximum element in the array: " + max);
        sc.close();
    }
    static int max(int[] arr) {
        int max = arr[0];// Initialize max with the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];// Update max if current element is greater
            }
        }
        return max;
    }
    static int min(int[] arr) {
        int min = arr[0];// Initialize min with the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];// Update min if current element is smaller
            }
        }
        return min;
    }
}
