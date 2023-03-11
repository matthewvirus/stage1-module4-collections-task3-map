package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {

    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swappedMap = new HashMap<>();
        sourceMap.forEach((k, v) -> {
            if (swappedMap.containsKey(v)) {
                if (swappedMap.get(v) > k) {
                    swappedMap.put(v, k);
                }
            }
            swappedMap.put(v, k);
        });
        return swappedMap;
    }
}
