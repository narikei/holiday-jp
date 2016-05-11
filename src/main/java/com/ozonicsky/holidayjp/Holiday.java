package com.ozonicsky.holidayjp;

import java.util.Calendar;

public class Holiday {

    private String name;
    private boolean isHoliday = false;
    private boolean isHappyMonday = false;

    public Holiday(Calendar calendar) {
        super();

        HolidayJp holiday = HolidayJp.get(calendar);
        if (holiday == null) {
            return;
        }

        this.name = holiday.getHolidayName();
        this.isHoliday = true;
        this.isHappyMonday = holiday.isHappyMonday();
    }

    public String getName() {
        return this.name;
    }

    public boolean isHoliday() {
        return this.isHoliday;
    }

    public boolean isHappyMonday() {
        return this.isHappyMonday;
    }
}
