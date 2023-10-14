package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_pt;
    Button btn_mul,btn_div,btn_add,btn_sub;
    Button btn_clr,btn_del,btn_eq;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn_0= (Button) findViewById(R.id.btn_0);
        btn_1= (Button) findViewById(R.id.btn_1);
        btn_2= (Button) findViewById(R.id.btn_2);
        btn_3= (Button) findViewById(R.id.btn_3);
        btn_4= (Button) findViewById(R.id.btn_4);
        btn_5= (Button) findViewById(R.id.btn_5);
        btn_6= (Button) findViewById(R.id.btn_6);
        btn_7= (Button) findViewById(R.id.btn_7);
        btn_8= (Button) findViewById(R.id.btn_8);
        btn_9= (Button) findViewById(R.id.btn_9);
        btn_pt= (Button) findViewById(R.id.btn_pt);
        btn_add= (Button) findViewById(R.id.btn_add);
        btn_sub= (Button) findViewById(R.id.btn_sub);
        btn_mul= (Button) findViewById(R.id.btn_mul);
        btn_div= (Button) findViewById(R.id.btn_div);
        btn_clr= (Button) findViewById(R.id.btn_clr);
        btn_del= (Button) findViewById(R.id.btn_del);
        btn_eq= (Button) findViewById(R.id.btn_eq);
        tv1=(TextView) findViewById(R.id.tv1);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                if(num.equals("0"))return;
                else{
                    tv1.setText(num+"0");
                }
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                if(num.equals("0")) {
                    tv1.setText("1");
                    return;
                }
                tv1.setText(num+"1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                if(num.equals("0")) {
                    tv1.setText("2");
                    return;
                }
                tv1.setText(num+"2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                if(num.equals("0")) {
                    tv1.setText("3");
                    return;
                }
                tv1.setText(num+"3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                if(num.equals("0")) {
                    tv1.setText("4");
                    return;
                }
                tv1.setText(num+"4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                if(num.equals("0")) {
                    tv1.setText("5");
                    return;
                }
                tv1.setText(num+"5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                if(num.equals("0")) {
                    tv1.setText("6");
                    return;
                }
                tv1.setText(num+"6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                if(num.equals("0")) {
                    tv1.setText("7");
                    return;
                }
                tv1.setText(num+"7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                if(num.equals("0")) {
                    tv1.setText("8");
                    return;
                }
                tv1.setText(num+"8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                if(num.equals("0")) {
                    tv1.setText("9");
                    return;
                }
                tv1.setText(num+"9");
            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                if(num.charAt(num.length()-1)=='*')
                    return;
                tv1.setText(num+"*");
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                if(num.charAt(num.length()-1)=='/')
                    return;
                tv1.setText(num+"/");
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                if(num.charAt(num.length()-1)=='-')
                    return;
                tv1.setText(num+"-");
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                if(num.charAt(num.length()-1)=='+')
                    return;
                tv1.setText(num+"+");
            }
        });
        btn_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv1.setText("0");
            }
        });
        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                int len=num.length();
                System.out.println(num+" and "+"length is "+len);
                if(len==1){
                    tv1.setText("0");
                    return;
                }
                System.out.println(num.substring(0,len-1));
                num=num.substring(0,len-1);
                tv1.setText(num);
            }
        });
        btn_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                double result=Calculate.summary(num);

                tv1.setText(Double.toString(result));
            }
        });
        btn_pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=tv1.getText().toString();
                if(num.charAt(num.length()-1)=='.')
                    return;
                tv1.setText(num+".");
            }
        });
    }
}