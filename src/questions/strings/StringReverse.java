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
public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder input1 = new StringBuilder();

        input1.append(A);
        input1.reverse();

        System.out.println(input1.toString().equalsIgnoreCase(A)? "Yes":"No");
    }
}
