package searching;

public class rotationCount {
    public static void main(String[] args) {
        int[] nums1 = {6, 7, 1, 2, 3, 4, 5};
        int[] nums2 = {4, 5, 6, 7, 1, 2, 3};
        int[] nums3 = {5, 6, 7, 1, 2, 3, 4};
        int[] nums4 = {1, 2, 3, 4, 5, 6, 7};
        

        int ans1 = findPivot(nums1) +1;
        int ans2 = findPivot(nums2) +1;
        int ans3 = findPivot(nums3) +1;
        int ans4 = findPivot(nums4) +1;


        System.out.println("Array 1 has been rotated "+ans1+" times");
        System.out.println("Array 2 has been rotated "+ans2+" times");
        System.out.println("Array 3 has been rotated "+ans3+" times");
        System.out.println("Array 4 has been rotated "+ans4+" times");


       
    }
    //For the rotaion count we will find the index of pivot and i+1 will give us number of rotaion
    public static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while (start<=end) {
            int mid = start+(end -start)/2;
            if (mid<end && nums[mid]>nums[mid+1]) {
                return mid;
            }
            if (mid>start && nums[mid]<nums[mid-1]) {
                return mid-1;
            }
            if(nums[mid]<=nums[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
