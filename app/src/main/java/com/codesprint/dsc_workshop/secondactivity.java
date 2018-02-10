package com.codesprint.dsc_workshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by root on 14/10/17.
 */

public class secondactivity extends AppCompatActivity {
    TextView tv,tv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        int n = getIntent().getIntExtra("text",0);
        Random r =new Random();
        int a=r.nextInt(n);
        tv1=(TextView)findViewById(R.id.randtv);
        tv=(TextView)findViewById(R.id.tvrand);
        String st=tv.getText().toString()+String.valueOf(n);
        tv.setText(String.valueOf(st));

        tv1.setText(String.valueOf(a));

    }
}
