/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Millanda_Midterm3;

/**
 *
 * @author 2ndyrGroupA
 */
public class MyDate {
    public static final int MIN_YEAR = 1;
    public static final int MAX_YEAR = 9999;
    public static final int MIN_MONTH = 1;
    public static final int MAX_MONTH = 12;
    public int year;
    public int month;
    public int day;
    public String[] stringMonth = {"January", "February", "March", "April", "May", "June",
        "July", "August", "Septermber", "October", "November", "December"};

    public String[] stringDays = {"Sunday", "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday"};
    public static final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static final int[] leapYearMonthNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid Year, Month, or Day.");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getMonthLastDay(int year, int month) {
        return daysInMonths[month - 1] + (isLeapYear(year) && month == 2 ? 1 : 0);
    }

    public static boolean isValidDate(int year, int month, int day) {

        return (MIN_YEAR <= year && year <= MAX_YEAR)
                && (MIN_MONTH <= month && month <= MAX_MONTH)
                && (1 <= day && day <= getMonthLastDay(year, month));
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return -1;
        }

        int magicCenturyNumber = 6 - 2 * ((year / 100) % 4);

        int lastTwoDigitsOfYear = year % 100;

        int magicYearNumber = lastTwoDigitsOfYear / 4;

        int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];

        int magicDayNumber = day;

        return (magicCenturyNumber + lastTwoDigitsOfYear
                + magicYearNumber + magicMonthNumber + magicDayNumber) % 7;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public void setYear(int year) {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < MIN_MONTH || month > MAX_MONTH) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public void setDay(int day) {

        if (1 > day || day > getMonthLastDay(this.year, this.month)) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }

    @Override
    public String toString() {
        int weekDay = getDayOfWeek(year, month, day);
        return String.format("%1$s %2$d %3$s %4$d", stringDays[weekDay], day, stringMonth[month - 1], year);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (!(other instanceof MyDate)) {
            return false;
        }

        MyDate otherMyDate = (MyDate) other;
        return (this.year == otherMyDate.getYear())
                && (this.month == otherMyDate.getMonth())
                && (this.day == otherMyDate.getDay());
    }

    public MyDate nextDay() {
        int maxDay = getMonthLastDay(year, month);
        if (maxDay == day && MAX_MONTH == month && MAX_YEAR == year) {
            return this;
        }

        if (maxDay == day && MAX_MONTH == month) {
            setDate(year + 1, MIN_MONTH, 1);
            return this;
        }

        if (maxDay == day) {
            setDate(year, month + 1, 1);
            return this;
        }

        setDate(year, month, day + 1);
        return this;
    }

    public MyDate nextMonth() {
        if (MAX_MONTH == month && MAX_YEAR == year) {
            return this;
        }

        int maxDay = (MAX_MONTH == month)
                ? getMonthLastDay(year + 1, MIN_MONTH)
                : getMonthLastDay(year, month + 1);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        if (MAX_MONTH == month) {
            setDate(year + 1, MIN_MONTH, maxDay);
            return this;
        }

        setDate(year, month + 1, maxDay);
        return this;
    }

    public MyDate nextYear() {
        if (MAX_YEAR == year) {
            return this;
        }

        int maxDay = getMonthLastDay(year + 1, month);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        setDate(year + 1, month, maxDay);
        return this;
    }

    public MyDate previousDay() {
        if (1 == day && MIN_MONTH == month && MIN_YEAR == year) {
            return this;
        }

        if (1 == day && MIN_MONTH == month) {
            setDate(year - 1, MAX_MONTH, getMonthLastDay(year - 1, MAX_MONTH));
            return this;
        }

        if (1 == day) {
            setDate(year, month - 1, getMonthLastDay(year, month - 1));
            return this;
        }

        setDate(year, month, --day);
        return this;
    }

    public MyDate previousMonth() {
        if (MIN_MONTH == month && MIN_YEAR == year) {
            return this;
        }

        int maxDay = (MIN_MONTH == month)
                ? getMonthLastDay(year - 1, MAX_MONTH)
                : getMonthLastDay(year, month - 1);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        if (MIN_MONTH == month) {
            setDate(year - 1, MAX_MONTH, maxDay);
            return this;
        }

        setDate(year, month - 1, maxDay);
        return this;
    }

    public MyDate previousYear() {
        if (MIN_MONTH == year) {
            return this;
        }

        int maxDay = getMonthLastDay(year - 1, month);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        setDate(year - 1, month, maxDay);
        return this;
    }
}
