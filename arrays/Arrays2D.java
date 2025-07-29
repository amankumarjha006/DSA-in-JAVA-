package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] arr = new int [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for a 3x3 matrix:");
        for(int i=0; i<3; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        } 
        System.out.println("\nYou entered:");
        for(int i=0; i<3; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        } 
        System.out.println("\nUsing Arrays.toString() to print each row:");
        for(int i= 0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i])); // Print each row of the 2D array
        }
        sc.close();

    }

}
