import java.util.HashMap;

public class HashMapConsecutiveIntegers {

        public static int lengthOfLongestSubstring(String s) {

            HashMap<Character, Integer> answer = new HashMap<>();
            int left = 0;
            int max = 0;

            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);

                if(answer.containsKey(c) && answer.get(c) >= left){
                    left = answer.get(c) + 1;
                }

                answer.put(c, right);

                max = Math.max(max, right - left + 1);
            }

            return max;
        }
    public static void main(String[] args) {

        int answer = lengthOfLongestSubstring("asddssdleeoeispac");

        System.out.println(answer);
    }
}
