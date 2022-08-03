package com.example.news;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder
{
    ImageView img1;
    TextView t1,t2;
    RelativeLayout relativeLayout;
    public myviewholder(@NonNull View itemView) {
        super(itemView);
        img1 = (ImageView)itemView.findViewById(R.id.img1);
        t1 = (TextView)itemView.findViewById(R.id.t1);
        t2 = (TextView)itemView.findViewById(R.id.t2);
        relativeLayout = ( RelativeLayout)itemView.findViewById(R.id.relayout);
    }
}
