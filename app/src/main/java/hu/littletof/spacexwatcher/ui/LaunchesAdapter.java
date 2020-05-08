package hu.littletof.spacexwatcher.ui;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import hu.littletof.spacexwatcher.R;
import hu.littletof.spacexwatcher.model.ILaunch;
import hu.littletof.spacexwatcher.util.DateHelper;

public class LaunchesAdapter<L extends ILaunch> extends RecyclerView.Adapter<LaunchesAdapter.LaunchViewHolder> {
    private List<L> launches;

    public static class LaunchViewHolder extends RecyclerView.ViewHolder {
        public TextView missionName;
        public TextView launchDate;
        public TextView launchPlace;
        public ImageView missionImage;


        public LaunchViewHolder(View v) {
            super(v);
            missionName = v.findViewById(R.id.mission_name);
            missionImage = v.findViewById(R.id.mission_image);
            launchPlace = v.findViewById(R.id.launch_place);
            launchDate = v.findViewById(R.id.launch_date);
        }
    }

    public LaunchesAdapter(List<L> dataset) {
        launches = dataset;
    }

    @Override
    public LaunchesAdapter.LaunchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem_launch, parent, false);

        LaunchViewHolder vh = new LaunchViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(LaunchViewHolder holder, int position) {
        ILaunch launch = launches.get(position);
        holder.missionName.setText(launch.getFlightNumber() + " - " + launch.getMissionName());
        holder.launchPlace.setText("Launch site: " + launch.getLaunchSite().getSiteName());
        holder.launchDate.setText(launch.getTbd()? "TDB" : DateHelper.getDateFromUTC(launch.getLaunchDateUtc(), "yyyy.MM.dd. HH:mm:ss"));

        Picasso.get().load(launch.getLinks().getMissionPatchSmall()).placeholder(R.drawable.rocket).into(holder.missionImage);

    }

    @Override
    public int getItemCount() {
        return launches.size();
    }
}


