package com.smart.example;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private Model[] listdata;

    // RecyclerView recyclerView;
    public Adapter(Model[] listdata) {
        this.listdata = listdata;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.cards_layout, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Model myListData = listdata[position];
        holder.name.setText(listdata[position].getNumber());

        if((position % 2 == 0)){
            holder.itemView.setBackgroundColor(Color.RED);
        }else{
            holder.itemView.setBackgroundColor(Color.BLUE);
        }
    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.name = (TextView) itemView.findViewById(R.id.name);
        }
    }

}

