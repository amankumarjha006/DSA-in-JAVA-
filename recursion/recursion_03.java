//to print the sum of natural numbers upto n numbers
package recursion;

public class recursion_03 {
    public static void printSum(int i, int n, int sum){//i denotes the natural number, n denotes the number limit
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);

    }
    public static void main(String[] args) {
        printSum(1, 10,0);//the numbers will start from 1 and will go up to 10 and the sum is initialised with 0
    }
}
