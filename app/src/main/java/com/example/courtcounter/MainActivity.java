package com.example.courtcounter;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scorea = 0, scoreb = 0;

    void display(){
        TextView quantityTextViewa = (TextView) findViewById(R.id.team_a_score);
        TextView quantityTextViewb = (TextView) findViewById(R.id.team_b_score);
        quantityTextViewa.setText("" + scorea);
        quantityTextViewb.setText("" + scoreb);
    }
    public void aplus3(View view){
        scorea += 3;
        display();
    }
    public void aplus2(View view){
        scorea += 2;
        display();
    }
    public void aplus1(View view){
        scorea += 1;
        display();
    }
    public void bplus3(View view){
        scoreb += 3;
        display();
    }
    public void bplus2(View view){
        scoreb += 2;
        display();
    }
    public void bplus1(View view){
        scoreb += 1;
        display();
    }
    public void reset(View view) {
     	EditText A = (EditText) findViewById(R.id.team_a_name);
        EditText B = (EditText) findViewById(R.id.team_b_name);
        String s = "";
        if(scoreb > scorea){
            s = B.getText().toString() + " beats " + A.getText().toString() + " by " + (scoreb - scorea) + " points!";
        } else if(scorea > scoreb){
            s = A.getText().toString() + " beats " + B.getText().toString() + " by " + (scorea - scoreb) + " points!";
        } else{
            s = "It's a TIE!!";
        }
        Toast.makeText(view.getContext(), s, Toast.LENGTH_SHORT).show();
        scorea = 0;
        scoreb = 0;
        display();
    }
}
