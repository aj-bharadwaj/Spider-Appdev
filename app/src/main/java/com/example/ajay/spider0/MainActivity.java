package com.example.ajay.spider0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int r = (int) (Math.random() * 100);
    int MINE = 0;
    LinearLayout bg;
    TextView Mine;
    TextView val;
    TextView shower;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button Rm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mine = (TextView) findViewById(R.id.mine);
        Rm = (Button) findViewById(R.id.Rm);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        Rm = (Button) findViewById(R.id.reset);
        bg = (LinearLayout) findViewById(R.id.bg);
        show(r);
        show2(MINE);

    }


    public void setB1(View view) {
        MINE = MINE + 1;
        show2(MINE);
    }

    public void setB2(View view) {

        MINE = MINE + 2;
        show2(MINE);
    }

    public void setB3(View view) {
        MINE = MINE + 5;
        show2(MINE);
    }

    public void setB4(View view) {
        MINE = MINE + 10;
        show2(MINE);
    }

    public void setRm(View view) {
        MINE = 0;
        r = (int)(Math.random() * 100);
        show2(MINE);
    }

    private void show2(int number) {

        Mine.setText(number);
        if (MINE == r)
            bg.setBackgroundColor(Color.GREEN);
        else
            bg.setBackgroundColor(Color.RED);
    }

    private void show(int number) {
        val.setText(number);
    }
}