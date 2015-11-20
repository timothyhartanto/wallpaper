package com.example.proto.wallpaper;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class Wallpaper extends AppCompatActivity implements View.OnClickListener {

    ImageView display;
    Button btn;
    int theImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        display = (ImageView)findViewById(R.id.iv);
        btn = (Button)findViewById(R.id.btnChange);
        theImage = R.drawable.image1;

        ImageView image1 = (ImageView)findViewById(R.id.iv1);
        ImageView image2 = (ImageView)findViewById(R.id.iv2);
        ImageView image3 = (ImageView)findViewById(R.id.iv3);
        ImageView image4 = (ImageView)findViewById(R.id.iv4);

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        btn.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.iv1:
                display.setImageResource(R.drawable.image1);
                theImage = R.drawable.image1;
            break;
            case R.id.iv2:
                display.setImageResource(R.drawable.image2);
                theImage = R.drawable.image2;
                break;
            case R.id.iv3:
                display.setImageResource(R.drawable.image3);
                theImage = R.drawable.image3;
                break;
            case R.id.iv4:
                display.setImageResource(R.drawable.image4);
                theImage = R.drawable.image4;
                break;
            case R.id.btnChange:
                InputStream input = getResources().openRawResource(theImage);
                Bitmap background = BitmapFactory.decodeStream(input);
                try{
                    getApplicationContext().setWallpaper(background);
                }catch(IOException e){
                    e.printStackTrace();
                }
                break;
        }
    }
}
