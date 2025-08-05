package searching;

public class peakInMountainArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,3,1};
        int[] arr2 = {0,1,2,4,2,1};

        int ans1 = peak(arr1);
        int ans2 = peak(arr2);
        System.out.println("The peak element of Array 1 is "+arr1[ans1]+" at index "+ans1);
        System.out.println("The peak element of Array 2 is "+arr2[ans2]+" at index "+ans2);
    }
    public static int peak(int[]arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end) {
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[mid+1]) {
                //this means we are in Dsc part of the array
                end = mid;
                //this can be the possible ans bt we are stil going to check on the left side that is why end!=mid-1
            }
            else{
                //this means that we are in Asc part f the array
                start = mid+1;
            }
        }
        //when the while loop breaks start==end and that will be our peak element
        return start;//or end as they are equal
    }
}
