import java.util.ArrayList;

public class WeekCalendar {

    private ArrayList<Day> weekdays;

    public WeekCalendar() {
        for (int i = 0; i < 7; i++) {
            Day day = new Day();
            weekdays.add(day);
        }
    }

}
