// to move all x at the end of string axbcxxd
package recursion;

public class recursion_12 {
    public static void movex(String str, int idx, int count, String newStr){
        if(idx == str.length()){
            // At the end, add all x's
            for(int i = 0; i < count; i++) {
                newStr += "x";
            }
            System.out.println(newStr);
            return;
        }

        char currch = str.charAt(idx);
        if(currch == 'x'){
            // Don't add to newStr, just increase count
            movex(str, idx + 1, count + 1, newStr);
        } else {
            // Add current character to newStr
            movex(str, idx + 1, count, newStr + currch);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        movex(str, 0, 0,"");
    }
}
