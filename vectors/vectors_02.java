package vectors;
import java.util.Vector;
import java.util.Scanner;

public class vectors_02 {
    public static void getElements(Vector<Integer> vector){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements you want to add to the vector: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Enter element " + (i+1) + ": ");
            int element = sc.nextInt();
            vector.add(element);
        }
        System.out.println("Elements added to the vector: " + vector);
        sc.close();
    }
    public static void main(String[] args) {
        getElements(new Vector<Integer>());
    }
}
