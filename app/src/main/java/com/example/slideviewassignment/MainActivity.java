  package com.example.slideviewassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;
import java.util.List;

  public class MainActivity extends AppCompatActivity {
      RecyclerView recyclerView;
      ImgeSliderAdapter sliderAdapter;
      List<DataSlide> dataSlide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        setAdapter();

    }

      private void setAdapter() {
        recyclerView=findViewById(R.id.recyclerSlide);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,true));
        sliderAdapter=new ImgeSliderAdapter(this,dataSlide);
        recyclerView.setAdapter((sliderAdapter));
        final int interval_time=3000;
          Handler handler=new Handler();
          Runnable runnable=new Runnable() {
              int count =0;
              @Override
              public void run() {
                  if(count<dataSlide.size()){
                      recyclerView.scrollToPosition(count++);
                      handler.postDelayed(this,interval_time);
                      if(count==dataSlide.size()){
                          count=0;
                      }
                  }

              }
          };
          handler.postDelayed(runnable,interval_time);

      }

      private void setData() {
          dataSlide=new ArrayList<>();
          dataSlide.add(new DataSlide(R.drawable.image1,"Image1"));
          dataSlide.add(new DataSlide(R.drawable.image2,"Image2"));
          dataSlide.add(new DataSlide(R.drawable.image3,"Image3"));
          dataSlide.add(new DataSlide(R.drawable.image4,"Image4"));
          dataSlide.add(new DataSlide(R.drawable.image5,"Image5"));
          dataSlide.add(new DataSlide(R.drawable.image6,"Image6"));
          dataSlide.add(new DataSlide(R.drawable.image7,"Image7"));
          dataSlide.add(new DataSlide(R.drawable.image8,"Image8"));

      }

  }