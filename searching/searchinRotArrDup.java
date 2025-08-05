package searching;

import java.util.Scanner;

public class searchinRotArrDup {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = {4, 5, 6, 6, 7, 0, 1, 2, 2};
        System.out.println("Enter the target:");
        int target = sc.nextInt();


        int pivot = findPivotWithDup(nums);
        //if we did not find the pivot then it means it is not a rotated array and we will apply simple binary search
        if(pivot==-1){
             int ans = searching(nums,target,0,nums.length-1);
             System.out.println("The target is present at index "+ ans);
        }
        if(nums[pivot]==target){
            int ans = pivot;
            System.out.println("The target is present at index "+ ans);
        }
        if(nums[0]>target){
           int ans = searching(nums,target,pivot+1,nums.length-1);
           System.out.println("The target is present at index "+ ans);
        }else{
            int ans = searching(nums,target,0,pivot-1);
            System.out.println("The target is present at index "+ ans);
        }
        sc.close();
    }

    public static int findPivotWithDup(int[] nums){
        int start = 0;
        int end = nums.length -1;

        while(start<=end){
            int mid = start+(end -start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
               return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            //if elements at start,mid,end are equal then just skip those
            if (nums[start]==nums[mid] && nums[end]==nums[mid]) {
                //Skipping these elements
                // But first we will checj if these elements are pivot or not
                if (nums[start]>nums[start+1]) {
                    return start;
                }
                start++;
                if (nums[end]<nums[end-1]) {
                    return end-1;
                }
                end--;
            }
            else if (nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[end]<nums[mid])) {
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static int searching(int[]arr, int target, int start, int end ){

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
