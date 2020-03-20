package com.yang.algorithm.day18;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangguojun01 on 2020/3/20.
 */
public class Solution {

    public boolean wordPattern(String pattern, String str) {
        if ((pattern == null || "" .equals(pattern)) && (str == null || "" .equals(str))) {
            return true;
        }
        if ((pattern == null || "" .equals(pattern)) || (str == null || "" .equals(str))) {
            return false;
        }
        Map<String, String> stringMap = new HashMap<>();
        char[] chars = pattern.toCharArray();
        String[] strings = str.split(" ");
        if (chars.length != strings.length) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (stringMap.containsKey(String.valueOf(chars[i]))) {
                if (!stringMap.get(String.valueOf(chars[i])).equals(strings[i])) {
                    return false;
                }
            } else if (stringMap.values().contains(strings[i])) {
                return false;
            } else {
                stringMap.put(String.valueOf(chars[i]), strings[i]);
            }
        }
        return true;
    }

}
