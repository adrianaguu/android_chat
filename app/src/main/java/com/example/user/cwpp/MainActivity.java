package com.example.user.cwpp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button) findViewById(R.id.button6);
        one.setOnClickListener(this);
        two = (Button) findViewById(R.id.button3);
        two.setOnClickListener(this);
        three = (Button) findViewById(R.id.button5);
        three.setOnClickListener(this);
        four = (Button) findViewById(R.id.button7);
        four.setOnClickListener(this);
        five = (Button) findViewById(R.id.button8);
        one.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button6:
                Intent intent1 = new Intent(this,ScrollingActivity1.class);
                startActivity(intent1);
                break;
            case R.id.button3:
                Intent intent5 = new Intent(this,ScrollingActivity2.class);
                startActivity(intent5);
                break;
            case R.id.button5:
                Intent intent2 = new Intent(this,ScrollingActivity3.class);
                startActivity(intent2);
                break;
            case R.id.button7:
                Intent intent3 = new Intent(this,ScrollingActivity4.class);
                startActivity(intent3);
                break;
            case R.id.button8:
                Intent intent4 = new Intent(this,ScrollingActivity.class);
                startActivity(intent4);
                break;

            default:
                break;
        }
    }
}
