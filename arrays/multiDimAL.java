package arrays;
import java.util.*;;
public class multiDimAL {
    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> multiDimensionalList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sub-lists you want to add to the ArrayList:");
        int n = sc.nextInt();

        for(int i =0; i<n;i++){
            multiDimensionalList.add(new ArrayList<>());
        }
        System.out.println("Enter " + n + " elements for each sub-array:");
        for(int i =0; i<n;i++){
           for(int j=0; j<n; j++){
            multiDimensionalList.get(i).add(sc.nextInt());
            }
        }
        System.out.println(multiDimensionalList);
        sc.close();
    }
}   

