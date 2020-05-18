package hu.littletof.spacexwatcher.ui.launchdetails;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Date;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.R;
import hu.littletof.spacexwatcher.SpaceXWatcherApplication;
import hu.littletof.spacexwatcher.model.OneLaunch;
import hu.littletof.spacexwatcher.model.PastLaunch;
import hu.littletof.spacexwatcher.ui.LaunchesAdapter;
import hu.littletof.spacexwatcher.util.DateHelper;

public class LaunchDetailsActivity extends AppCompatActivity implements LaunchDetailsScreen {
    private FirebaseAnalytics mFirebaseAnalytics;

    @Inject
    public LaunchDetailsPresenter presenter;

    ImageView missionPatch;
    TextView missionName;
    TextView launchSite;
    TextView launchDate;
    TextView launchSuccess;
    TextView description;
    
    ConstraintLayout livePanel;

    int flightNumber;

    public LaunchDetailsActivity() { SpaceXWatcherApplication.injector.inject(this); }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        setContentView(R.layout.activity_launch_details);

        Intent intent = getIntent();
        flightNumber = intent.getIntExtra("flight_number", -1);

        if(flightNumber == -1) {
            Log.d("Error", "Didnt got flightNumber");
            finish();
            return;
        }

        getSupportActionBar().setTitle("Launch details");

        missionPatch = findViewById(R.id.patch_image);
        missionName = findViewById(R.id.mission_name);
        launchSite = findViewById(R.id.launch_site);
        launchDate = findViewById(R.id.launch_date);
        launchSuccess = findViewById(R.id.success);
        description = findViewById(R.id.description);
        livePanel = findViewById(R.id.live_panel);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.getLaunchDetails(flightNumber+"");
    }

    @Override
    public void showLaunchDetails(final OneLaunch l) {
        runOnUiThread(new Runnable() {

            @Override
            public void run() {
                setCommonLaunchInfo(l);
                setTimelineInfo(l);
                if(DateHelper.considerLiveLaunch(l)) {
                    findViewById(R.id.live_panel).setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void setCommonLaunchInfo(OneLaunch l) {
        missionName.setText(l.getFlightNumber() + " - " + l.getMissionName());
        Picasso.get().load(l.getLinks().getMissionPatchSmall()).placeholder(R.drawable.rocket).into(missionPatch);
        launchSite.setText(l.getLaunchSite().getSiteName());
        launchDate.setText(DateHelper.getDateFromUTC(l.getLaunchDateUtc(), "yyyy.MM.dd. HH:mm:ss"));

        if(l.getLaunchSuccess()!=null) {
            launchSuccess.setText(l.getLaunchSuccess()? "Successful launch": "Unsuccessful launch");
        }else{
            launchSuccess.setText("");
        }
        description.setText(l.getDetails());
    }

    private void setTimelineInfo(final OneLaunch l) {
        if(l.getTimeline()==null || l.getTimeline().getLiftoff()==null){return;}

        LinearLayout timeline = findViewById(R.id.timeline);
        timeline.removeAllViews();

        final long start = DateHelper.getDate(l.getLaunchDateUtc()).getTime();

        ArrayList<LiveEventElement> events = new ArrayList<LiveEventElement>(){{
            if(l.getTimeline().getEngineChill()!=null) add(new LiveEventElement("Engine chill", new Date(start+l.getTimeline().getEngineChill()*1000)));
            if(l.getTimeline().getPrelaunchChecks()!=null) add(new LiveEventElement("Pre-launch checks", new Date(start+l.getTimeline().getPrelaunchChecks()*1000)));
            if(l.getTimeline().getGoForLaunch()!=null) add(new LiveEventElement("Go for launch", new Date(start+l.getTimeline().getGoForLaunch()*1000)));
            if(l.getTimeline().getIgnition()!=null) add(new LiveEventElement("Ignition", new Date(start+l.getTimeline().getIgnition()*1000)));
            if(l.getTimeline().getLiftoff()!=null) add(new LiveEventElement("Liftoff", new Date(start+l.getTimeline().getLiftoff()*1000)));
            if(l.getTimeline().getMaxq()!=null) add(new LiveEventElement("Max q", new Date(start+l.getTimeline().getMaxq()*1000)));
            if(l.getTimeline().getStageSep()!=null) add(new LiveEventElement("Stage separation", new Date(start+l.getTimeline().getStageSep()*1000)));
            if(l.getTimeline().getSecondStageIgnition()!=null) add(new LiveEventElement("Second stage ignition", new Date(start+l.getTimeline().getSecondStageIgnition()*1000)));
        }};

        for(int i = 0; i < events.size(); i++) {
            LiveEventElement le = events.get(i);
            le.first = i==0;
            le.last = i == events.size()-1;
            timeline.addView(createTimelineElement(le, timeline));
        }

        timeline.invalidate();
        timeline.requestLayout();

    }

    private View createTimelineElement(LiveEventElement lle, View parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.live_event_item, null);
        ImageView i = v.findViewById(R.id.timeline_icon);

        float diff = i.getTranslationY();

        i.setTranslationY(0f);
        if(lle.first) {
            i.setImageDrawable(getResources().getDrawable(R.drawable.ray_start));
            i.setTranslationY(diff);
        }
        if(lle.last) {
            i.setImageDrawable(getResources().getDrawable(R.drawable.ray_end));
            i.setTranslationY(-diff);
        }
        if(lle.live){
            i.setColorFilter(Color.argb(255, 183, 28, 28));
        }
        if(lle.past){
            i.setColorFilter(Color.argb(255, 180, 180, 180));
        }

        ((TextView)v.findViewById(R.id.time)).setText(DateHelper.getDateFormat(lle.date, "HH:mm:ss"));
        ((TextView)v.findViewById(R.id.event_desc)).setText(lle.eventName);

        return v;
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.detachScreen();
    }
}
