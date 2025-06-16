//to find stack height(logn)
package recursion;

public class recursion_07 {
     public static int stack_height(int x,int n) {
        if (n == 0) {
            return 1;  //if power is zero
        }
        if(x == 0){
            return 0;  //if base is zero
        }
        //if n is even
        if(n % 2 == 0){
            return stack_height(x, n / 2) + stack_height(x, n / 2);
        }
        // if n is odd
        else{
            return stack_height(x, n / 2) + stack_height(x, n / 2)*x;
        }
    }
    public static void main(String[] args) {
        System.out.println(stack_height(4, 3)); //output: 25
    }
}
