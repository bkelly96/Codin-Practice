import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HexaProf {


    public  static List<String> hexProf(){

         List newList = new ArrayList<>();

         newList.add("cheese");
         newList.add(123);

         return newList;
    }

     public static int sumOfUnique(int[] nums) {

         Map<Integer, Integer> countMap = new HashMap<>();

         for (int n : nums) {
             countMap.put(n, countMap.getOrDefault(n, 0) + 1);
         }

         int sum = 0;
         for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
             if (entry.getValue() == 1) {
                 sum += entry.getKey();
             }
         }
         return sum;
     }

    public static void main(String[] args) {

        List answer = new ArrayList<>();
                answer = hexProf();

        System.out.println("Count = " + answer);
        System.out.println(sumOfUnique(new int[]{1, 2, 3, 4, 5, 5}));       // 10
        System.out.println(sumOfUnique(new int[]{9, 15, 12, 9, 10, 15, 9})); // 22
        System.out.println(sumOfUnique(new int[]{1, 2, 1, 2}));              // 0
    }

}


