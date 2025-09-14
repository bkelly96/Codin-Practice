
import java.util.*;

public class CountBeginningAndEndingOnString {

    // Method to count words whose first and last letter are the same
    public static int countWordsSameEnds(String s) {
        if (s == null || s.isEmpty()) return 0;

        String[] words = s.trim().split("\\s+");
        int count = 0;
        for (String w : words) {
            int i = 0, j = w.length() - 1;
            while (i <= j && !Character.isLetter(w.charAt(i))) i++;
            while (j >= i && !Character.isLetter(w.charAt(j))) j--;
            if (i <= j) {
                char a = Character.toLowerCase(w.charAt(i));
                char b = Character.toLowerCase(w.charAt(j));
                if (a == b) count++;
            }
        }
        return count;
    }

    // main method is the entry point of the program
    public static void main(String[] args) {
        String input = "car dragons racecar spaghetti pickle meme Soos";

        int total = countWordsSameEnds(input);
        System.out.println("count is " + total);
    }
}
