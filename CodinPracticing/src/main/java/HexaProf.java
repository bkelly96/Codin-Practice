import java.util.ArrayList;
import java.util.List;

 class HexaProf {


    public  static List<String> hexProf(){

         List newList = new ArrayList<>();

         newList.add("cheese");
         newList.add(123);

         return newList;
    }

    public static void main(String[] args) {

        List answer = new ArrayList<>();
                answer = hexProf();

        System.out.println("Count = " + answer);
    }
}


