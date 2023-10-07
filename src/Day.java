import java.util.ArrayList;

public class Day {

    private ArrayList<Activity> activities;

    public void addActivities(Activity activity) {
        this.activities.add(activity);
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }
}
