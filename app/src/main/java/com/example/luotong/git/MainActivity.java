package com.example.luotong.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        textView.setText("123");
        test(5,6,7);
        show1("");
    }

    private int test(int a,int b,int c){
        return a + b + c;
    }

    private void show1(String a){

    }
}
