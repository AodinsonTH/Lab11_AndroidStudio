package com.example.lab11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class Detail_Activity extends AppCompatActivity {
    ImageView background;
    String url = "https://www.marthastewart.com/thmb/e_3vMeXZ4DC6EwXeGu74_tdXZpM=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/the-8-paint-color-trends-youre-about-to-see-everywhere-in-2023-3-1222-2000-2814536f561d4241ac89c0d817340218.jpg";
    Button back ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        back = findViewById(R.id.back);
        back.setOnClickListener(v -> {
            Intent back = new Intent(Detail_Activity.this, MainActivity.class);
            startActivity(back);
        });
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String img = intent.getStringExtra("image");
        String tel = intent.getStringExtra("tel");
        String address = intent.getStringExtra("address");
        String DOB = intent.getStringExtra("DOB");
        String STD_ID = intent.getStringExtra("STD_ID");

        background = findViewById(R.id.background);
        Glide.with(this).load(url).into(background);

        ImageView imageView = findViewById(R.id.image);
        Glide.with(this) // Use 'this' for context
                .load(img) // Load image from 'img'
//                    .placeholder(R.drawable.ic_launcher_background)
//                    .error(R.drawable.ic_launcher_background)
                .into(imageView);

        TextView textView = findViewById(R.id.name);
        TextView textView2 = findViewById(R.id.phone_number);
        TextView textView3 = findViewById(R.id.address);
        TextView textView4 = findViewById(R.id.DOB);
        TextView textView5 = findViewById(R.id.STD_ID);
        textView.setText("ชื่อ: " + name); //
        textView2.setText("เบอร์โทร: " + tel);
        textView3.setText("ที่อยู่: " + address);
        textView4.setText("วันเดือนปีเกิด: " + DOB);
        textView5.setText("รหัสนักศึกษา: " + STD_ID);

    }
}