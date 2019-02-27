package com.example.ekarecyclerview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ekarecyclerview.R;
import com.example.ekarecyclerview.models.Resep;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ViewHolder> {

    private List<Resep> resepList;

    public ResepAdapter(List<Resep> resepList) {

        this.resepList = resepList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View filmView = inflater.inflate(R.layout.item_resep, viewGroup, false);

        return new ViewHolder(filmView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Resep resep = resepList.get(i);

        if (resep.getImg() != null) {
            Picasso.get().load(resep.getImg()).into(viewHolder.imageView);
        } else {
            Picasso.get().load(resep.getImg_local()).into(viewHolder.imageView);
        }

        viewHolder.textView.setText(resep.getTitle());
    }

    @Override
    public int getItemCount() {
        return resepList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        TextView descView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_resep_img);
            textView = itemView.findViewById(R.id.item_resep_title);

        }
    }
}