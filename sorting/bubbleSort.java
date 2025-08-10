package sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {12, 5, 8, 19, 1, 33, 7};
        int[] arr2 = {25, 3, 17, 4, 29, 9, 14};
        
        int ans1 = Sort(arr1);
        int ans2 = Sort(arr2);

        System.out.println("\nSorted Array 1: "+ Arrays.toString(arr1));
        System.out.println(ans1+" Swaps occured");
        System.out.println("\nSorted Array 2: "+ Arrays.toString(arr2));
        System.out.println(ans2+" Swaps occured");
    }

    public static int Sort(int[]arr){
        int count=0;
        boolean swapped = false;
        // Run the loop n-1 times
        for (int i = 0; i < arr.length; i++) {
            // For each step, max value will come at the end of array
            // We do not need to check the sorted part of the array hence, j will run till arr.length-i
            for (int j = 1; j < arr.length-i; j++) {
                // Swap if the  value is smaller than the previous value
                if (arr[j]<arr[j-1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                    count++;// Counts the number of swaps occured
                }

                // If the swap did not occur on a particular value of i then that means the array is sorted and we can end the program
                if (!swapped) {
                    break;
                }
            }
        }
        return count;
    }
}
