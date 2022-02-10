package com.alhussein.task.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alhussein.task.R;
import com.alhussein.task.data.Category1;
import com.alhussein.task.data.Product1;
import com.alhussein.task.data.Profile1;

import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {
    private List<Profile1> data;

    @NonNull
    @Override
    public ProfileAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_profile, parent, false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileAdapter.ViewHolder holder, int position) {
        Profile1 item = data.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<Profile1> profile1List) {
        this.data = profile1List;
        notifyDataSetChanged();

    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView_title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_title = itemView.findViewById(R.id.title_category);
        }

        public void bind(Profile1 item) {
        }
    }
}
