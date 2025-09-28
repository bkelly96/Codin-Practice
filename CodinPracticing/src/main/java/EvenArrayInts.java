class EvenArrayInts {
    public static int findNumbers(int[] nums) {

        int count = 0;
        for(int i = 0; i < nums.length; i++){

            int numInt = nums[i];
            int numString = String.valueOf(nums[i]).length();
            if(numString % 2 == 0){
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {

        int[] x = {31,1,023232,0,1232,1,1};

        int answer =  findNumbers(x);
        System.out.println(answer);
    }
}