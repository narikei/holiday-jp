import com.ozonicsky.holidayjp.Holiday;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class HolidayTest {

    @Test
    public void isHoliday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, 0, 1);
        Holiday holiday = new Holiday(calendar);
        assertEquals(holiday.getName(), "元日");
        assertTrue(holiday.isHoliday());
        assertFalse(holiday.isHappyMonday());
    }

    @Test
    public void isHappyMonday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1973, 3, 30);
        Holiday holiday = new Holiday(calendar);
        assertEquals(holiday.getName(), "天皇誕生日");
        assertTrue(holiday.isHoliday());
        assertTrue(holiday.isHappyMonday());
    }

    @Test
    public void isNotHoliday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 5, 11);
        Holiday holiday = new Holiday(calendar);
        assertNull(holiday.getName());
        assertFalse(holiday.isHoliday());
        assertFalse(holiday.isHappyMonday());
    }

}
