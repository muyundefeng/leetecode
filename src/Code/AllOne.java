package Code;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lisheng on 17-5-26.
 */
public class AllOne {
    /**
     * Initialize your data structure here.
     */
    Map<String, Integer> map = new HashMap<>();

    public AllOne() {

    }

    /**
     * Inserts a new key <Key> with value 1. Or increments an existing key by 1.
     */
    public void inc(String key) {
        if (map.containsKey(key)) {
            int value = map.get(key);
            map.remove(key);
            map.put(key, value + 1);
        } else {
            map.put(key, 1);
        }
    }

    /**
     * Decrements an existing key by 1. If Key's value is 1, remove it from the data structure.
     */
    public void dec(String key) {
        if (map.containsKey(key)) {
            int value = map.get(key);
            map.remove(key);
            if (value == 1) {
                return;
            }
            map.put(key, value - 1);
        }
    }

    /**
     * Returns one of the keys with maximal value.
     */
    public String getMaxKey() {
        String key = null;
        int vlaue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > vlaue) {
                vlaue = entry.getValue();
                key = entry.getKey();
            }
        }
        return key == null ? "" : key;
    }

    /**
     * Returns one of the keys with Minimal value.
     */
    public String getMinKey() {
        String key = null;
        int vlaue = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < vlaue) {
                vlaue = entry.getValue();
                key = entry.getKey();
            }
        }
        return key == null ? "" : key;
    }

    public static void main(String[] args) {
        AllOne allOne = new AllOne();
        allOne.inc("a");
        allOne.inc("b");
        allOne.inc("b");
        allOne.inc("c");
        allOne.inc("c");
        allOne.inc("c");
        allOne.dec("b");
        allOne.dec("b");
        System.out.println(allOne.getMinKey());
        System.out.println(allOne.getMinKey());
    }
}
