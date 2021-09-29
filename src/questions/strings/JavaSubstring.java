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
public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.err.println(S.substring(start, end));

    }
}
