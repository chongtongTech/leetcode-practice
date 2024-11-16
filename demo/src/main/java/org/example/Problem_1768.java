package org.example;

/**
 * @author chongtong
 * @version 1.0.0
 * @className Problem_1768.java
 * @description 1768. 交替合并字符串
 * @createTime 2024年11月16日 0:08
 */
public class Problem_1768 {
    public static String mergeAlternately(String word1, String word2) {
        String result = "";
        int i = word1.length();
        int j = word2.length();
        //边界条件
        int n = 0;
        while (i >= 0 || j >= 0) {
            if (i == 0) {
                result += word2.substring(n);
                return result;
            }
            if (j == 0) {
                result += word1.substring(n);
                return result;
            }
            result += word1.substring(n, n + 1) + word2.substring(n, n + 1);
            n++;
            i--;
            j--;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
        System.out.println(mergeAlternately("", "pq"));
        System.out.println(mergeAlternately("abcd", ""));
    }
}
