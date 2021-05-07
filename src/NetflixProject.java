import model.Show;
import util.CSVUtil;
import util.FileUtil;
import util.StringToDate;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class NetflixProject {


    public static void main(String[] args) throws IOException {

        List<String> lines = FileUtil.read();

        List<Show> showList = lines.stream().skip(1).map(str -> parseShow(str)).collect(Collectors.toList());

    }

    private static Show parseShow(String str) {

        Show show = new Show();
        try {
            List<String> token = CSVUtil.createTokens(str);

            show.setType(token.get(1));
            show.setCountry(token.get(5));
            show.setListed_in(token.get(10));

            if (!"".equalsIgnoreCase(token.get(6))) {
                show.setDate_added(StringToDate.stringToDate(token.get(6).trim()));
            }

        } catch (Exception e) {
            System.out.println(" Invalid output : " + str);
        }
        return show;

    }
}

