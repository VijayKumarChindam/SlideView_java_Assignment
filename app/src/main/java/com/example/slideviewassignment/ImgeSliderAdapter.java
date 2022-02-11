package com.example.slideviewassignment;

import android.content.Context;
import android.hardware.lights.LightState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImgeSliderAdapter extends RecyclerView.Adapter<ImgeSliderAdapter.ViewHolder> {
    public Context context;
    public List<DataSlide> dataslide;

    public ImgeSliderAdapter(Context context, List<DataSlide> dataslide) {
        this.context = context;
        this.dataslide = dataslide;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.image_slide,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int imgslide=dataslide.get(position).getImgeUrl();
        String txtslide=dataslide.get(position).getText();
        holder.Setdata(imgslide,txtslide);


    }

    @Override
    public int getItemCount() {
        return dataslide.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.Slide_imageview);
            textView=itemView.findViewById(R.id.Slide_textview);
        }

        public void Setdata(int imgslide, String txtslide) {
            imageView.setImageResource(imgslide);
            textView.setText(txtslide);
        }
    }
}
