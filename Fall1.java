package com.example.overallgpa;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fall1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fall1);
        Button Overal = (Button)findViewById(R.id.Overal);
        Overal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Blackboard = "https://help.blackboard.com/Learn/Instructor/Grade/Customize_Grading_Interface/Grading_Schemas";
                Uri webaddress = Uri.parse(Blackboard);
                Intent gotoBlackboard = new Intent(Intent.ACTION_VIEW,webaddress);
                if(gotoBlackboard.resolveActivity(getPackageManager()) !=null){
                    startActivity(gotoBlackboard);
                }
            }
        });
        Button Grades = (Button)findViewById(R.id.Grades);
        Grades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String CollegeBoard ="https://pages.collegeboard.org/how-to-convert-gpa-4.0-scale";
                Uri webaddress =Uri.parse(CollegeBoard);

                Intent gotoCollegeBoard = new Intent(Intent.ACTION_VIEW,webaddress);
                if(gotoCollegeBoard.resolveActivity(getPackageManager())!=null){
                    startActivity(gotoCollegeBoard);
                }
            }
        });
        Button btnAverage = (Button)findViewById(R.id.btnAverage);
        btnAverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText FirstGrade= (EditText)findViewById(R.id.FirstGrade);
                EditText SecondGrade= (EditText)findViewById(R.id.SecondGrade);
                EditText ThirdGrade= (EditText)findViewById(R.id.ThirdGrade);
                EditText FourthGrade= (EditText)findViewById(R.id.FourthGrade);
                EditText FifthGrade= (EditText)findViewById(R.id.FifthGrade);
                EditText Credits =(EditText)findViewById(R.id.Credits);

                TextView Result = (TextView)findViewById(R.id.Result);
                int var1 = Integer.parseInt(FirstGrade.getText().toString());
                int var2 = Integer.parseInt(SecondGrade.getText().toString());
                int var3 = Integer.parseInt(ThirdGrade.getText().toString());
                int var4 = Integer.parseInt(FourthGrade.getText().toString());
                int var5 = Integer.parseInt(FifthGrade.getText().toString());

                int num =Integer.parseInt(Credits.getText().toString());
                int result = (var1 + var2 + var3 + var4 + var5)/num;
                Result.setText(result+"");
            }
        });

        if(getIntent().hasExtra("com.example.overallGPA.SOMETHING")){
            TextView tv=(TextView)findViewById(R.id.TextView  );
            String text = getIntent().getExtras().getString("com.example.overallgpa.SOMETHING");
            tv.setText(text);
            EditText FirstCourseID =(EditText)findViewById(R.id.FirstCourseID);
            EditText SecondCourseID =(EditText)findViewById(R.id.SecondCourseID);
            EditText ThirdCourseID =(EditText)findViewById(R.id.ThirdCourseID);
            EditText FourthCourseID =(EditText)findViewById(R.id.FourthCourseID);
            EditText FifthCourseID =(EditText)findViewById(R.id.FifthCourseID);

        }
    }

}
