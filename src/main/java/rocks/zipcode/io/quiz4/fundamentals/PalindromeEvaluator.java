package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] substr = StringEvaluator.getAllSubstrings(string);
        List<String> palindromes = new ArrayList<>();

        for (String s : substr) {
            if (isPalindrome(s)) {
                palindromes.add(s);
            }
        }
        return palindromes.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder(string);
        return builder.reverse().toString();
    }
}
