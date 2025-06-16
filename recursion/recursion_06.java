//to print the stack height(x**n)
package recursion;

public class recursion_06 {
    public static int stack_height(int x,int n) {
        if (n == 0) {
            return 1;  //if power is zero
        }
        if(x == 0){
            return 0;  //if base is zero
        }
        return x* stack_height(x, n-1);    //as x*x^(n-1)= x^n
    }
    public static void main(String[] args) {
        System.out.println(stack_height(4, 3)); //output: 64
    }
}
