package util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtil {

    public static List<String> read() throws IOException {
        String csvFile = "C:/Users/brtiwari/IdeaProjects/Netflix-P/src/netflix-titles.csv";
        List<String> list = new ArrayList<>();

        Scanner sc = new Scanner(new File(csvFile));
        String delimiter = "\n";
        sc.useDelimiter(delimiter);
        while (sc.hasNext()) {
            list.add(sc.next());
        }

        return list;
    }

}

