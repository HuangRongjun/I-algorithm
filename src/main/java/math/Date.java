package math;

/**
 * Created by iCrazyTeam on 2017/2/19.
 */
public class Date {
    public int value;

    public Date(int month, int day, int year) {
        value = year * 512 + month * 32 + day;
    }

    public int month() {
        return (value / 32) % 16;
    }

    public int day() {
        return value % 32;
    }

    public int year() {
        return value / 512;
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s", month(), day(), year());
    }

}
