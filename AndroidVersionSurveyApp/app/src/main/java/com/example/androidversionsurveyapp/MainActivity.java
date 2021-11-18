package com.example.androidversionsurveyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View view) {
        RadioButton radio1 = findViewById(R.id.radio1);
        RadioButton radio2 = findViewById(R.id.radio2);
        RadioButton radio3 = findViewById(R.id.radio3);

        ImageView img1 = findViewById(R.id.image1);
//        ImageView img2 = findViewById(R.id.image2);
//        ImageView img3 = findViewById(R.id.image3);

        if (radio1.isChecked()) {
            img1.setImageDrawable(getResources().getDrawable(R.drawable.img2_3_3));
            img1.setVisibility(View.VISIBLE);
//            img1.setVisibility(View.VISIBLE);
//            img2.setVisibility(View.GONE);
//            img3.setVisibility(View.GONE);
        }
        else if (radio2.isChecked()) {
            img1.setImageDrawable(getResources().getDrawable(R.drawable.img4_1));
            img1.setVisibility(View.VISIBLE);
//            img1.setVisibility(View.GONE);
//            img2.setVisibility(View.VISIBLE);
//            img3.setVisibility(View.GONE);
        }
        else if (radio3.isChecked()) {
            img1.setImageDrawable(getResources().getDrawable(R.drawable.img4_4));
            img1.setVisibility(View.VISIBLE);
//            img1.setVisibility(View.GONE);
//            img2.setVisibility(View.GONE);
//            img3.setVisibility(View.VISIBLE);
        }
        else {
            img1.setVisibility(View.GONE);
//            img2.setVisibility(View.GONE);
//            img3.setVisibility(View.GONE);
        }
    }
}