/*
 * Copyright (c) Burak KILINC 2021-2021. All rights reserved.
 */

package questions.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * To find duplicate words with regex
 *
 * @author burak kilinc
 * @since 2021-09-30
 */
public class Regex2DuplicateWords {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        Pattern p = Pattern.compile(regex, Pattern.MULTILINE + Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }

}
