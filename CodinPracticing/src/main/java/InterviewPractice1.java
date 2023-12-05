import java.util.Scanner;

class InterviewPractice1 {

    Scanner scanner = new Scanner(System.in);

    public int[] twoSum(int[] nums, int target) {

        //iterate through the array comparing the first numbers to the second
        //if target is reached, break, else continue
        // nested for loop, I need to take each number through the array entirely

        for(int i = 0; i< nums.length; i++){
            for(int j = 1; j< nums.length; j++){
                if(target == nums[i] + nums[j] && i != j){
                    int[] ans = new int[]{i,j};
                    return ans;
                }
            }
        }

        return nums;
    }
}