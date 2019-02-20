package com.example.overallgpa;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fall2 extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fall2);
        Button Grade = (Button)findViewById(R.id.Grade);
        Grade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String CollegeBoard = "https://pages.collegeboard.org/how-to-convert-gpa-4.0-scale";
                Uri webaddress =Uri.parse(CollegeBoard);

                Intent gotoCollegeBoard = new Intent(Intent.ACTION_VIEW,webaddress);
                if(gotoCollegeBoard.resolveActivity(getPackageManager())!=null){
                    startActivity(gotoCollegeBoard);
                }
            }
        });
        Button Overall = (Button) findViewById(R.id.Overall);
        Overall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Blackboard = "https://help.blackboard.com/Learn/Instructor/Grade/Customize_Grading_Interface/Grading_Schemas";
                Uri webaddress = Uri.parse(Blackboard);

                Intent gotoBlackboard = new Intent(Intent.ACTION_VIEW,webaddress);
                if(gotoBlackboard.resolveActivity(getPackageManager())!=null){
                    startActivity(gotoBlackboard);
                }
            }
        });

        Button avgbtn = (Button) findViewById(R.id.avgbtn);
        avgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText FirstGrade = (EditText) findViewById(R.id.FirstGrade);
                EditText SecondGrade = (EditText) findViewById(R.id.SecondGrade);
                EditText ThirdGrade = (EditText) findViewById(R.id.ThirdGrade);
                EditText FourthGrade = (EditText) findViewById(R.id.FourthGrade);
                EditText fifthgrade = (EditText) findViewById(R.id.fifthgrade);
                EditText Credits = (EditText) findViewById(R.id.Credits);

                TextView Status = (TextView) findViewById(R.id.Status);

                int var1 = Integer.parseInt(FirstGrade.getText().toString());
                int var2 = Integer.parseInt(SecondGrade.getText().toString());
                int var3 = Integer.parseInt(ThirdGrade.getText().toString());
                int var4 = Integer.parseInt(FourthGrade.getText().toString());
                int var5 = Integer.parseInt(fifthgrade.getText().toString());

                int num = Integer.parseInt(Credits.getText().toString());

                int result = (var1 + var2 + var3 + var4 + var5)/num;
                Status.setText(result+"");


            }
        });

        if(getIntent().hasExtra("com.example.overallgpa.SOMETHING")){

        }
        EditText FirstCourse = (EditText)findViewById(R.id.FirstCourse);
        EditText SecondCourse =(EditText)findViewById(R.id.SecondCourse);
        EditText ThirdCourse = (EditText)findViewById(R.id.ThirdCourse);
        EditText FourthCourse = (EditText)findViewById(R.id.FourthCourse);
        EditText fifthcourse = (EditText)findViewById(R.id.fifthcourse);
    }
}
