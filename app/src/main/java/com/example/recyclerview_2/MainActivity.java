package com.example.recyclerview_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<planet_model> planetModels=new ArrayList<>();
    int[] planet_images={R.drawable.mercury,R.drawable.venus,R.drawable.eath,R.drawable.mars,R.drawable.jupiter,R.drawable.uranus,R.drawable.saturn,R.drawable.neptune};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.mrecycler_view);

        setupplanetsmodal();
        planet_adapter adapter= new planet_adapter(this,planetModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    private  void setupplanetsmodal()
    {
        String[] planet_names=getResources().getStringArray(R.array.planets);
        String[] planet_description=getResources().getStringArray(R.array.description);

        for(int i=0;i<planet_names.length;i++)
        {
            planetModels.add(new planet_model(planet_names[i],planet_description[i],planet_images[i]));
        }

    }
}