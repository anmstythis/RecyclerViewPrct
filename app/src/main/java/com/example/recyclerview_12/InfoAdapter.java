package com.example.recyclerview_12;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.ViewHolder> {
//    private final LayoutInflater inflater;
    private final List<Info> infoList;

    private Context context;

    InfoAdapter(Context context, List<Info> infoList)
    {
        this.context = context;
        this.infoList = infoList;
    }

    @Override
    public InfoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InfoAdapter.ViewHolder holder, int position) {
        Info info = infoList.get(position);
        holder.flagView.setImageResource(info.getFlagResource());
        holder.nameView.setText(info.getName());
        holder.capitalView.setText(info.getCapital());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), InfoActivity.class);
            intent.putExtra("country_data", info.getName());
            intent.putExtra("capital_data", info.getCapital());
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return infoList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;
        final TextView nameView, capitalView;
        ViewHolder(View view)
        {
            super(view);
            flagView = view.findViewById(R.id.flag);
            nameView = view.findViewById(R.id.name);
            capitalView = view.findViewById(R.id.capital);
        }
    }
}
