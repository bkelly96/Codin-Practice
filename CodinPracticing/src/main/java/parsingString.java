import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class parsingString {

    private static final Logger logger = LogManager.getLogger(ReverseMode.class.getName());

    public static void main(String args[]) throws ParseException {
        Scanner in = new Scanner(System.in);
        DateFormat formatter = new SimpleDateFormat("HH:mm");
        String duration = in.next();

        Date date = formatter.parse(duration);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);

        int totalMin = hour * 60 + minute;

        logger.info(totalMin);

    }


}
