package logical;

import java.util.HashMap;
import java.util.Map;

public class logical_test {
    public static void main(String[] args) {
        Map<String, Integer> US = new HashMap<String, Integer>();
        US.put("a",10);
        US.put("b",20);
        US.put("c",30);

        Map<String, Integer> UK = new HashMap<String, Integer>();
        UK.put("a",3);
        UK.put("c",6);
        UK.put("d",3);

        Map<String,Integer>hasil = combine(US,UK);
        System.out.println(hasil);
    }
    public static Map<String, Integer> combine (Map<String, Integer> inp1, Map<String, Integer>inp2){
        for (String key: inp1.keySet()){
            inp2.put(key, inp1.get(key)+inp2.getOrDefault(key,0));
            System.out.println(inp2);
        }
        return inp2;
    }
}