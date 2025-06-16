//to print fibbonacci series upto n terms
package recursion;

public class recursion_05 {
    public static void printFib(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        printFib(b, c, n-1); //nhere b will become a nd c will become b
    }
    public static void main(String[] args) {
        int a= 1; 
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n = 10;
        printFib(a, b, n-2);//n-2 is used because a and b re already printed
    }
}
