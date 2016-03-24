package com.devam03.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Portfolio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        Button btn = (Button)findViewById(R.id.button);
        Button btn2 = (Button)findViewById(R.id.button2);
        Button btn3 = (Button)findViewById(R.id.button3);
        Button btn4 = (Button)findViewById(R.id.button4);
        Button btn5 = (Button)findViewById(R.id.button5);
        Button btn6 = (Button)findViewById(R.id.button6);

        assert btn != null;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Portfolio.this, "This Button Will Launch Spotify Streamer App", Toast.LENGTH_LONG).show();
            }
        });

        assert btn2 != null;
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Portfolio.this, "This Button Will Launch Scores App", Toast.LENGTH_LONG).show();
            }
        });

        assert btn3 != null;
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Portfolio.this, "This Button Will Launch Library App", Toast.LENGTH_LONG).show();
            }
        });

        assert btn4 != null;
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Portfolio.this, "This Button Will Launch Build It Bigger", Toast.LENGTH_LONG).show();
            }
        });

        assert btn5 != null;
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Portfolio.this, "This Button Will Launch XYZ Reader App", Toast.LENGTH_LONG).show();
            }
        });

        assert btn6 != null;
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Portfolio.this, "This Button Will My Launch Capstone App", Toast.LENGTH_LONG).show();
            }
        });
    }
}
