/*
 * Copyright (c) Burak KILINC 2021-2021. All rights reserved.
 */

package questions.strings;

import java.util.Scanner;

/**
 * TODO Describe this class.
 *
 * @author burak kilinc
 * @since 2021-09-29
 */
public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        java.util.List<String> list = new java.util.ArrayList<>();
        for (int i = 0; i <= s.length() - k; i++) {
            list.add(s.substring(i, i + k));
        }

        java.util.Collections.sort(list);
        smallest = list.get(0);
        largest = list.get(list.size() - 1);

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
