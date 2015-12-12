package com.example.proto.wallpaper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Proto on 12/12/2015.
 */
public class Selection extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId()){
            case R.id.button1:
                i = new Intent("com.example.proto.IMGONE");
                startActivity(i);
                break;
            case R.id.button2:
                i = new Intent("com.example.proto.IMGTWO");
                startActivity(i);
                break;
            case R.id.button3:
                i = new Intent("com.example.proto.IMGTHREE");
                startActivity(i);
                break;
            case R.id.button4:
                i = new Intent("com.example.proto.IMGFOUR");
                startActivity(i);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
