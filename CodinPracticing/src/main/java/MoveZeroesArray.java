public class MoveZeroesArray {

    public static int[] moveZeroes(int[] nums) {
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, 22, 0, 31, 0, 400, 0, 1};

        int[] answer = moveZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
