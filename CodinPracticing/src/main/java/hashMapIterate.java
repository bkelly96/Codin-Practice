import java.util.HashMap;
import java.util.Map;

public class hashMapIterate  {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("King of Kong", 3);
        map.put("King Kong", 2);
        map.put("Godzilla", 1);

        //iterating through the map
        map.entrySet()
                .stream()
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", value " + entry.getValue()));
    }
}
