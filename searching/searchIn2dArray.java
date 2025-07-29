package searching;
import java.util.*;

public class searchIn2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]arr= {
            {54,45,67},
            {23,67,41,88},
            {34,97,21},
            {75,49},
        };
        System.out.println("Enter the number that you want to find:");
        int target = sc.nextInt();
        int[] position = findTarget(arr, target);
        System.out.println("The number "+target+" at position "+Arrays.toString(position));
        sc.close();
    }
    public static int[] findTarget(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target==arr[i][j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}