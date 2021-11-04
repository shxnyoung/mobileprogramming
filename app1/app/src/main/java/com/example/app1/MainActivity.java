package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//      xml에 정의되어있는 view(widget)을 찾아서 주소를 text1 변수에 저장
        TextView text1 = (TextView)findViewById(R.id.text1);
//      setText로 문자열을 바꿈 -> AVD에서 hi라고 출력됨
        text1.setText("hi");
    }
}


