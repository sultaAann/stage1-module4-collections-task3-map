package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> res = new HashMap<>();
        for (Map.Entry<Integer, String> els : sourceMap.entrySet()) {
            res.put(els.getValue(), els.getKey());
        }
        return res;
    }
}
