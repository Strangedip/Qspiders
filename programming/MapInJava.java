import java.util.HashMap;
import java.util.*;

public class MapInJava {
    public static void main(String[] args) {

        // Hashmap
        HashMap<Integer,String> h = new HashMap<>();
        h.put(1, "one");
        h.put(2, "two");
        h.put(3, "three");
        h.put(null, "three");
        System.out.println(h);

        LinkedHashMap t = new LinkedHashMap<>();
        t.put(1, "one");
        t.put(2, "two");
        t.put(3, "three");
        t.put(null, "three");
        System.out.println(t);

    }
}
