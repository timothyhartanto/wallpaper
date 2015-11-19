package com.example.proto.wallpaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Wallpaper extends AppCompatActivity implements View.OnClickListener {

    ImageView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        display = (ImageView)findViewById(R.id.iv);
        ImageView image1 = (ImageView)findViewById(R.id.iv1);
        ImageView image2 = (ImageView)findViewById(R.id.iv2);
        ImageView image3 = (ImageView)findViewById(R.id.iv3);
        ImageView image4 = (ImageView)findViewById(R.id.iv4);

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.iv1:
                display.setImageResource(R.drawable.image1);
                break;
            case R.id.iv2:
                display.setImageResource(R.drawable.image2);
                break;
            case R.id.iv3:
                display.setImageResource(R.drawable.image3);
                break;
            case R.id.iv4:
                display.setImageResource(R.drawable.image4);
                break;
        }
    }
}
