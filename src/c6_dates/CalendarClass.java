package c6_dates;

import java.util.Calendar;
import java.util.Date;

/*
1. We assign the Date d1 to the Calendar instance c.
2. We use Calendar's SUNDAY field to determine whether, for our JVM, SUNDAY
is considered to be the first day of the week. (In some locales, MONDAY is the
first day of the week.) The Calendar class provides similar fields for days of
the week, months, the day of the month, the day of the year, and so on.
3. We use the DAY_OF_WEEK field to find out the day of the week that the
trillionth millisecond falls on.
4. So far we've used setter and getter methods that should be intuitive to figure
out. Now we're going to use Calendar's add() method. This very
powerful method lets you add or subtract units of time appropriate for
whichever Calendar field you specify. For instance:
    c.add(Calendar.HOUR, -4);           // subtract 4 hours from c's value
    c.add(Calendar.YEAR, 2);            // add 2 years to c's value
    c.add(Calendar.DAY_OF_WEEK, -2);    // subtract two days from
                                        // c's value
5. Convert c's value back to an instance of Date.
*/

public class CalendarClass {

    public static void main(String[] args) {
        Date d1 = new Date(1000000000000L);
        System.out.println("1st date " + d1.toString());
        Calendar c = Calendar.getInstance();
        c.setTime(d1); // #1
        if (Calendar.SUNDAY == c.getFirstDayOfWeek()) // #2
        {
            System.out.println("Sunday is the first day of the week");
        }
        System.out.println("trillionth milli day of week is "
                + c.get(Calendar.DAY_OF_WEEK)); // #3
        c.add(Calendar.MONTH, 1); // #4
        Date d2 = c.getTime(); // #5
        System.out.println("new date " + d2.toString());
        
        //roll method
        //assume c is Sep 08 2001
        c.setTime(d1);
        c.roll(Calendar.MONTH, 5); // notice the year in the output
        Date d4 = c.getTime();
        System.out.println("\nnew date " + d4.toString() );
    }
}
