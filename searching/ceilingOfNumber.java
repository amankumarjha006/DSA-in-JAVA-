// Ceiling of number finds the smallest number whic is equal or greater than the target.
package searching;
import java.util.*;

public class ceilingOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {3, 7, 9, 14, 19, 22, 27, 33, 35, 38};
        int[] arr2 = {91, 87, 75, 68, 63, 55, 49, 42, 30};
        System.out.println("Enter the target:");
        int target = sc.nextInt();

        int idx1 = searching(arr1, target);
        int idx2 = searching(arr2, target);
        System.out.println("The smallest element which is greater or equal to target in Array 1 is "+arr1[idx1]+" at index "+idx1);
        System.out.println("The smallest element which is greater or equal to target in Array 2 is "+arr2[idx2]+" at index "+idx2);
        sc.close();
    }
    public static int searching(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start +(end-start)/2;
            if (target>arr[mid]) {
                start = mid+1;
            }
            if (isAsc) { 
                if(target > arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
                
            }
            else{
                if(target < arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return start;//when the condition for while loop breaks the start>=end which will give the smallest number greater than target
    }
}
