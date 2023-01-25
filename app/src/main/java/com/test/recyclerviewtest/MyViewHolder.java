package com.test.recyclerviewtest;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView tv;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        tv = itemView.findViewById(R.id.text1);
    }
}
