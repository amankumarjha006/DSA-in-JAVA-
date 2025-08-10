package sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr1 = {12, 5, 8, 19, 1, 33, 7};
        int[] arr2 = {25, 78, 1, 4, 3, 9};
        int ans1 = Sort(arr1);
        int ans2 = Sort(arr2);

        System.out.println("\nSorted Array 1: "+ Arrays.toString(arr1));
        System.out.println(ans1+" Swaps occured");
        System.out.println("Sorted Array 2: "+ Arrays.toString(arr2));
        System.out.println(ans2+" Swaps occured");
    }

    static int Sort(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j]<arr[j-1]) {
                    swap(arr, j, j-1);
                    count++;
                }
                // Break if j is !smaller than j-1 because then array is sorted
                else{
                    break;
                }
            }
        }
        return count;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
