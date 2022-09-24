package com.example.recyclerview_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class planet_adapter extends RecyclerView.Adapter<planet_adapter.MyViewHolder> {
    Context context;
    ArrayList<planet_model> planetModels;


    public planet_adapter(Context context, ArrayList<planet_model> planetModels){
        this.context=context;
        this.planetModels=planetModels;

    }

    @NonNull
    @Override
    public planet_adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.recycler_view_row,parent,false);

        return new planet_adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull planet_adapter.MyViewHolder holder, int position) {
        holder.pname.setText(planetModels.get(position).getPlanet_name());
        holder.pdes.setText(planetModels.get(position).getPlanet_description());
        holder.imageView.setImageResource(planetModels.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return planetModels.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        //grabbing the views from our recycler _view_row layoutfile
        //kinnda  aoncrate method

        ImageView imageView;
        TextView pname,pdes;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            pname=itemView.findViewById(R.id.textView);
            pdes=itemView.findViewById(R.id.textView2);

        }
    }
}
