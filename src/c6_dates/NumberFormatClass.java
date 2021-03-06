package c6_dates;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatClass {

    public static void main(String[] args) {
        float f1 = 123.4567f;
        Locale locFR = new Locale("fr"); // France
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locFR);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locFR);
        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(f1));
        }

        //getMaximumFractionDigits(), setMaximumFractionDigits(), parse(), and setParseIntegerOnly()
        f1 = 123.45678f;
        NumberFormat nf = NumberFormat.getInstance();
        System.out.print(nf.getMaximumFractionDigits() + " ");
        System.out.print("\n" + nf.format(f1) + " ");
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(f1) + " ");
        try {
            System.out.println(nf.parse("1234.567"));
            nf.setParseIntegerOnly(true);
            System.out.println(nf.parse("1234.567"));
        } catch (ParseException pe) {
            System.out.println("parse exc");
        }
    }
}
