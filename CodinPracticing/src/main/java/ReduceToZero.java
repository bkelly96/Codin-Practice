import java.util.ArrayList;
import java.util.List;

class ReduceToZero {
    public static int numberOfSteps(int num) {
        int x = 0;
        while(num != 0){
            if(num % 2 != 0){
                num -= 1;
                x++;
                continue;
            } else{
                num = num/2;
                x++;
            }
        }

        return x;
    }

    public static void main(String[] args) {

        int x = 133;
        int answer =  numberOfSteps(x);
        System.out.println(answer);
    }
}