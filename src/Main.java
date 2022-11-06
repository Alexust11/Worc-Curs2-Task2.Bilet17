import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1", 5);
        map.put("2", 6);
        map.put("3", 7);
        map.put("4", 8);
        map.put("5", 9);
        Integer s = 0;
        for (Integer n : map.values()) {
            s = s + n;
        }
        System.out.println(s);
        s = 0;
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();

            s = s + entry.getValue();


        }
        System.out.println(s);

    }
}