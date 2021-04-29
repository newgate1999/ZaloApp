package com.river.zaloapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DanhSachMessageAdapter extends RecyclerView.Adapter<DanhSachMessageAdapter.ViewHolder> {
    private ArrayList<TinNhan> mData;
    private LayoutInflater mInflater;

    DanhSachMessageAdapter(Context context, ArrayList<TinNhan> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_message, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TinNhan s = mData.get(position);
        holder.name.setText(s.getName());
        holder.message.setText(s.getLastMessage());
        holder.avatar.setImageResource(s.getAvatar());
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView message;
        ImageView avatar;

        ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.ten);
            message = itemView.findViewById(R.id.tinNhanCuoi);
            avatar = itemView.findViewById(R.id.anh);
        }

    }

}
