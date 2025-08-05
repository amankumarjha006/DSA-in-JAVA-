package searching;
import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-12,-10,-8,-6,-4,-2,0,2,4,6,8,10,12};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want to find:");
        int target = sc.nextInt();

        int ans = searching(arr, target);
        if (ans==-1) {
            System.out.println("Number is not in the array");
        }
        else{
            System.out.println("Number is present at the index "+ ans);
        }

        sc.close();
    }
    public static int searching(int[]arr, int target ){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;
            if (target>arr[mid]) {
                start=mid+1;
            }
            else if (target<arr[mid]) {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
