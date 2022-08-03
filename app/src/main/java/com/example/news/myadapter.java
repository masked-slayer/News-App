package com.example.news;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myviewholder> {
    private final ArrayList<Model> data;
    Context context;

    public myadapter(ArrayList<Model> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view =  inflater.inflate(R.layout.singlerow, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        final Model temp = data.get(position);

        holder.t1.setText(data.get(position).getHeader());
        holder.t2.setText(data.get(position).getDesc());
//        holder.img1.setImageResource(data.get(position).getImgname());
        Glide.with(context).load(data.get(position).getImageurl()).into(holder.img1);

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = data.get(position).getUrlwebpage();

//                      context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));

//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                i.setData(Uri.parse(url));
//                context.startActivity(i);
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                CustomTabsIntent i = builder.build();
                i.launchUrl(context,Uri.parse(url));



            }
        });
    }
    public void update(ArrayList<Model> updatedata) {
        data.clear();
        data.addAll(updatedata);
        notifyDataSetChanged();
    }
//        holder.img1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context,MainActivity2.class);
//                intent.putExtra("12ad#",temp.getImgname());
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                context.startActivity(intent);
//
//            }
//        });





    @Override
    public int getItemCount() {
        return data.size();
    }
}
