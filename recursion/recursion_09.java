// to print a revese of a string
package recursion;
import java.util.Scanner;

public class recursion_09 {
    public static void printRev(String str, int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        sc.close();
        printRev(str, str.length()-1);

    }
}
