import java.util.*;

class RomanNumerals {
    public static int romanToInt(String s) {

        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;
        int i = 0;

        while (i < s.length()) {
            // Look ahead to next character
            if (i + 1 < s.length() && values.get(s.charAt(i)) < values.get(s.charAt(i + 1))) {
                total += values.get(s.charAt(i + 1)) - values.get(s.charAt(i));
                i += 2; // skip both
            } else {
                total += values.get(s.charAt(i));
                i++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));      // 3
        System.out.println(romanToInt("LVIII"));    // 58
        System.out.println(romanToInt("MCMXCIV"));  // 1994
    }
}