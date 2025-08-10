package sorting;

import java.util.Arrays;

public class selectionSort {
    // Selection sort searches forr greatest number and swapes it to their correct index (also applicable for lowest)
    public static void main(String[] args) {
        int[] arr1 = {12, 5, 8, 19, 1, 33, 7};
        int[] arr2 = {25, 78, 1, 4, 3, 9};
        
        int ans1 = sort(arr1);
        int ans2 = sort(arr2);

        System.out.println("\nSorted Array 1: "+ Arrays.toString(arr1));
        System.out.println(ans1+" Swaps occured");
        System.out.println("Sorted Array 2: "+ Arrays.toString(arr2));
         System.out.println(ans2+" Swaps occured");
    }

    static int sort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1; // After every loop changes the last element
            int max = getMax(arr, 0, last);
            swap(arr, max, last);
            count++;
        }
        return count;
    }

    static int getMax(int[] arr, int start, int end){
        // Search for maximum number in array
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
