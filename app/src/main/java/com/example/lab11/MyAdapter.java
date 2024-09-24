package com.example.lab11;

import android.content.Context;
import android.view.LayoutInflater;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.lab11.model.MyChat;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<MyChat> values;
    private Context context;    // หมายถึง MainActivity context ที่ส่งมาตอนเรียกใช้ MyAdapter

    // constructor ของ MyAdapter ทำหน้าที่นำค่าที่ได้รับมาตอนถูกสร้างที่ MainActivity มาเก็บไว้ที่ global variables
    public MyAdapter(List<MyChat> values, Context context) {
        this.values = values;
        this.context = context;
    }

    // INNER class ViewHolder คือชิ้นส่วนแต่ละอันที่จะแสดงข้อมูลอาหาร 1 อย่าง
    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgView;
        public TextView txtHeader;
        public TextView txtFooter;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            imgView = (ImageView) v.findViewById(R.id.icon);
            txtHeader = (TextView) v.findViewById(R.id.firstLine);
            txtFooter = (TextView) v.findViewById(R.id.secondLine);
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // เมื่อมีการ bind ViewHolder เข้ากับ RecyclerView ให้กำหนดค่าที่ ImageView และ 2 TextView เป็นภาพ ชื่อ และราคาอาหาร
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        final MyChat myChat = values.get(position);
        holder.txtHeader.setText(myChat.getFriend_name());
        holder.txtFooter.setText(myChat.getFriend_phone_number());

        // ใช้ Glide ในการแสดงภาพบน ImageView ซึ่งอาจจะใช้ Picasso แทนก็ได้
        Glide.with(context)
                .load(myChat.getFriend_image())
                .into(holder.imgView);

        holder.imgView.setOnClickListener(v -> {
            Intent intent = new Intent(context, Detail_Activity.class);
            intent.putExtra("name", myChat.getFriend_name());
            intent.putExtra("image", myChat.getFriend_image());
            intent.putExtra("tel", myChat.getFriend_phone_number());
            intent.putExtra("DOB", myChat.getFriend_dob());
            intent.putExtra("address", myChat.getFriend_address());
            intent.putExtra("STD_ID", myChat.getFriend_stdid());

            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }
}
