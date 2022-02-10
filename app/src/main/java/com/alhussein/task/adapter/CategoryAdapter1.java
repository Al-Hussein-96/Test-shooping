package com.alhussein.task.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alhussein.task.R;
import com.alhussein.task.data.Category1;

import java.util.List;

public class CategoryAdapter1 extends RecyclerView.Adapter<CategoryAdapter1.ViewHolder>{
    private List<Category1> data;

    public void setData(List<Category1> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CategoryAdapter1.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ite_category, parent, false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter1.ViewHolder holder, int position) {
        Category1 item = data.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textView_title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_title = itemView.findViewById(R.id.title_category);
        }

        public void bind(Category1 item){
            textView_title.setText(item.getTitle());
        }
    }
}
