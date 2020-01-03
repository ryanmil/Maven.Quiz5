package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> substr = new LinkedHashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                substr.add(string.substring(i, j));
            }
        }
        return substr.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] substr1 = getAllSubstrings(string1);
        List<String> substr2 = Arrays.asList(getAllSubstrings(string2));
        List<String> common = new ArrayList<>();
        for (String s : substr1) {
            if (substr2.contains(s)) {
                common.add(s);
            }
        }
        return common.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] common = getCommonSubstrings(string1, string2);
        String largest = "";
        for (String s : common) {
            if (s.length() > largest.length()) {
                largest = s;
            }
        }
        return largest;
    }
}
