package hu.littletof.spacexwatcher.ui.launchdetails;

import java.util.Date;

public class LiveEventElement {
    public LiveEventElement(String eventName, Date date) {
        this.eventName = eventName;
        this.date = date;
    }

    public String eventName;
    public Date date;
    public boolean live;
    public boolean past;
    public boolean first;
    public boolean last;
}
