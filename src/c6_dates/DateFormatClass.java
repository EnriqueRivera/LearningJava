package c6_dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatClass {

    public static void main(String[] args) {
        Date d1 = new Date(1000000000000L);
        DateFormat[] dfa = new DateFormat[6];

        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat df : dfa) {
            System.out.println(df.format(d1));
        }

        //parse method
        d1 = new Date(1000000000000L);
        System.out.println("\nd1 = " + d1.toString());
        DateFormat df = DateFormat.getDateInstance(
                DateFormat.SHORT);
        //df = DateFormat.getDateTimeInstance(); //->retain the time
        String s = df.format(d1);
        System.out.println(s);
        try {
            Date d2 = df.parse(s);
            System.out.println("parsed = " + d2.toString());
        } catch (ParseException pe) {
            System.out.println("parse exc");
        }
    }
}
