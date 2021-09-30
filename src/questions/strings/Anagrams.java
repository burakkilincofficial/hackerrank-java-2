/*
 * Copyright (c) Burak KILINC 2021-2021. All rights reserved.
 */

package questions.strings;

import java.util.Scanner;

/**
 * TODO Describe this class.
 *
 * @author burak kilinc
 * @since 2021-09-30
 */
public class Anagrams {
    static boolean isAnagram(String a, String b) {

        char[] aArray = a.toLowerCase().toCharArray();
        char[] bArray = b.toLowerCase().toCharArray();
        if (a.length() != b.length()) {
            return false;
        } else {
            java.util.Arrays.sort(aArray);
            java.util.Arrays.sort(bArray);
            return java.util.Arrays.equals(aArray, bArray);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
