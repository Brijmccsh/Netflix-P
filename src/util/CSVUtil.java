package util;

import java.util.ArrayList;
import java.util.List;

public class CSVUtil {
    public static String cleanToken(String str) {
        return str.trim().replaceAll("^\"|\"$", "");
    }
    public static List<String> createTokens(String line) {

        List<String> result = new ArrayList<String>();
        int start = 0;
        boolean inQuotes = false;
        for (int current = 0; current < line.length(); current++) {
            if (line.charAt(current) == '\"')
                inQuotes = !inQuotes;
            else if (line.charAt(current) == ',' && !inQuotes) {
                result.add(cleanToken(line.substring(start, current)));
                start = current + 1;
            }
        }
        result.add(cleanToken(line.substring(start)));
        return result;
    }
}

