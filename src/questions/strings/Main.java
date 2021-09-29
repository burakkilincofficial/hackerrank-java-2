/*
 * Copyright (c) Burak KILINC 2021-2021. All rights reserved.
 */

package questions.strings;

import java.util.Scanner;

/**
 * TODO Describe this class.
 *
 * @author burak kilinc
 * @since 2021-09-21
 */
public class Main {
    public static void main(String[] args) {
        stringIntroduction();

    }

    /**
     * https://www.hackerrank.com/challenges/java-strings-introduction/problem
     */
    public static void stringIntroduction() {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int aLength = a.length();
        int bLength = b.length();
        System.out.println(aLength + bLength);
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase() + b.substring(1));


    }

}
