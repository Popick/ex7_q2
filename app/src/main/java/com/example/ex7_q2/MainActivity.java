package com.example.ex7_q2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    RadioButton rb1,rb2,rb3,rb4;
    ConstraintLayout vi;
    Switch swDN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = (RadioButton) findViewById(R.id.radioButton1);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        vi = (ConstraintLayout)findViewById(R.id.bground);
        swDN = (Switch) findViewById(R.id.switch1);

    }


    public void change(View view) {
        if (rb1.isChecked()){
            vi.setBackgroundColor(Color.parseColor("#eb3434"));
        }if (rb2.isChecked()){
            vi.setBackgroundColor(Color.parseColor("#35d44f"));
        }if (rb3.isChecked()){
            vi.setBackgroundColor(Color.parseColor("#3d4bdb"));
        }if (rb4.isChecked()){
            vi.setBackgroundColor(Color.parseColor("#e3dc0b"));
        }
    }

    public void changeRed(View view) {
        if (swDN.isChecked()){ vi.setBackgroundColor(Color.parseColor("#eb3434"));}
    }

    public void changeGreen(View view) {
        if (swDN.isChecked()){ vi.setBackgroundColor(Color.parseColor("#35d44f"));}
    }

    public void changeBlue(View view) {
        if (swDN.isChecked()){ vi.setBackgroundColor(Color.parseColor("#3d4bdb"));}
    }

    public void changeYellow(View view) {
        if (swDN.isChecked()){ vi.setBackgroundColor(Color.parseColor("#e3dc0b"));}
    }
}