package searching;
import java.util.*;

public class findInMountainArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,3,1};
        int[] arr2 = {0,1,2,4,2,1}; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target");
        int target = sc.nextInt();

        int ans1 = search(arr1,target);
        int ans2 = search(arr2, target);

        if (ans1 != -1) {
            System.out.println("The target of mountain Array 1 is present at "+ ans1);
        }
        else{
            System.out.println("The number is not present in Array 1");
        }
        if (ans2 != -1) {
            System.out.println("The target of mountain Array 2 is present at "+ans2);
        }
        else{
            System.out.println("The number is not present in Array 2");
        }
        sc.close();
    }

    public static int search(int[]arr,int target){
    int peak = peakIndexInarray(arr);
    int firstTry =  searching(arr,target,0, peak);
    if(firstTry!= -1){
        return firstTry;
      }
    else{
        return searching(arr,target,peak+1, arr.length-1);
      }
    }

     public static int peakIndexInarray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //then you are in dec part of array
            //this may be the answer but we still check on the left this is why we are not writing end = mid-1
                end = mid;
            }
            else{
                //you are in the asc part of the array
                start = mid+1;
            }
        }
        // When the loop breaks start==end and it will be our answer as the cases above are finding the maximum number in that array
        return start;//or end
    }

     public static int searching(int[] arr,int target,int start, int end ){
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
