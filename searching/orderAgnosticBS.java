// This is used when we don't know whether the sorted array is acsending or descending. 
package searching;
import java.util.*;

public class orderAgnosticBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1={3, 7, 9, 14, 19, 22, 27, 33, 35, 38};
        int[] arr2={91, 87, 75, 68, 63, 55, 49, 42, 30};
        System.out.println("\nEnter the number you want to find");
        int target = sc.nextInt();

        int idx1 = searching(arr1, target);
        int idx2 = searching(arr2, target);

        if (idx1==-1) {
            System.out.println("Number is not present in Array 1");
        }
        else{
            System.out.println("Number is present at index "+idx1+" of Array 1");
        }
        if (idx2==-1) {
            System.out.println("Number is not present in Array 2");
        }
        else{
            System.out.println("Number is present at index "+idx2+" of Array 2");
        }
        sc.close();

    }
    public static int searching(int[] arr,int target ){
        int start=0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;
            if (target==arr[mid]) {
                return mid;
            }
            //Now we have condition for ascending or descnding o array
            if (isAsc) {
                if (target>arr[mid]) {
                    start = mid +1;
                }
                else{
                    end = mid -1;
                }
            }
            else {
                if (target<arr[mid]) {
                    start = mid+1;
                }
                else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}

