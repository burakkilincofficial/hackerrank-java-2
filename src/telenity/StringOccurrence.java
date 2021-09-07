package telenity;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringOccurrence {
    public static int getOccurrenceCount(String toSearch, InputStream stream) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        int count = 0;
        while (reader.ready()) {
            String line = reader.readLine();
            if (line.contains(toSearch)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        String msg = "Hey! How are you?\nI am good, how about you?\nI am good too.";

        try (InputStream stream = new ByteArrayInputStream(msg.getBytes())) {
            System.out.println(StringOccurrence.getOccurrenceCount("good", stream));
        }
    }
}
