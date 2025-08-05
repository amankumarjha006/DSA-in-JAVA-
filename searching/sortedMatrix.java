package searching;
import java.util.*;

public class sortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println("Enter the target:");
        int target = sc.nextInt();

        System.out.println("The Target is found at index: "+ Arrays.toString(searchMatrix(matrix, target)));
        sc.close();
    }
    // Find the middle element by performing BS in columns
    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target ){
        
        while (cStart<=cEnd) {
            int mid = cStart + (cEnd-cStart)/2;
            if (matrix[row][mid]==target) {
                return new int[]{row,mid};
            }
            if (matrix[row][mid]<target) {
                cStart = mid+1;
            }
            else{
                cEnd = mid-1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] searchMatrix(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows==1) {
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        // Run the loop till there are 2 rows left
        while (rStart<(rEnd-1)) {
            int mid = rStart +(rEnd-rStart)/2;
            if (matrix[mid][cMid]==target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid]<target) {
                rStart=mid;
            }
            else{
                rEnd=mid;
            }
        }

        // Now we have 2 rows
        // Check whether the target in in the middle column of either rows
        if (matrix[rStart][cMid]==target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart+1][cMid]==target) {
            return new int[]{rStart+1, cMid};
        }

        //Search 1st half
        if (cMid - 1 >= 0 && target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        //Search 2nd half
        if (cMid + 1 < cols && target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        //Search 3rd half
        if (cMid - 1 >= 0 && target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        //Search 4th half
        if (cMid + 1 < cols) {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

        return new int[]{-1, -1};

    }
}