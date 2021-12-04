package com.example.tempchange;

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
        EditText input1 = findViewById(R.id.input1);
        Float temp1 = Float.parseFloat(input1.getText().toString());
        Float temp2 = 0.0f;

        if (radio1.isChecked()) { //섭씨
            temp2 = (temp1-32) * 5/9 ;
            input1.setText(temp2.toString());
        }
        else if (radio2.isChecked()) { //화씨씨
           temp2 = temp1 % 9/5 + 32 ;
            input1.setText(temp2.toString());
        }
        else {
            temp2 = 0.0f ;
            input1.setText(temp2.toString());
        }
    }
    public void onButtonReset(View view){
        RadioButton radio1 = findViewById(R.id.radio1);
        RadioButton radio2 = findViewById(R.id.radio2);
        EditText input1 = findViewById(R.id.input1);

        radio1.setChecked(false); //비활성화
        radio2.setChecked(false);
        input1.setText(""); //공백으로
    }
}