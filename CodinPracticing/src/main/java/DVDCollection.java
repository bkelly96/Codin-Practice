import java.util.ArrayList;
import java.util.List;

//Explore on LeetCode
class DVDCollection {
    public static int findMaxConsecutiveOnes(int[] nums) {

        int ret = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                temp++;
            } else{
                if(temp > ret){
                    ret = temp;
                }
                temp = 0;
            }
            if(temp > ret){
                ret = temp;
            }
        }
        return ret;
    }

    public static void main(String[] args) {

        int[] x = {1,1,0,0,1,1,1};

        int answer =  findMaxConsecutiveOnes(x);
        System.out.println(answer);
    }
}