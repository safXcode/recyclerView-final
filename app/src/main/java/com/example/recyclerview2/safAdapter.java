package com.example.recyclerview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class safAdapter extends RecyclerView.Adapter<safAdapter.ViewHolder> {
    Context context;
    ArrayList<DataMan> dataToShow;

    public safAdapter(Context context, ArrayList<DataMan> dataToShow) {
        this.context = context;
        this.dataToShow = dataToShow;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.show_data, parent, false);
        ViewHolder viewholder =  new ViewHolder(v);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(dataToShow.get(position).name);
        holder.rollno.setText(Integer.toString(dataToShow.get(position).rollno));
        holder.passyear.setText(Integer.toString(dataToShow.get(position).paasyear));
    }

    @Override
    public int getItemCount() {
        return dataToShow.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, rollno, passyear;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            rollno = itemView.findViewById(R.id.rollno);
            passyear = itemView.findViewById(R.id.passyear);
        }
    }
}
