package searching;

public class min$max2D{
    public static void main(String[] args) {
        int[][]arr= {
            {54,45,67},
            {23,67,41,88},
            {34,97,21},
            {75,49},
        };
        int[] max= max(arr);
        int[] min= min(arr);
        System.out.println("The largest element of the array is " + max[0] + " at position (" + max[1] + ", " + max[2] + ")");
        System.out.println("The smallest element of the array is " + min[0] + " at position (" + min[1] + ", " + min[2] + ")");
    }
    public static int[] min(int[][] arr){
        int min = arr[0][0];
        int minRow= 0;
        int minCol= 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]<arr[0][0]) {
                    min=arr[i][j];
                    minRow=i;
                    minCol=j;
                }
            }
        }
        return new int[]{min, minRow,minCol};
    }

    public static int[] max(int[][] arr){
        int max = arr[0][0];
        int maxRow=0;
        int maxCol= 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max) {
                    max=arr[i][j];
                    maxRow=i;
                    maxCol=j;
                }
            }
        }
        return new int[]{max, maxRow, maxCol};
    }
}
