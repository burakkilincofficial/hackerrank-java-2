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
public class Regex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    public String pattern = "((\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])\\.){3}(\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])";
}