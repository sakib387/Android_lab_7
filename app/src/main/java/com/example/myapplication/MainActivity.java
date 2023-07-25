package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView scoreV,questionv;
    private questionLibrary mquestionLibrary=new questionLibrary();
    private Button  btn1,btn2,btn3,btn4;
    private  String mans;
    private  int score=0;
    private  int mquestioNo=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreV=findViewById(R.id.score);
        questionv=findViewById(R.id.question);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        updatequestion();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(btn1.getText()==mans){
                        score=score+1;
                        updateScore(score);
                        updatequestion();
                        Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this,"You are wrong",Toast.LENGTH_SHORT).show();
                        updatequestion();
                    }

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Finished",Toast.LENGTH_SHORT).show();
                }

            }

        });



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(btn2.getText()==mans){
                        score=score+1;
                        updateScore(score);
                        updatequestion();
                        Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this,"You are wrong",Toast.LENGTH_SHORT).show();
                        updatequestion();
                    }

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Finished",Toast.LENGTH_SHORT).show();
                }

            }

        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(btn3.getText()==mans){
                        score=score+1;
                        updateScore(score);
                        updatequestion();
                        Toast.makeText(MainActivity.this,"Correct",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this,"You are wrong",Toast.LENGTH_SHORT).show();
                        updatequestion();
                    }

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"Finished",Toast.LENGTH_SHORT).show();
                }

            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    score=0;
                    questionv.setText("QUESTION:");
                    scoreV.setText("SCORE:");
                    Toast.makeText(MainActivity.this,"Finished",Toast.LENGTH_SHORT).show();


            }

        });

    }
    private void  updatequestion(){
        questionv.setText(mquestionLibrary.getquestion(mquestioNo));
        btn1.setText(mquestionLibrary.getchoice1(mquestioNo));
        btn2.setText(mquestionLibrary.getchoice2(mquestioNo));
        btn3.setText(mquestionLibrary.getchoice3(mquestioNo));
        mans=mquestionLibrary.getans(mquestioNo);mquestioNo++;
    }
    private void updateScore(int point){
        scoreV.setText(("score : "+point));
    }
}