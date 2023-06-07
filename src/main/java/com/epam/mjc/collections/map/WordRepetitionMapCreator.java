package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        sentence = sentence.replaceAll("[-+.^:,]", "");
        String[] words = sentence.toLowerCase().split(" ");
        Map<String, Integer> res = new HashMap<>();
        for (String str : words) {
            str.trim();
            if (!(str.isEmpty())) {
                if (res.containsKey(str)) {
                    res.put(str, res.get(str) + 1);
                } else {
                    res.put(str, 1);
                }
            }
        }
        return res;
    }
}
