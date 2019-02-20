package com.example.overallgpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button FirstFallbtn =(Button)findViewById(R.id.FirstFallbtn);
        FirstFallbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),Fall1.class);
                startIntent.putExtra("com.example.overallgpa.SOMETHING","Fall 1");
                startActivity(startIntent);
            }
        });
        Button SecondFallbtn = (Button)findViewById(R.id.SecondFallbtn);
        SecondFallbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent =new Intent(getApplicationContext(),Fall2.class);
                startIntent.putExtra("com.example.overallgpa.SOMETHING","Fall 2");
                startActivity(startIntent);
            }
        });
        TextView Result = (TextView)findViewById(R.id.Result);
        TextView Status = (TextView)findViewById(R.id.Status);
        TextView cummulator = (TextView)findViewById(R.id.cummulator);
        int numA = Integer.parseInt(Result.getText().toString());
        int numB= Integer.parseInt(Status.getText().toString());

        int major = Integer.parseInt(cummulator.getText().toString());

        int calc = (numA +numB )/major;
        cummulator.setText("calc");


            }
}
