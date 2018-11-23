package com.example.uilayouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

import static java.lang.Math.pow;

public class UILayoutTest extends AppCompatActivity{
    TextView show,show1,show2;
    Button bn;
    Stack<Double>  OPND = new Stack<Double>();
    Stack<Character> OPTR = new Stack<Character>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uilayout_test);
        show=(TextView)findViewById(R.id.text1);
        show1=(TextView)findViewById(R.id.text2);
        show2=(TextView)findViewById(R.id.text3);
        show.setMovementMethod(ScrollingMovementMethod.getInstance());
        show1.setMovementMethod(ScrollingMovementMethod.getInstance());
        bn=(Button)findViewById(R.id.button1);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("(");
                show.append("(");
            }
        });
        bn=(Button)findViewById(R.id.button2);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setText("");
                show1.setText("");
                show2.setText("");
                //show.setText("点击ce");
            }
        });
        bn=(Button)findViewById(R.id.button3);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show.setText("");
                show1.setText("");
                show2.setText("");
                //show.setText("点击3");
            }
        });bn=(Button)findViewById(R.id.button4);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("");
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
                show2.setText("/");
                show.append("/");
                //show.setText("/");
            }
        });bn=(Button)findViewById(R.id.button6);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText(")");
                show.append(")");
            }
        });bn=(Button)findViewById(R.id.button7);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("7");
                show.append("7");
                ///show.setText("7");
            }
        });bn=(Button)findViewById(R.id.button8);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("8");
                show.append("8");
                //show.setText("8");
            }
        });bn=(Button)findViewById(R.id.button9);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("9");
                show.append("9");
                //show.setText("9");
            }
        });bn=(Button)findViewById(R.id.button10);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("*");
                show.append("*");
                //show.setText("*");
            }
        });bn=(Button)findViewById(R.id.button11);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=show.getText().toString();
                a=a.substring(0,a.length()-1);
                show.setText(a);
                String a1=show2.getText().toString();

                double b=Double.valueOf(a1);

                String c=String.valueOf(pow(b,2));
                show.append(c);
            }
        });bn=(Button)findViewById(R.id.button12);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("4");
                show.append("4");
                //show.setText("4");
            }
        });bn=(Button)findViewById(R.id.button13);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("5");
                show.append("5");
                //show.setText("5");
            }
        });bn=(Button)findViewById(R.id.button14);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("6");
                show.append("6");
                //show.setText("6");
            }
        });bn=(Button)findViewById(R.id.button15);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("-");
                show.append("-");
                //show.setText("-");
            }
        });bn=(Button)findViewById(R.id.button16);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=show.getText().toString();
                a=a.substring(0,a.length()-1);
                show.setText(a);
                String a1=show2.getText().toString();
                double b=Double.valueOf(a1);
                String c=String.valueOf(pow(b,3));
                show.append(c);
            }
        });bn=(Button)findViewById(R.id.button17);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("1");
                show.append("1");
            }
        });bn=(Button)findViewById(R.id.button18);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("2");
                show.append("2");
                //show.setText("2");
            }
        });bn=(Button)findViewById(R.id.button19);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("3");
                show.append("3");
                //show.setText("3");
            }
        });bn=(Button)findViewById(R.id.button20);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("+");
                show.append("+");
                //show.setText("+");
            }
        });bn=(Button)findViewById(R.id.button21);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=show.getText().toString();
                a=a.substring(0,a.length()-1);
                show.setText(a);
                String a1=show2.getText().toString();
                double b=compute("1/"+a1+"=");
                java.text.DecimalFormat   df   =new   java.text.DecimalFormat("####0.00");

                String c=String.valueOf(df.format(b));
                show.append(c);
            }
        });bn=(Button)findViewById(R.id.button22);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=show.getText().toString();
                a=a.substring(0,a.length()-1);
                show.setText(a);
                String a1=show2.getText().toString();
                show.append("(0-"+a1+")");
            }
        });bn=(Button)findViewById(R.id.button23);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("0");
                show.append("0");
                //show.setText("0");
            }
        });bn=(Button)findViewById(R.id.button24);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText(".");
                show.append(".");
                //show.setText(".");
            }
        });bn=(Button)findViewById(R.id.button25);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show2.setText("=");

                show.append("=");
                String a=show.getText().toString();
                double result=compute(a);
                String s=String.valueOf(result);
                show1.setText("");
                show1.setText(show.getText()+s);
                show.setText(s);
            }
        });

    }
    public double compute(String str){
        char x;
        double a, b, f = 0, z = 0, d = 0;
        double e = 0;
        OPTR.push('=');
        int count=0;
        char c=str.charAt(count++);
        while (c != '=' || OPTR.peek() != '=') {
            if (c != '(' && c != '+' && c != '-' && c != '*' && c != '/' && c != ')'&&c != '=') {
                while (c == '.' || (c >= '0'&&c <= '9')) {
                    if (c >= '0'&&c <= '9') {
                        d = d * 10 + c - 48;
                        c=str.charAt(count++);
                    }
                    else if (c == '.') {
                        c=str.charAt(count++);
                        while (c >= '0'&&c <= '9') {
                            f = f * 10 + c - 48;
                            z--;
                            c=str.charAt(count++);
                        }
                        d = d + f * pow(10, z);
                    }

                }
                OPND.push(d);

                d = 0;
                f = 0;
                z = 0;
            }
            else
                switch (Precede(OPTR.peek(), c)) {
                case '<':OPTR.push(c); c=str.charAt(count++); break;
                case '=':x=OPTR.pop();c=str.charAt(count++); break;
                //case '>':x=OPTR.pop();QUEUE.add((double)x);break;
                    case '>':x=OPTR.pop();a=OPND.pop();b=OPND.pop();OPND.push(Operate(b,x,a));break;
            }

        }

        double result=OPND.peek();
        OPND.clear();
        OPTR.clear();
        return result;
    }
    public char Precede(char a, char b) {
        switch (a) {
            case '+':
                if (b == '+' || b == '-' || b == ')' || b == '=')
                    return '>';
                else
                    return '<';
            case '-':
                if (b == '+' || b == '-' || b == ')' || b == '=')
                    return '>';
                else
                    return '<';
            case '*':
                if (b == '(')
                    return '<';
                else
                    return '>';
            case '/':
                if (b == '(')
                    return '<';
                else
                    return '>';
            case '(':
                if (b == ')')
                    return '=';
                else
                    return '<';
            case ')':
                return '>';
            case '=':
                if (b == '=')
                    return '=';
                else
                    return '<';
        }
        return 'o';
    }
    public double Operate(double a, char ch, double b) {
        switch (ch) {
            case '+':return a + b;
            case '-':return a - b;
            case '*':return a * b;
            case '/':return a / b;
        }
        return 0;
    }
}
