package oop.labor05.models;

public class MyDate {
    private int year, month, day;

    public MyDate(int pYear, int pMonth, int pDay) {
        if (correctDate(pYear, pMonth, pDay)) {
            year = pYear;
            month = pMonth;
            day = pDay;
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public static boolean correctDate(int year, int month, int day) {
        if (year < 0 || year > 10000)
            return false;
        if (month < 1 || month > 12)
            return false;
        int[] days = {31, leapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return !(day < 1 || day > days[month - 1]); //month -1 mivel 1-12 honap es a tomb 0-11 ig van
    }

    public static boolean leapYear(int year) {
        if (year % 10 % 10 == 0) {
            if (year % 400 == 0)
                return true;
            else
                return false;
        } else {
            if (year % 4 == 0)
                return true;
            else
                return false;
        }
    }

    public String toString() {
        return year + " " + month + " " + day + "\n" + "YYYY/MM/DD";
    }

}
