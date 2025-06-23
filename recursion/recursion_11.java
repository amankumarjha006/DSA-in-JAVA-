// to chech if tyhr array is strictly increasing or not
package recursion;

public class recursion_11 {
    public static boolean sortedArray(int array[], int idx){
        if(idx == array.length - 1){
            return true;
            }
        if(array[idx]<array[idx+1]){
           return sortedArray(array, idx+1);//calls itself if the current elements are sorted
        }
        return false;
    }

    public static void main(String[] args) {
        int array[]= {1,2,3,4,5};
        System.out.println(sortedArray(array, 0));
    }
}
