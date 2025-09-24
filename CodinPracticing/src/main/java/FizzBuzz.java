import java.util.ArrayList;
import java.util.List;

class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List ans = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i  %3 == 0 && i % 5 == 0){
                ans.add("FizzBuzz");
            }
            else if(i % 5 == 0){
                ans.add("Buzz");
            }
            else if(i % 3 == 0){
                ans.add("Fizz");
            }
            else {
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        List answer = new ArrayList();
        answer = fizzBuzz(145);
        System.out.println(answer);      // 3
    }
}