package com.example.recyclerview_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String planet_name=getIntent().getStringExtra("Name");
        String planet_description=getIntent().getStringExtra("Description");
        int image=getIntent().getIntExtra("Image",0);


        TextView p_name= findViewById(R.id.name);
        TextView p_des=findViewById(R.id.des);
        ImageView p_image=findViewById(R.id.img);

        p_name.setText(planet_name);
        p_des.setText(planet_description);
        p_image.setImageResource(image);


    }
}