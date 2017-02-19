package math;

import util.StdOut;

/**
 * Created by lancer on 2017/2/19.
 */
public class DateTest {
    public static void main(String[] args){
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);
        Date date = new Date(month,day,year);
        StdOut.println(date);
    }
}
