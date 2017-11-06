package com.aoss.bossmvp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by YoBo on 2017/11/6.
 */

public class MvpAdapter extends RecyclerView.Adapter<MvpAdapter.MvpHolder> {


    private Context context;
    private List<String> urlList;

    public MvpAdapter(Context context, List<String> list) {
        this.urlList = list;
        this.context = context;
    }

    @Override
    public MvpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MvpHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item, parent, false));
    }

    @Override
    public void onBindViewHolder(MvpHolder holder, int position) {

        Glide.with(context).load(urlList.get(position)).into(holder.iv);
        holder.tv.setText(position + "==" + urlList.get(position));
    }

    @Override
    public int getItemCount() {
        return urlList.size();
    }

    class MvpHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv;

        MvpHolder(View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.main_item_iv);
            tv = itemView.findViewById(R.id.main_item_tv);
        }


    }
}
