// tower of hanoi
package recursion;

public class recursion_08 {
    public static void steps(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }

        steps(n-1, src, dest, helper);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        steps(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 5;
        steps(n, "S", "H","D");

}
}

