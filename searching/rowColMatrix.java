package searching;
import java.util.*;

public class rowColMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        System.out.println("Enter the target:");
        int target = sc.nextInt();

        int[] ans = searchingIn2D(matrix, target);
        if (ans[0]==-1) {
            System.out.println("Target not found!");
        }
        else{
            System.out.println("Target found at index: [" + ans[0] + ", " + ans[1] +"]");
            //System.out.println(Arrays.toString(ans)); You can write this also
        }
        sc.close();
    }

    public static int[] searchingIn2D(int[][] matrix, int target){
        int r= 0;
        int c = matrix[0].length-1;

        while (r<matrix.length && c>= 0) {
            if (matrix[r][c]==target) {
                return new int[]{r,c};
            }
            else if (matrix[r][c]<target) {
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }

}
