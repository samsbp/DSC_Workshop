package com.codesprint.dsc_workshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstactivity);
        t1=(TextView)findViewById(R.id.textView);
        b1=(Button)findViewById(R.id.count);

        b2=(Button) findViewById(R.id.toast);

        b3=(Button) findViewById(R.id.random);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(t1.getText().toString());
                a=a+1;
                t1.setText(String.valueOf(a));

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,t1.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        final Intent i =new Intent(this,secondactivity.class);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("text",Integer.parseInt(t1.getText().toString()));
                startActivity(i);

            }
        });




    }
}
