/*Cyclic Sort is an in-place, O(n) sorting algorithm that works best when:

1.The array contains numbers from a known range (often 1 to n, or 0 to n-1).

2.All elements are distinct. */


package sorting;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        Sort(arr);

        System.out.println("\nSorted Array : "+ Arrays.toString(arr));

    }
    static void Sort(int[] arr){
        int i = 0;
        while (i<arr.length) {
            // Index should be value of that element-1
            int correctIndex = arr[i]-1;
            //If not then swap to its correct index
            if (arr[i]!=arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else{
            // Move to the next element if current is already sorted
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
