package com.example.proto.wallpaper;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * Created by Proto on 12/12/2015.
 */
public class Imgone extends Activity implements View.OnTouchListener{

    // set drawable id
    //int[]drawable = {R.drawable.image1, R.drawable.image2};

    ScrollView scrollView;
    LinearLayout linearLayout;
    float prevY, currentY = 0;
    int i = 1;

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.imgone);

        scrollView = (ScrollView)findViewById(R.id.scrollView1);
        linearLayout = (LinearLayout)findViewById(R.id.linearLayout1);

        scrollView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        prevY = event.getY();

                        break;
                    case MotionEvent.ACTION_UP:
                        currentY = event.getY();
                        // swipe down
                        if(prevY <= currentY){
                            if(i > 1){
                                i--;
                                scrollImg();
                            }
                            else{
                                linearLayout.removeAllViews();
                                ImageView img = new ImageView(Imgone.this);
                                img.setImageResource(getResources().getIdentifier("image1", "drawable", getPackageName()));
                                img.setAdjustViewBounds(true);
                                linearLayout.addView(img);
                            }
                        }
                        //swipe up
                        else{
                            if(i < 11){
                                i++;
                                scrollImg();
                            }
                            else{
                                linearLayout.removeAllViews();
                                ImageView img = new ImageView(Imgone.this);
                                img.setImageResource(getResources().getIdentifier("image11", "drawable", getPackageName()));
                                img.setAdjustViewBounds(true);
                                linearLayout.addView(img);
                            }
                        }
                        return true;
                }
                return false;
            }
        });
    }

    protected void scrollImg(){
        linearLayout.removeAllViews();
        ImageView img = new ImageView(Imgone.this);
        img.setImageResource(getResources().getIdentifier("image" + i, "drawable", getPackageName()));
        img.setAdjustViewBounds(true);
        linearLayout.addView(img);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
