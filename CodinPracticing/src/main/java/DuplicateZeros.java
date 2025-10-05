import java.util.Arrays;

class DuplicateZeros {
    public static int[] duplicateZeros(int[] arr) {

        int n = arr.length;
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) zeros++;
        }

        for (int i = n - 1; i >= 0; i--) {
            int newIndex = i + zeros;
            if (newIndex < n) arr[newIndex] = arr[i];

            if (arr[i] == 0) {
                zeros--;
                if (i + zeros < n) {
                    arr[i + zeros] = 0;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        CountOccurrence co = new CountOccurrence();

        int[] input = new int[]{1,0,4,0,2,3,0};
        int[] res = duplicateZeros(input);
        System.out.println(Arrays.toString(res));
    }
}