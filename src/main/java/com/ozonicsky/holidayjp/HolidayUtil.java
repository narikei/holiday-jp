package com.ozonicsky.holidayjp;

import java.util.Calendar;
import java.util.Date;

public class HolidayUtil {

    public static boolean isHoliday(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return isHoliday(calendar);
    }

    public static boolean isHoliday(Calendar calendar) {
        Holiday holiday = new Holiday(calendar);
        return holiday.isHoliday();
    }

}
