package telenity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueProduct {
    public static String firstUniqueProduct(String[] s) {
        Set<String> targetSet = new HashSet<String>(Arrays.asList(s));
        if(targetSet.size()==s.length || s.length/2== targetSet.size() ){
            return "";
        }
        for (int i = 0; i < s.length; i++) {
            boolean unique = true;
            for (int j = i + 1; j < s.length; j++) {
                if (s[j].equals(s[i])) {
                    s[j] = s[s.length - 1];
                    unique = false;
                    break;
                }
            }
            if (unique) return s[i];
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueProduct(new String[] { "Apple", "Apple", "Bag", "Bag"  }));
    }
}