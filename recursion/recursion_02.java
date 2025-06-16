// for printing number from 1 to 5 using recursion
package recursion;

public class recursion_02 {
    public static void printNumb(int n){
        if(n>=5){
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        printNumb(n);
    }
}
