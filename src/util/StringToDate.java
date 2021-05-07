package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

    public static Date stringToDate(String dateInput){
        Date date = null;
        try{

            SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy");
            date = sdf.parse(dateInput);

        }catch (ParseException exception){
            exception.printStackTrace();
        }


        return  date;
    }

}

