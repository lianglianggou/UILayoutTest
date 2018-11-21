package com.example.uilayouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UILayoutTest extends AppCompatActivity {
    TextView show;
    Button bn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uilayout_test);
        show=(TextView)findViewById(R.id.text1);
        bn=(Button)findViewById(R.id.button1);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setText("%");
            }
        });
        bn=(Button)findViewById(R.id.button2);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setText("点击ce");
            }
        });
        bn=(Button)findViewById(R.id.button3);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("c");
                //show.setText("点击3");
            }
        });bn=(Button)findViewById(R.id.button4);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=show.getText().toString();
                a=a.substring(0,a.length()-1);
                show.setText(a);
                //show.setText(show.getText());
                //show.setText("点击del");
            }
        });bn=(Button)findViewById(R.id.button5);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("/");
                //show.setText("/");
            }
        });bn=(Button)findViewById(R.id.button6);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setText("点击1");
            }
        });bn=(Button)findViewById(R.id.button7);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("7");
                ///show.setText("7");
            }
        });bn=(Button)findViewById(R.id.button8);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("8");
                //show.setText("8");
            }
        });bn=(Button)findViewById(R.id.button9);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("9");
                //show.setText("9");
            }
        });bn=(Button)findViewById(R.id.button10);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("*");
                //show.setText("*");
            }
        });bn=(Button)findViewById(R.id.button11);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setText("4");
            }
        });bn=(Button)findViewById(R.id.button12);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("4");
                //show.setText("4");
            }
        });bn=(Button)findViewById(R.id.button13);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("5");
                //show.setText("5");
            }
        });bn=(Button)findViewById(R.id.button14);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("6");
                //show.setText("6");
            }
        });bn=(Button)findViewById(R.id.button15);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("-");
                //show.setText("-");
            }
        });bn=(Button)findViewById(R.id.button16);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setText("1");
            }
        });bn=(Button)findViewById(R.id.button17);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("1");
            }
        });bn=(Button)findViewById(R.id.button18);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("2");
                //show.setText("2");
            }
        });bn=(Button)findViewById(R.id.button19);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("3");
                //show.setText("3");
            }
        });bn=(Button)findViewById(R.id.button20);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("+");
                //show.setText("+");
            }
        });bn=(Button)findViewById(R.id.button21);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setText("ce");
            }
        });bn=(Button)findViewById(R.id.button22);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setText("0");
            }
        });bn=(Button)findViewById(R.id.button23);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("0");
                //show.setText("0");
            }
        });bn=(Button)findViewById(R.id.button24);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append(".");
                //show.setText(".");
            }
        });bn=(Button)findViewById(R.id.button25);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.append("=");
                //show.setText("=");
            }
        });






















    }

}
