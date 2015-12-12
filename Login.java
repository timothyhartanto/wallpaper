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
public class Login extends Activity implements View.OnClickListener {
    Button btnEnter;
    EditText etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        etPass = (EditText)findViewById(R.id.et_pass);
        btnEnter = (Button)findViewById(R.id.btn_enter);
        btnEnter.setOnClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_enter:
                String pass = etPass.getText().toString();
                if(pass.equals("")) { // enter it with your password
                    Intent i = new Intent("com.example.proto.SELECTION");
                    startActivity(i);
                }
                break;
        }
    }
}
