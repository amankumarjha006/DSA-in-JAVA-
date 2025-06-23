package recursion;

public class recursion_10 {
    // Wrapper class to store first and last indices
    static class Indices {
        int first = -1;
        int last = -1;
    }

    public static void main(String[] args) {
        String str = "hello world";
        char target = 'l';

        Indices result = new Indices();
        findOccurrences(str, target, 0, result);

        if (result.first != -1) {
            System.out.println("First occurrence of '" + target + "' is at index: " + result.first);
            System.out.println("Last occurrence of '" + target + "' is at index: " + result.last);
        } else {
            System.out.println("Character '" + target + "' not found in the string.");
        }
    }

    // Recursive method to find first and last occurrence
    public static void findOccurrences(String str, char ch, int index, Indices result) {
        // Base case: end of string
        if (index == str.length()) {
            return;
        }

        // If current character matches the target
        if (str.charAt(index) == ch) {
            if (result.first == -1) {
                result.first = index; // first time we see the character
            }
            result.last = index; // keep updating for last occurrence
        }

        // Recursive call
        findOccurrences(str, ch, index + 1, result);
    }
}

