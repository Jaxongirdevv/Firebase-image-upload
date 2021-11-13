package com.example.firebaseimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyviewHOlder> {

    Context context;
    ArrayList<Model> modelArrayList;

    public MyAdapter(Context context, ArrayList<Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public MyviewHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recyclerview_item,parent,false);

        return new MyviewHOlder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyviewHOlder holder, int position) {

        Picasso.get().load(modelArrayList.get(position).getImageurl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public static class MyviewHOlder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public MyviewHOlder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageview2);
            textView=itemView.findViewById(R.id.edittext1);
        }
    }
}
