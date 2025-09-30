import java.util.Arrays;

class SquaredSort {
    public static int[] sortedSquares(int[] nums) {


        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        int temp = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] x = {31,1,023232,0,1232,1,1};

        int[] answer =  sortedSquares(x);
        System.out.println(Arrays.toString(answer));
    }
}