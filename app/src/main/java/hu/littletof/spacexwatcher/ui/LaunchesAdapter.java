package hu.littletof.spacexwatcher.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import hu.littletof.spacexwatcher.R;
import hu.littletof.spacexwatcher.model.ILaunch;

public class LaunchesAdapter<L extends ILaunch> extends RecyclerView.Adapter<LaunchesAdapter.LaunchViewHolder> {
    private List<L> launches;

    public static class LaunchViewHolder extends RecyclerView.ViewHolder {
        public TextView missionName;


        public LaunchViewHolder(View v) {
            super(v);
            missionName = v.findViewById(R.id.mission_name);
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
        holder.missionName.setText(launches.get(position).getMissionName());

    }

    @Override
    public int getItemCount() {
        return launches.size();
    }
}
